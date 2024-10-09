import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Loe");
        nomes.add("Lucas");

        // indice 0 -> Joao
        System.out.println(nomes.get(0));

        nomes.remove(0);

        // indice 0 -> Loe
        System.out.println(nomes.get(0));
    }
}