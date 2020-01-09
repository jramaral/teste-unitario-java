package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class teste1 {

    @Test
    public void somarTresNumerosTest(){

        int num1=10, num2=2, num3=3;
        int resultado = num1+num2+num3;

        Assertions.assertThat(resultado).isBetween(10,16);


    }
}
