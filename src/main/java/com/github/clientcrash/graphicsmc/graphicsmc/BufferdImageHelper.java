package com.github.clientcrash.graphicsmc.graphicsmc;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class BufferdImageHelper {
    public static ArrayList<BufferedImage> getImagesWithEndingInDir(String path, String end){
        File dir = new File(path);
        File [] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(end);
            }
        });
        ArrayList<BufferedImage> imgl = new ArrayList<BufferedImage>();
        for (File f : files) {
            try {
                imgl.add(ImageIO.read(f));
            }catch(Exception e){

            }
        }
        return imgl;
    }

}
