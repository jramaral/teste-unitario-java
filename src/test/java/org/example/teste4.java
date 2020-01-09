package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class teste4 {

    @Test
    public void deveSomarDoisNumerosTest(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 =10, num2=5;

        //execução
        int resultado = calculadora.somar(num1,num2);

        //verificação

        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativosTest(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 =-10, num2=5;

        //execução
        int resultado = calculadora.somar(num1,num2);

        //verificação

    }

    @Test
    public void deveDividirDoisNumerosTest(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 =5, num2=5;

        //execução
        int resultado = calculadora.dividir(num1,num2);

        //verificação

        Assertions.assertThat(resultado).isEqualTo(1);
    }
    @Test(expected = RuntimeException.class)
    public void naoDeveDividirDoisNumerosTest(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 =5, num2=0;

        //execução
        int resultado = calculadora.dividir(num1,num2);

        //verificação

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
