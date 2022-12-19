/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

/**
 *
 * @author McLOVIN
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[4];
        //int n[] = {3,5,8,2}; - outra maneira de declarar um vetor
        double t=0;
        double m=0;
        
        n[0] = 3;
        n[1] = 5;
        n[2] = 100;
        n[3] = 2;
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
            t += n[i];            
            m = t/n.length;            
        }
        System.out.println("o total é:" + t);
        System.out.println("A média é: " + m);
    }
    
}
