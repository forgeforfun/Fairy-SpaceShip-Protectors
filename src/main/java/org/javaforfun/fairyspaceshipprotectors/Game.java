package org.javaforfun.fairyspaceshipprotectors;

import org.javaforfun.fairyspaceshipprotectors.state.MenuState;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Elizabeth on 1/23/15.
 */
public class Game extends StateBasedGame{
    public static final int MENU = 0;
    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        this.enterState(MENU);
    }
    public Game(String TITLE) {
        super(TITLE);
        this.addState(new MenuState(MENU));
    }

}
