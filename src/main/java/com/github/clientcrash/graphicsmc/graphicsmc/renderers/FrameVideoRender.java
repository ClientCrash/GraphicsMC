package com.github.clientcrash.graphicsmc.graphicsmc.renderers;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class FrameVideoRender extends MapRenderer {
    ArrayList<BufferedImage> frames;
    int currentIndex = 0;
    int ticksBetweenFrames = 0;
    public FrameVideoRender(ArrayList<BufferedImage> frames, int startindex, int ticksBetweenFrames){
        this.frames = frames;
        this.currentIndex = startindex;
        this.ticksBetweenFrames = ticksBetweenFrames;
    }
    int currentTick = 0;
    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
        if(currentTick < ticksBetweenFrames){
            currentTick++;
        }else{
            currentTick=0;
            currentIndex++;
        }
        if(currentIndex+1 >= frames.size()){currentIndex = 0;}
        canvas.drawImage(0,0, frames.get(currentIndex));
    }
}
