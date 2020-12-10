package combatlog.combatlog;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CombatLog extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("CombatLog plugin enabled.");
        Bukkit.getPluginManager().registerEvents(new PlayerHItEntity(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("CombatLog plugin disabled.");
    }
}
