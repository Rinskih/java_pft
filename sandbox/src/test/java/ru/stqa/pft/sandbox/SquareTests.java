package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test
    public void testArea(){

        Square s = new Square(5);
        // assert s.area() == 25; простой ассерт, без вывода значения
        Assert.assertEquals(s.area() , 25.0); //ассерт с выводом ожидаемого и факт. результата
    }
}
