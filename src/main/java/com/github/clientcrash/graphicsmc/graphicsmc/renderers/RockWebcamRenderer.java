package com.github.clientcrash.graphicsmc.graphicsmc.renderers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

import java.awt.image.BufferedImage;

public class RockWebcamRenderer /*extends MapRenderer */{
    /*
    NOT SUPPORTED
    public RockWebcamRenderer(){
        cam = Webcam.getDefault();
        if (cam != null) {
            Bukkit.getServer().broadcastMessage("Webcam: " + cam.getName());
        } else {
            Bukkit.getServer().broadcastMessage("No webcam detected");
        }
    }
    Webcam cam;
    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
        BufferedImage bf = cam.getImage();
        canvas.drawImage(0,0,bf);
    }*/
}
