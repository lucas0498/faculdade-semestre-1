package horadosistema;

import java.util.Date;


public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date(); // usar a palavra "new" significa que está criando um novo objeto
        System.out.println("A hora do sistema");
        System.out.println(relogio.toString());
    }
}
