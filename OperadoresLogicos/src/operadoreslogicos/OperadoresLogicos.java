/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author McLOVIN
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        boolean r;
        x = 4;
        y = 7;
        z = 12;
        // E
        r = (x < y && y < z) ? true:false;
        System.out.println(r);
        r = (x < y && y == z) ? true:false;
        System.out.println(r);
        
        //Ou
        r = (x < y || y == z) ? true:false;
        System.out.println(r);
        
        //Ou Exclusivo
        r = (x < y ^ y == z) ? true:false;
        System.out.println(r);
        r = (x < y ^ y < z) ? true:false;
        System.out.println(r);
    }
    
}
