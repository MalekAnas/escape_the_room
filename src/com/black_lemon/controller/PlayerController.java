package com.black_lemon.controller;

import java.awt.event.KeyEvent;

public class PlayerController implements Controller{

    private Input input;

    public PlayerController(Input input) {
        this.input = input;
    }

    @Override
    public boolean isRequstingRight() {
        return input.isPressed(KeyEvent.VK_RIGHT);
    }

    @Override
    public boolean isRequstingUp() {
        return input.isPressed(KeyEvent.VK_UP);

    }

    @Override
    public boolean isRequstingLeft() {
        return input.isPressed(KeyEvent.VK_LEFT);

    }

    @Override
    public boolean isRequstingDown() {
        return input.isPressed(KeyEvent.VK_DOWN);

    }
    

    

}
