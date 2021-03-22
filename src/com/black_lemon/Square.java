package com.black_lemon;

import java.awt.*;
import java.awt.image.BufferedImage;
import com.black_lemon.GameObject;
import com.black_lemon.Position;
import com.black_lemon.Size;

public class Square extends GameObject {


 

    @Override
    public void update() {
        position = new Position(position.getX() + 1, position.getY());
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
