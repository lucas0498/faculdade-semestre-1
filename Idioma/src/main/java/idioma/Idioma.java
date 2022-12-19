/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package idioma;

import java.util.Locale;

/**
 *
 * @author McLOVIN
 */
public class Idioma {

    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + local.getDisplayLanguage());
    }
}
