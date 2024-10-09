package sintaxe.casting;

public class main {
    public static void main(String[] args) {
        
        // convertendo variaveis

        // double para int
        double idade = 24.0;
        int idadeInt = (int) idade;
        System.out.println(idadeInt);

        // int para double
        int litros = 40;
        double litrosDouble = litros;
        System.out.println(litrosDouble);

        // string para int
        String meuString = "13";
        int intString = Integer.parseInt(meuString);
        System.out.println(intString);

        // int para string
        String minhaString = String.valueOf(intString);
        System.out.println(minhaString);
    }
}
