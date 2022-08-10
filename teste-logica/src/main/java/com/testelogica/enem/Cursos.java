package com.testelogica.enem;

public class Cursos {

    public String cursosEnem(double notaCorte){
        if(notaCorte<=651){
            return "História, Letras, Geografia, Biblioteconomia, Sociologia, Agronomia";
        }

        else if(notaCorte<=699){
            return "Enfermagem, Ed. Física, etc";
        }

        else if(notaCorte<=750){
            return "Arquitetura, Adm, Math, etc";
        }

        else if (notaCorte <= 799){
            return "Direito, Odonto, Psico, Engenharias";
        }

        else {
            return "Medicina, Eng. Aeronáutica";
        }
    }
}
