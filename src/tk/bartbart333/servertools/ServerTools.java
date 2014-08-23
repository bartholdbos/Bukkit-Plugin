package tk.bartbart333.servertools;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import tk.bartbart333.config.Config;

public class ServerTools extends JavaPlugin{
	
	private Config config = new Config(getDataFolder() + "/ServerTools");
	public ArrayList<EPlayer> players = new ArrayList<EPlayer>();
		
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
		
		config.load();
		config.store();
		
		for(Player player : getServer().getOnlinePlayers()){
			players.add(new EPlayer(player));
		}	
	}
	
	public void onDisable(){
		
	}
}