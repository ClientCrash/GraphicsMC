package com.github.clientcrash.graphicsmc.graphicsmc.renderers;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapCursor;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageRenderer extends MapRenderer {
    BufferedImage img;
    public ImageRenderer(BufferedImage in){
         this.img= in;
    }
    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
        canvas.drawImage(0,0, img);


    }
}
