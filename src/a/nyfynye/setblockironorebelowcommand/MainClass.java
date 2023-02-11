package a.nyfynye.setblockironorebelowcommand;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

class CommandSetBlockIronOreBelow implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Location a = ((Player) sender).getLocation();
			a.setY(a.getY()-1);
			a.getBlock().setType(Material.IRON_ORE);
			sender.sendMessage("Look around for the iron ore.");
		}
		return true;
	}

}

public class MainClass extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("SetBlockIronOreBelowCommand's onEnable()");
		this.getCommand("setblockironorebelow").setExecutor(new CommandSetBlockIronOreBelow());
	}

	@Override
	public void onDisable() {
		System.out.println("SetBlockIronOreBelowCommand's onDisable()");
	}

}
