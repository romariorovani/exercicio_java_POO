package Metodos;

import Imoveis.Tipo_Imovel;

// calcular o valor da aluguel
public class Metodos {

    public static double aluguel(Tipo_Imovel tipo) {

        if (tipo.getTipo().equals("Galpão")) {
            return tipo.getAluguel_base() * 1.1;
        } else if (tipo.getTipo().equals("Comercial")) {
            return tipo.getAluguel_base() * 1.15;
        } else if (tipo.getTipo().equals("Residencial")) {
            return tipo.getAluguel_base() * 1.05;
        } else {
            return 0;
        }

    }
}
