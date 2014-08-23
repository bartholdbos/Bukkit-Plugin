package tk.bartbart333.servertools;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import tk.bartbart333.config.Config;

public class ServerTools extends JavaPlugin{
	
	private Config config = new Config(getDataFolder() + "/ServerTools");
	public HashMap<String, EPlayer> players = new HashMap<String, EPlayer>();
		
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
		
		config.load();
		config.store();
		
		for(Player player : getServer().getOnlinePlayers()){
			players.put(player.getName(), new EPlayer(player));
		}	
	}
	
	public void onDisable(){
		
	}
}