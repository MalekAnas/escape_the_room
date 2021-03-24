package com.black_lemon.core;


import java.awt.*;


public class Renderer {
    


    public void render(Game game, Graphics graphics ){
        game.getGameObjects().forEach( gameObject -> graphics.drawImage(
            gameObject.getSprite(),
            gameObject.getPosition().getX(),
            gameObject.getPosition().getY(), 
            null
        ));

    }
}
