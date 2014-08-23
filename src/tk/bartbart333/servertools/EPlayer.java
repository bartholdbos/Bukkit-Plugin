package tk.bartbart333.servertools;

import org.bukkit.entity.Player;

public class EPlayer{
	
	private Player player;
	private boolean loggedin = false;
	
	public EPlayer(Player player) {
		this.player = player;
	}
	
	public boolean getLoggedin(){
		return loggedin;
	}
	
	public Player getPlayer(){
		return player;
	}
}