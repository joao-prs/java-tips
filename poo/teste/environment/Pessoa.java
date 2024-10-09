package teste.environment;

public class Pessoa {
    // String cpf precisa ser publica para ser acessivel pelo Main
    public String cpf;

    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
}