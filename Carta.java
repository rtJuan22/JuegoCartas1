
package juegocartas1;

public class Carta {
    
 private int ATK;
    private int DEF;
    private String elemento;

    public Carta(int ATK, int DEF, String elemento) {
        this.ATK = ATK;
        this.DEF = DEF;
        this.elemento = elemento;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public String getElemento() {
        return elemento;
    }

    public int calcularDanio(Carta oponente) {
        int danio = Math.max(0, this.getATK() - oponente.getDEF());
        return danio;
    }

    public double calcularBonificador(Carta oponente) {
        double bonificador = 1.0;

        if (this.getElemento().equals("Fuego") && oponente.getElemento().equals("Agua")) {
            bonificador = 1.2;
        } else if (this.getElemento().equals("Agua") && oponente.getElemento().equals("Tierra")) {
            bonificador = 1.2;
        } else if (this.getElemento().equals("Tierra") && oponente.getElemento().equals("Viento")) {
            bonificador = 1.2;
        } else if (this.getElemento().equals("Viento") && oponente.getElemento().equals("Rayo")) {
            bonificador = 1.2;
        } else if (this.getElemento().equals("Rayo") && oponente.getElemento().equals("Fuego")) {
            bonificador = 1.2;
        }

        return bonificador;
    }
 @Override
     public String toString() {
        return "Carta [ATK=" + ATK + ", DEF=" + DEF + ", Elemento=" + elemento + "]";
    }
}    
    


