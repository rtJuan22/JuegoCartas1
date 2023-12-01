
package juegocartas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jugador {
     private String nombre;
    private List<Carta> mazo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mazo = new ArrayList<>();
    }

    public void agregarCartas(List<Carta> nuevasCartas) {
        mazo.addAll(nuevasCartas);
    }

    public void removerCarta(Carta carta) {
        mazo.remove(carta);
    }

    public Carta seleccionarCartaAleatoria() {
        Random random = new Random();
        int index = random.nextInt(mazo.size());
        return mazo.get(index);
    }

    public boolean tieneCartas() {
        return !mazo.isEmpty();
    }

    public String getNombre() {
        return nombre;
        
        
    }
    
    public void mostrarVida() {
        System.out.println("Vida de " + this.getNombre() + ": " + mazo.size() + " cartas restantes");
    }
}
