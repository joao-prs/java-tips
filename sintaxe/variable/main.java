package sintaxe.variable;

public class main {
    
    public static void main(String[] args) {
        
        // todos os tipos primitivos

        // byte | 8 bits | -128 a 127
        byte byt = 100;
        System.out.println(byt);

        // short | 16 bits | -32.768 a 32.767
        short sho = 12000;
        System.out.println(sho);
        
        // int | 32 bits | -2.147.483.648 a 2.147.483.647
        int inteiro = 100000;
        System.out.println(inteiro);
        
        // long | 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long lon = 101222L;
        System.out.println(lon);
        
        // float | 32 bits | -3.4028235e38 a 3.4028235e38
        float flo = 10.5f;
        System.out.println(flo);

        // double | 64 bits | -1.7976931348623157E308 a 1.7976931348623157E308
        double dou = 20.2;
        System.out.println(dou);

        // boolean | 1 bit   | 0 a 1
        boolean bool = false;
        System.out.println(bool);

        // char    | 16 bits | '\u0000' a '\uffff'
        char meuChar = 'A';
        System.out.println(meuChar);
    }
}
