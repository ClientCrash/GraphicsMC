package com.github.clientcrash.graphicsmc.graphicsmc;

import com.github.clientcrash.graphicsmc.graphicsmc.GraphicsMc;
import com.github.clientcrash.graphicsmc.graphicsmc.renderers.ImageRenderer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.map.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RenderCommandListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        MapView mv = Bukkit.getServer().getMap(Integer.parseInt(args[0]));
        mv.getRenderers().clear();

        switch(GraphicsMc.mode){
            default:
                return true;
            case Image:
                mv.setScale(MapView.Scale.FARTHEST);
                //TODO add image loading by command
                File img = new File(args[1]);
                try {
                    BufferedImage in = ImageIO.read(img);
                    mv.addRenderer(new ImageRenderer(in));
                } catch (IOException e) {
                    sender.sendMessage(e.getMessage());
                }
                break;
            case None:
                break;

        }
        return true;
    }
}
