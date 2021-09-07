package com.github.clientcrash.graphicsmc.graphicsmc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RenderModeCommandListener implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
        }
        if(args.length == 0){
            sender.sendMessage("Mode : " + GraphicsMc.mode.toString());
            return true;
        }
        sender.sendMessage("Changing mode to " + args[0]);
        switch(args[0]){
            default:
                GraphicsMc.mode = RenderMode.None;
                break;
            case("none"):
                GraphicsMc.mode = RenderMode.None;
                break;
            case("test"):
                GraphicsMc.mode = RenderMode.Test;
                break;
            case("cam"):
                GraphicsMc.mode = RenderMode.Cam;
                break;
            case("image"):
                GraphicsMc.mode = RenderMode.Image;
                break;
            case("stream"):
                GraphicsMc.mode = RenderMode.Stream;
                break;
            case("frames"):
                GraphicsMc.mode = RenderMode.Frames;
                break;
        }
        return true;
    }
}
