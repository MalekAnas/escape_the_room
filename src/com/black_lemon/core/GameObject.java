package com.black_lemon.core;

import java.awt.*;


public abstract class GameObject {

    protected Position position;
    protected Size size;
    

    public GameObject() {
         position = new Position(50,50);
         size = new Size(50,50);
    }

    public abstract void update();
    public abstract Image getSprite();




    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


}
