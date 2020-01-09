package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class teste4 {
    Calculadora calculadora;

    int num1 =10, num2=5;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisNumerosTest(){

        //execução
        int resultado = calculadora.somar(num1,num2);

        //verificação

        Assertions.assertThat(resultado).isEqualTo(15);
    }


    @Test
    public void deveDividirDoisNumerosTest(){

        //execução
        int resultado = calculadora.dividir(num1,num2);

        //verificação

        Assertions.assertThat(resultado).isEqualTo(2);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveDividirPorZeroTest(){

        num1=10;
        num2=0;
        //execução
        int resultado = calculadora.dividir(num1,num2);

    }
    @Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativosTest(){
        num1=-10;
        num2=0;
        //execução
        int resultado = calculadora.somar(num1,num2);

    }

}

class Calculadora{

    int somar(int n1, int n2){
        if(n1<0 || n2<0){
            throw new RuntimeException("não pode somar numero negativos");
        }
        return n1+n2;
    }

    int dividir(int n1, int n2){
        if(n1<0 || n2<=0){
            throw new RuntimeException("não permitido divisão por zero ou nu");
        }
        return n1 / n2;
    }
}
