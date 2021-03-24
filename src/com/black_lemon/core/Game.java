package com.black_lemon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {


    private Gui gui;
    private Rectangle rectangle;
    private List<GameObject> gameObjects;
    private Input input;

    public Game(int width , int height) {
        input = new Input();
        gui = new Gui(width,height, input);
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
