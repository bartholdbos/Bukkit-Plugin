package tk.bartbart333.servertools;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class EPlayer extends PlayerEvent{
	
	private boolean loggedin = true;
	
	public EPlayer(Player player) {
		super(player);
	}
	
	public boolean getLoggedin(){
		return loggedin;
	}
	
	@Override
	public HandlerList getHandlers() {
		return null;
	}
}