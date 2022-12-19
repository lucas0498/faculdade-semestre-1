/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idadevotacao;

import java.util.Scanner;

/**
 *
 * @author McLOVIN
 */
public class IdadeVotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = t.nextInt();
        if(idade<16){
            System.out.println("Não vota!");
        }else{
            if((idade >= 16 && idade <18) || (idade >70)){
                System.out.println("Voto opcional!");
            } else{
                System.out.println("Voto obrigatório!!");
            }
        }
    }
    
}
