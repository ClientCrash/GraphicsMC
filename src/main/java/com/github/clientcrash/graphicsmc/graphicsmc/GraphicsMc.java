package com.github.clientcrash.graphicsmc.graphicsmc;

import org.bukkit.plugin.java.JavaPlugin;

public final class GraphicsMc extends JavaPlugin {
    public static RenderMode mode = RenderMode.Test;
    @Override
    public void onEnable() {
        this.getLogger().info("GraphicsMC enabled.");
        this.getCommand("gmcmode").setExecutor(new RenderModeCommandListener());

        this.getCommand("gmcrender").setExecutor(new RenderCommandListener());
        getServer().getPluginManager().registerEvents(new MapListener(), this);
    }

    @Override
    public void onDisable() {

        this.getLogger().info("GraphicsMC disabled.");
    }
}
