package tk.bartbart333.servertools;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener{
	
	private ServerTools servertools;
	
	public EventListener(ServerTools servertools) {
		this.servertools = servertools;
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onJoin(PlayerJoinEvent event){
		servertools.players.add(new EPlayer(event.getPlayer()));
	}
}