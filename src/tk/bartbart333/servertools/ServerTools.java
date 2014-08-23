package tk.bartbart333.servertools;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import tk.bartbart333.config.Config;

public class ServerTools extends JavaPlugin{
	
	private Config config = new Config(getDataFolder() + "/ServerTools");
		
	public void onEnable(){
		
		
		config.load();
		config.store();
	}
	
	public void onDisable(){
		
	}
}