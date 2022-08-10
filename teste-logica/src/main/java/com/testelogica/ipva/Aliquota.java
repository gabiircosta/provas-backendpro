package com.testelogica.ipva;

public class Aliquota {

    public double aliquotaIpva(String tipo, double preco){
        if(tipo.equalsIgnoreCase("caminhão")){
            return preco * 0.015;
        }

        if(tipo.contains("ônibus") || tipo.equalsIgnoreCase("caminhonete") || tipo.equalsIgnoreCase("motocicletas") ){
            return preco * 0.02;
        }

        else{
            return preco * 0.04;
        }
    }
}
