
package juegocartas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;





public class JuegoCartas1 {

  
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        List<Carta> mazoGeneral = new ArrayList<>();
        Random random = new Random();
           
        String[] elementos = {"Fuego", "Agua", "Tierra", "Viento", "Rayo"};
           System.out.println("Bienvenido al Juego");
           System.out.println("\nEmpieza la Pelea");
        for (int i = 0; i < 10; i++) {
            int ATK = random.nextInt(901) + 100;
            int DEF = random.nextInt(901) + 100;
            String elemento = elementos[random.nextInt(elementos.length)];
            mazoGeneral.add(new Carta(ATK, DEF, elemento));
        }

        jugador1.agregarCartas(mazoGeneral.subList(0, 5));
        jugador2.agregarCartas(mazoGeneral.subList(5, 10));

         while (jugador1.tieneCartas() && jugador2.tieneCartas()) {
            Carta cartaJugador1 = jugador1.seleccionarCartaAleatoria();
            Carta cartaJugador2 = jugador2.seleccionarCartaAleatoria();

            double bonificadorJugador1 = cartaJugador1.calcularBonificador(cartaJugador2);
            double bonificadorJugador2 = cartaJugador2.calcularBonificador(cartaJugador1);

            int danioJugador1 = (int) (cartaJugador1.getATK() * bonificadorJugador1);
            int danioJugador2 = (int) (cartaJugador2.getATK() * bonificadorJugador2);

            System.out.println("Jugador 1 ataca con: " + cartaJugador1.toString() + ", inflige " + danioJugador1 + " de daño");
            System.out.println("Jugador 2 se defiende con: " + cartaJugador2.toString() + ", recibe " + danioJugador1 + " de daño");

            System.out.println("Jugador 2 ataca con: " + cartaJugador2.toString() + ", inflige " + danioJugador2 + " de daño");
            System.out.println("Jugador 1 se defiende con: " + cartaJugador1.toString() + ", recibe " + danioJugador2 + " de daño");

            if (danioJugador1 > danioJugador2) {
                jugador2.removerCarta(cartaJugador2);
                jugador2.mostrarVida();
            } else if (danioJugador2 > danioJugador1) {
                jugador1.removerCarta(cartaJugador1);
                jugador1.mostrarVida();
            } else {
                System.out.println("Empate en este turno");
            }
        }

        if (!jugador1.tieneCartas()) {
            System.out.println("El Jugador 2 ha ganado");
        } else {
            System.out.println("El Jugador 1 ha ganado");
        }
    }
    }
    
    
    
    
        
    
    
    
 
    
    
    
 

        
        
        
        
        

     

    
    

    
    
    

    

    
    
    
    

