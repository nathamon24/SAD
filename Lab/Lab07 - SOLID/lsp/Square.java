package com.solid.lsp;

public class Square implements Shape {

    private int width;
    private int height;

    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

    public void setSide(int side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getArea() {
        return this.width * this.height;
    }

}
