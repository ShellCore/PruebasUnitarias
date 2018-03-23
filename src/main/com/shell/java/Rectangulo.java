package main.com.shell.java;

public class Rectangulo implements FiguraGeometrica {

    private int width;
    private int height;

    @Override
    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangulo (" + width + ", " + height + ")";
    }
}
