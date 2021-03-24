package com.black_lemon.core;

public class GameLoop implements Runnable{


    private Game game;
    private boolean running;
    private final double updateRate = 1.0d/60.0d;

    private long nextStartTime;
    private int fps, ups;


    public GameLoop(Game game) {
        this.game = game;
    }





    @Override
    public void run() {

        running = true;
        double accumlate = 0;
        long currentTime , lastUpdateTime = System.currentTimeMillis();

        nextStartTime = System.currentTimeMillis() + 1000;

        while (running){
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSec = (currentTime - lastUpdateTime ) / 1000d;
            accumlate += lastRenderTimeInSec;
            lastUpdateTime = currentTime;
            while(accumlate > updateRate){
                update();
                accumlate -= updateRate;
            }

            render();
            printUpdateValue();

        }
    }

    private void update() {
        game.update();
        ups++;
    }

    private void render() {
        game.render();
        fps++;
    }

    private void printUpdateValue() {
        if (System.currentTimeMillis() > nextStartTime ) {
            System.out.println(String.format("FPS: %d, UPS: %d ", fps, ups));
            fps = ups = 0;
            nextStartTime = System.currentTimeMillis() + 1000;
        }
    }
    
    
    
}
