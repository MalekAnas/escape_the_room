package com.black_lemon;

import java.awt.*;

public class Game {

    private Gui gui;
    private Rectangle rectangle;


    public Game(int width , int height) {
        gui = new Gui(width,height);
        rectangle = new Rectangle(0,0,50,50);
    }


    public  void render(){
        gui.render(this);
    }

    public void update(){

        rectangle.setLocation(((int) rectangle.getX()) + 1, (int) rectangle.getY());
    }


    public Rectangle getRectangle() {
        return rectangle;
    }
}
