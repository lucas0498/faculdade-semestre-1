/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author McLOVIN
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, m, tv = 0, tp = 0, ti = 0, ac = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)<em></html>"));
            if (n != 0) {
                tv++;
                s += n;
                if (n % 2 == 0) {
                    tp++;
                } else {
                    ti++;
                }
                if (n > 100) {
                    ac++;
                }

            }

        } while (n != 0);
        m = s / tv;
        JOptionPane.showMessageDialog(null, "<html>Resultado <hr>"
                + "Total de Valores: " + tv
                + "<br>Total de Pares: " + tp
                + "<br>Total de ímpares: " + ti
                + "<br>Acima de 100: " + ac
                + "<br>Média dos valores: " + m + "</html>");

    }

}
