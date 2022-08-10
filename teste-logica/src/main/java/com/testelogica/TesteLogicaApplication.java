package com.testelogica;

import com.testelogica.corretora.Corretora;
import com.testelogica.enem.Cursos;
import com.testelogica.ipva.Aliquota;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteLogicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteLogicaApplication.class, args);

		Corretora corretora = new Corretora();
		System.out.println(corretora.custoPorIdade(19, false));

		Aliquota aliquota = new Aliquota();
		System.out.println(aliquota.aliquotaIpva("micro-ônibus", 15000));

		Cursos cursos = new Cursos();
		System.out.println(cursos.cursosEnem(801));
	}

}
