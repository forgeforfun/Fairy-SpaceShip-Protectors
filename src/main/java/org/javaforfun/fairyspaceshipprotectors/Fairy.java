package org.javaforfun.fairyspaceshipprotectors;

import org.javaforfun.fairyspaceshipprotectors.state.MenuState;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Polygon;

/**
 * Created by Elizabeth on 1/23/15.
 */
public class Fairy {

    public Polygon hitBox;
    public float x;
    public float y;
    public Fairy(float x, float y) {
        this.x = x;
        this.y = y;
        this.hitBox = new Polygon(new float[]{x + 17, y + 41, x + 17, y + 31, x + 18, y + 31, x + 18, y + 30, x + 20, y + 30, x + 20, y + 18, x + 16, y + 18, x + 16, y+16, x + 17, y + 15, x + 18, y + 14, x + 19, y + 13, x + 19, y + 7, x + 18, y + 6, x + 18, y + 5, x + 17, y + 5, x + 17, y + 3, x + 16, y + 2, x + 15, y + 1, x + 6, y + 1, x + 5, y + 2, x + 4, y + 3, x + 4, y + 4, x + 3, y + 5, x + 3, y + 6, x + 2, y + 7, x + 2, y + 13, x + 3, y + 14, x + 4, y + 15, x + 5, y + 16, x + 5, y + 17, x + 4, y + 18, x + 1, y + 18, x + 1, y + 31, x + 2, y + 30, x + 4, y + 30, x + 4, y + 41, x + 7, y + 41, x + 7, y + 33, x + 14, y + 33, x + 14, y + 41, });
    }
    public void render(Graphics g) {
        g.drawImage(MenuState.imageFairy, x, y);
    }
}