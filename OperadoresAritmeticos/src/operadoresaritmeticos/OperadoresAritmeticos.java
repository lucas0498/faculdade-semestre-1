package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        
        System.out.println("media: " + m);
        
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        
        int x = 4;
        x *= x; // x = x * 2
        System.out.println(x);
        
        double i = Math.pow(2,63);
        System.out.println(i);
        
        float v = 8.5f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
        
        double ale = Math.random();
        int o = (int) (1 + ale *(9-1));
        System.out.println(o);
                
    }

}
