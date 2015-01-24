package org.javaforfun.fairyspaceshipprotectors;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import java.io.File;

public class Main {
    public static AppGameContainer container;
    public static final String TITLE = "Fairy Space Ship Protectors - by javaforfun";
    public static void main(String[] args) {
        String name = "";
        String os = System.getProperty("os.name");
        if(os.startsWith("Windows")) {
            name = "natives-windows";
        }
        if(os.startsWith("Mac")) {
            name = "natives-mac";
        }
        if(os.startsWith("Linux")) {
            name = "natives-linux";
        }
        System.setProperty("java.library.path", "libraries");
        System.setProperty("org.lwjgl.librarypath", new File("libraries/natives/" + name).getAbsolutePath());
        try{
            container = new AppGameContainer(new Game(TITLE));
            container.setDisplayMode(800, 600, false);
            container.setShowFPS(false);
            container.start();
        }catch(SlickException e) {
            e.printStackTrace();
        }
    }
}
