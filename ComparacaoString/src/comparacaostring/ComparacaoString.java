package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo");
        String res;
        res = (n1.equals(n3))? "igual":"diferente"; //para objetos, ao invés de usar == usa-se equals
        //res = (n1==n2)? "igual":"diferente";
        System.out.println(res);
    }
    
}
