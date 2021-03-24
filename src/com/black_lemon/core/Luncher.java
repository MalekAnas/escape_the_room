package com.black_lemon.core;

public class Luncher {
    public static void main(String[] args) {
        new Thread(new GameLoop(new Game(1200, 800))).start();
    }



}
