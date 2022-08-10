package com.testelogica;

import com.testelogica.corretora.Corretora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CorretoraTest {

    Corretora corretora = new Corretora();

    @Test
    void custoPorIdadeTest(){
        int idade = 25;
        boolean precoAtual = false;

        double valorEsperado = 129.69;

        double valorRecebido = corretora.custoPorIdade(idade, precoAtual);

        Assertions.assertEquals(valorEsperado, valorRecebido);
    }
}
