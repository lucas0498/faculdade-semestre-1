/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetforeach;

/**
 *
 * @author McLOVIN
 */
public class VetForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,5,1,8,4};
        float t = 0;
        float m = 0;
        for(int valor:n){
            System.out.println(valor);
            t+=valor;
            m=t/n.length;
            
        }
        System.out.println("A soma total dos valores do vetor é: " + t);
        System.out.println("A média dos valores é: " + m);
    }
    
}
