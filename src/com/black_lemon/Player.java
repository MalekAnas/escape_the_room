package com.black_lemon;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends GameObject {


    private Controller controller;
    private final int speed = 3;

    public Player(Controller controller) {
        super();
        this.controller = controller;
    }


    @Override
    public void update() {
        int deltaX =0;
        int deltaY =0;

        if(controller.isRequstingUp()){
            deltaY-=speed;
        }
        if(controller.isRequstingDown()){
            deltaY+=speed;
        }
        if(controller.isRequstingRight()){
            deltaX+=speed;
        }
        if(controller.isRequstingLeft()){
            deltaX-=speed;
        }
        position = new Position(position.getX() + deltaX, position.getY() + deltaY);
    }

    @Override
    public Image getSprite() {
        BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, size.getWidth(), size.getHeight());
        graphics.dispose();
        

        return image;
    }


    


    
}
