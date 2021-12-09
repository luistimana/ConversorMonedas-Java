
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Timana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EXTERNA:
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Soles Peruanos a Dolares.\n"
                             + "2 - Pesos Mexicanos a Dolares.\n"
                             + "3 - Pesos Colombianos a Dolares.\n"
                             + "4 - Salir.");
            
            System.out.println("Ingrese una opcion: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    convertir(4.01, "Soles Peruanos");
                    break;
                    
                case '2':
                    convertir(22.15, "Pesos Mexicanos");
                    break;
                
                case '3':
                    convertir(3851.90, "Pesos Colombianos");
                    break;
                
                case '4':
                    System.out.println("Cerrando Programa");
                    break EXTERNA;
                    
                default:
                    System.out.println("Opcion Incorrecta.");
                    break;
            }
        }
    }
    
    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidaed de %s: ", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double)Math.round(dolares *100d)/100;
        
        System.out.println("--------------------------------------");
        System.out.println("|   Tienes $" +dolares+ " Dolares    |");
        System.out.println("--------------------------------------");
    }
    
}
