
package Imoveis;
import Imoveis.Tipo_Imovel;
import javax.swing.JOptionPane;
import Telas.TelaPrincipal;

public class Tipo_Imovel extends Imovel {

    public String descricao, bairro, status;
//calcular o valor do aluguel

    public double aluguel() {
        double aluguel = 0;

        if (tipo.equals("Galpão")) {
            aluguel = aluguel_base * 1.1;
        }
        if (tipo.equals("Comercial")) {
            aluguel = aluguel_base * 1.15;
        }
        if (tipo.equals("Residencial")) {
            aluguel = aluguel_base * 1.05;
        }

        return aluguel;
    }

}
