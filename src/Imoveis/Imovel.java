
package Imoveis;

public class Imovel {

  private int codigo;
   private double aluguel_base;
   private String tipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getAluguel_base() {
        return aluguel_base;
    }

    public void setAluguel_base(double aluguel_base) {
        this.aluguel_base = aluguel_base;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
