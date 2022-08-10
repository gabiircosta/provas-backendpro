package com.testelogica.corretora;

public class Corretora {

    public double custoPorIdade (int idade, boolean precoAtual){

        if(idade<=18){
            if(precoAtual) {
                return 89.23;
            } else return 79.80;
        }

        else if (idade <=43){
            if(precoAtual){
                return 116.90;
            } else return 129.69;
        }

        else if (idade <=58){
            if(precoAtual){
                return 166.33;
            } else return 134.64;
        }

        else {
            if(precoAtual){
                return 292.22;
            } else return 225.75;
        }

    }

}
