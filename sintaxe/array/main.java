public class main {

    public static void main(String[] args) {

        int idade = 20;

        System.out.println("Programa:");

        //               0  1  2  3  4
        int[] colecao = {11,23,31,45,54};
        colecao[3] = 44;

        System.out.println(colecao.length);
        // posicao do array
        System.out.println(colecao[4]);

        // define o tamanho do vetor
        int[] colecaoDefinida = new int[8];
        // este ultimo nao printa nada
    }
}

