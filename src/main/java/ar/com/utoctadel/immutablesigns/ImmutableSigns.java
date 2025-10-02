package ar.com.utoctadel.immutablesigns;

import org.bukkit.plugin.java.JavaPlugin;

public class ImmutableSigns extends JavaPlugin {
  @Override
  public void onEnable() {
    getServer().getPluginManager().registerEvents(new SignListener(), this);
    getLogger().info("ImmutableSigns activated: edition of signs is blocked.");
  }
}