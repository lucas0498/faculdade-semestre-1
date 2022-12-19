/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author McLOVIN
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = t.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo="Bipede";
                break;
            case 3:
                tipo="Tripe";
                break;
            case 4:
                tipo="Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
