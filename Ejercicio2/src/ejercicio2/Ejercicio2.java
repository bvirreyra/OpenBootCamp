/*
 Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */
package ejercicio2;

/**
 *
 * @author CORE I7
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.aumementoPuerta();
        miCoche.aumementoPuerta();
        System.out.println("El numero de puertas es: "+ miCoche.puertas);
    }
}
 class Coche {
     public int puertas;
     public void aumementoPuerta(){
         this.puertas++;
     }
 }