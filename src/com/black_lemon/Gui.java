package com.black_lemon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;

public class Gui extends JFrame {

    private Canvas canvas;

    public Gui(int width , int height){
        setTitle("ESCAPE THE ROOM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //init the canvas
        canvas = new Canvas();
        //set the size of the canvas
        canvas.setPreferredSize(new Dimension(width, height));
        //Sets the focusable state of canvas to false
        canvas.setFocusable(false);

        //add canvas component to the root frame
        add(canvas);
        ////Realize the component
        pack();


        canvas.createBufferStrategy(5);

        //disable relativity to center the app
        setLocationRelativeTo(null);
        //set the frame to visible
        setVisible(true);
    }


    public void render(Game game){
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.black);
        graphics.fillRect(0,0, canvas.getWidth() ,canvas.getHeight());

        Rectangle rectangle = game.getRectangle();
        graphics.setColor(Color.BLUE);
        graphics.fillRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight() ) ;


        graphics.dispose();
        bufferStrategy.show();
    }



}







