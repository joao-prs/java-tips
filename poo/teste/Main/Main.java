package teste.Main;

import teste.environment.Pessoa;

public class Main {
    public static void main(String[] args) {
        // inicia o programa
        System.out.println("start program 'teste'");

        Pessoa pessoa1 = new Pessoa("01234567899");
        System.out.println("cpf do Pessoa: "+ pessoa1.getCpf());
    }
}
