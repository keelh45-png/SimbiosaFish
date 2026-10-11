package id.simbiosa.fish;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimbiosaFishPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SimbiosaFish starter loaded.");
        getLogger().warning("Fishing quotas and EvenMoreFish integration are not implemented yet.");
    }
}
