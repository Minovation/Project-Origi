package com.Minovation.testPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable(){
		getLogger().info("Hello World????????????????????/");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("hello")){
			sender.sendMessage("world word");
		} else if(cmd.getName().equalsIgnoreCase("greetings")){
			sender.sendMessage("yo");
		}
		return false;
	}
	
}
