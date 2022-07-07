package com.github.clientcrash.graphicsmc.graphicsmc;

import org.bukkit.plugin.java.JavaPlugin;

public final class GraphicsMc extends JavaPlugin {
    public static RenderMode mode = RenderMode.None;
    @Override
    public void onEnable() {
        this.getLogger().info("GraphicsMC enabled.");
        this.getLogger().info("Frame display will not work correctly with papermc.");
        this.getCommand("gmcmode").setExecutor(new RenderModeCommandListener());

        this.getCommand("gmcrender").setExecutor(new RenderCommandListener());
        getServer().getPluginManager().registerEvents(new MapListener(), this);
    }

    @Override
    public void onDisable() {

        this.getLogger().info("GraphicsMC disabled.");
    }
}
