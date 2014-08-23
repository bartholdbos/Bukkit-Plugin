package tk.bartbart333.servertools;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class EPlayer extends PlayerEvent{
	
	public EPlayer(Player player) {
		super(player);
	}

	@Override
	public HandlerList getHandlers() {
		return null;
	}
}