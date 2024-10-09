public class main {
    public static void main(String[] args) {

        // for similar ao C
        for (int i = 0; i < 10; i++) {
            System.out.println("valor de i: " + i);
        }

        String[] nomes = new String[10];

        nomes[0] = "Pedro";
        nomes[1] = "Paulo";
        nomes[2] = "Fernando";

        // 'for' simples
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }

        // controlando o próprio loop
        short contador = 0;
        while (contador < 4) {
            System.out.println("dentro do while, contador: " + contador);
            contador++;
        }
    }
}