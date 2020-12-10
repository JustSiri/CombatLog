package combatlog.combatlog;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.text.DecimalFormat;

public class PlayerHItEntity implements Listener {

    @EventHandler
    void entityHitbyPlayer(EntityDamageByEntityEvent e) {
        Player p = ((Player) e.getDamager()).getPlayer();
        String ent = e.getEntityType().toString().toLowerCase();
        DecimalFormat df = new DecimalFormat("##.#");
        String finalDamage = df.format(e.getFinalDamage());

        if (e.getDamager() instanceof Player) {
            p.sendMessage("You hit " + ent + ", and you gave it " + finalDamage +" damage.");
        }
    }
}
