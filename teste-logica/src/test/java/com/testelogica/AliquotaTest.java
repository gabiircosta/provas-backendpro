package com.testelogica;

import com.testelogica.ipva.Aliquota;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AliquotaTest {

    Aliquota aliquota = new Aliquota();

    @Test
    void aliquotaIpvaTest(){
        String tipo = "caminhão";
        double preco = 152000;

        double valorEsperado = preco * 0.015;

        double valorRecebido = aliquota.aliquotaIpva(tipo, preco);

        Assertions.assertEquals(valorEsperado, valorRecebido);
    }
}
