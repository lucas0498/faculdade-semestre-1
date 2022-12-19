/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author McLOVIN
 */


public class TesteFuncao01 {
   /* static void soma(int a, int b){
        int s = a+b;
        System.out.println("A soma é: "+s); aqui é um metodo vazio, sem retorno
}*/
   static int soma(int a, int b){ // se usa o static apenas quando se chama o metodo/funcao em um metodo estatico
        int s = a+b;
        return s; //aqui é um metodo com retorno(função)a   
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa! hihihihi");
        int sm = soma(5,6);
        System.out.println("A soma vale: "+sm);
        
    }
    
}
