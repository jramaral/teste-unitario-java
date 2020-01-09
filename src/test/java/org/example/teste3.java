package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class teste3 {

    @Test
    public void verificarStringTest(){

        String s1 = "minha string";

        Assertions.assertThat(s1).contains("min");


    }
}