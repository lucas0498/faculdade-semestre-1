
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota:");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é: %.2f \n", nome, nota);
        
    }
    
}
