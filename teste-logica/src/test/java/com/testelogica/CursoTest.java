package com.testelogica;

import com.testelogica.enem.Cursos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CursoTest {

    Cursos cursos = new Cursos();
    //Quando tentei dar @Autowired deu erro --> descobrir o porque.

    @Test
    public void cursosEnemTest(){
        double nota = 580;
        String cursosEsperados = "História, Letras, Geografia, Biblioteconomia, Sociologia, Agronomia";

        String cursosRecebidos = cursos.cursosEnem(nota);

        assertEquals(cursosEsperados, cursosRecebidos);
    }
}
