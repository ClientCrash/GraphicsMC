package com.github.clientcrash.graphicsmc.graphicsmc;

import com.github.clientcrash.graphicsmc.graphicsmc.renderers.TestMapRenderer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.map.MapView;

public class MapListener implements Listener {
    @EventHandler
    public void onMapInitialize(MapInitializeEvent e) {
        if(GraphicsMc.mode==RenderMode.None){return;}
        MapView mv = e.getMap();
        mv.setScale(MapView.Scale.FARTHEST);
        mv.getRenderers().clear();
        switch(GraphicsMc.mode){
            default:
                return;
            case Test:
                mv.addRenderer(new TestMapRenderer());
        }

    }
}
