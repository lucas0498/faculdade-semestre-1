/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author McLOVIN
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("A sua tela tem resolução: " + largura + "x" + altura);
    }
}
