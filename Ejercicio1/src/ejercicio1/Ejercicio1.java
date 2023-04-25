/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author CORE I7
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        resultado= suma(10,20,30);
        System.out.println("el resultado es: " + resultado );
    }
    public static int suma(int a,int b,int c){
        return(a+b+c);
    }
    
}
