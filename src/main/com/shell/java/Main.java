package main.com.shell.java;

public class Main {

    public static void main(String[] args) {

        Rectangulo rec = new Rectangulo();
        rec.setWidth(5);
        rec.setHeight(4);

        System.out.println(rec + "; Area = " + rec.getArea());
    }
}
