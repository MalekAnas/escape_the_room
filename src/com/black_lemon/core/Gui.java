package com.black_lemon.core;

import javax.swing.*;

import com.black_lemon.controller.Input;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Gui extends JFrame {

    private Canvas canvas;
    private Renderer renderer;

    public Gui(int width , int height, Input input){
        setTitle("ESCAPE THE ROOM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        this.renderer = new Renderer();

        //init the canvas
        canvas = new Canvas();
        //set the size of the canvas
        canvas.setPreferredSize(new Dimension(width, height));
        //Sets the focusable state of canvas to false
        canvas.setFocusable(false);

        //add canvas component to the root frame
        add(canvas);
        addKeyListener(input);
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

        renderer.render(game, graphics);

        graphics.dispose();
        bufferStrategy.show();
    }



}







