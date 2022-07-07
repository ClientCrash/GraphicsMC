package com.github.clientcrash.graphicsmc.graphicsmc.renderers;

import com.github.clientcrash.graphicsmc.graphicsmc.GraphicsMc;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.map.*;

public class TestMapRenderer extends MapRenderer {
    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
        for (int x = 25; x < 50; x++) {
            for (int y = 25; y < 50; y++) {
                canvas.setPixel(x, y, MapPalette.RED);
                canvas.drawText(15, 15, MinecraftFont.Font, "TEST RENDERER");
                canvas.drawText(30,30,MinecraftFont.Font,"id:"+map.getId());
            }
        }
    }
}
