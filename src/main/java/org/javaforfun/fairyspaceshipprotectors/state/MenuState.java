package org.javaforfun.fairyspaceshipprotectors.state;

import org.javaforfun.fairyspaceshipprotectors.Fairy;
import org.lwjgl.Sys;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


/**
 * Created by Elizabeth on 1/23/15.
 */
public class MenuState extends BasicGameState {
    private boolean contains = false;
    private final int id;
    public static Image imageFairy;
    public MenuState(int id) {
        this.id = id;
    }
    Fairy fairy = new Fairy(50, 50);
    @Override
    public int getID() {
        return id;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        try{
             imageFairy = new Image("fairy.png");
        }catch(SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics g) throws SlickException {
        fairy.render(g);
        g.drawString("Contains: " + contains, 80, 80);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
        contains = fairy.hitBox.contains(Mouse.getX(), 600 - Mouse.getY());
    }
}
