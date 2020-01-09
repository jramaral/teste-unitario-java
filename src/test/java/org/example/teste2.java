package org.example;

import org.junit.Assert;
import org.junit.Test;

public class teste2 {
    @Test
    public void somarDoisNumeroTest(){

        int num1=10, num2=3;
        int resultado = num1 + num2;

        Assert.assertEquals(13,resultado);
    }
}
