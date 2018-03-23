package test.com.shell.java;

import main.com.shell.java.Rectangulo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectanguloTest {


    private int widthTest;
    private int heightTest;
    private int res;
    private int res2;

    @Before
    public void setup() {
        heightTest = 4;
        widthTest = 5;
        res = 20;
        res2 = -1;
    }

    @Test
    public void checkEquals() {
        Rectangulo rec = new Rectangulo();
        rec.setWidth(widthTest);
        rec.setHeight(heightTest);
        Assert.assertEquals(rec.getArea(), res);
    }

    @Test
    public void getAreaError() {
        Rectangulo rec = new Rectangulo();
        rec.setWidth(widthTest);
        rec.setHeight(heightTest);
        Assert.assertNotEquals(rec.getArea(), res2);
    }

    @After
    public void tearDown() {
        widthTest = 0;
        heightTest = 0;
    }
}