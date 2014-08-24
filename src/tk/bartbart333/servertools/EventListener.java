package tk.bartbart333.servertools;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener{
	
	private ServerTools servertools;
	
	public EventListener(ServerTools servertools) {
		this.servertools = servertools;
	}
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onEvent(BlockBreakEvent event){
		event.setCancelled(!handleEvent(event.getPlayer().getName(), event.getEventName()));
	}
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onEvent(BlockDamageEvent event){
		event.setCancelled(!handleEvent(event.getPlayer().getName(), event.getEventName()));
	}
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onEvent(BlockIgniteEvent event){
		if(event.getPlayer() != null){
			event.setCancelled(!handleEvent(event.getPlayer().getName(), event.getEventName()));
		}
	}
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onEvent(BlockPlaceEvent event){
		event.setCancelled(!handleEvent(event.getPlayer().getName(), event.getEventName()));
	}
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onEvent(SignChangeEvent event){
		event.setCancelled(!handleEvent(event.getPlayer().getName(), event.getEventName()));
	}
	
	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onJoin(PlayerJoinEvent event){
		servertools.players.put(event.getPlayer().getName(), new EPlayer(event.getPlayer()));
	}
	
	private boolean handleEvent(String playername, String eventname){
		EPlayer player = servertools.players.get(playername);
		if(player.getPlayer().hasPermission("servertools.bypass." + eventname)){
			return true;
		}else{
			if(player.getLoggedin()){
				return true;
			}else{
				player.getPlayer().sendMessage("You can't do " + eventname);
				return false;
			}
		}
	}
}