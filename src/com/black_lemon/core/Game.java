package com.black_lemon.core;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import com.black_lemon.controller.Input;
import com.black_lemon.controller.PlayerController;
import com.black_lemon.model.Player;

 

public class Game {


    private Gui gui;
    private Rectangle rectangle;
    private List<GameObject> gameObjects;
    private Input input;

    public Game(int width , int height) {
        input = new Input();
        gui = new Gui(width, height, input);
        gameObjects = new ArrayList<>();
        gameObjects.add(new Player(new PlayerController(input)));
    }


    public  void render(){
        gui.render(this);
    }

    public void update(){
        gameObjects.forEach(gameObject -> gameObject.update());
    }





    public Gui getGui() {
        return this.gui;
    }

    public void setGui(Gui gui) {
        this.gui = gui;
    }

    public Rectangle getRectangle() {
        return this.rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public List<GameObject> getGameObjects() {
        return this.gameObjects;
    }

    public void setGameObjects(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }
    
}
