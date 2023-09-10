import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        /* Formatando Números em Java */
        NumberFormat pound  = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(120.80);

        System.out.println(productValue);

        /* Operadores de comparação */
        int a = 4;
        int b = 5;

        System.out.println(a >= b);

        /* Operador Logico AND */
        //priceProduct  = $20
        // comprar somente entre $10 e $15
        int  priceProduct = 20;
        boolean buy = priceProduct >= 10 && priceProduct <= 15;

        System.out.println(buy);

        /* Operador Logico OR */
        // priceProduct  = $20
        // comprar somente entre $10 e $15
        boolean temEmprego = false;
        boolean temEmpresa = true;
        boolean tem50k = true;
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;

        System.out.println("Pode financiar? " + podeFinanciar);

        /* Condicionais IF e ELSE */
        int valorCarro = 100_000;
        if (valorCarro > 100_000) {
            System.out.println("não compra. está acima da tabela");
        } else if (valorCarro  >= 90_000 && valorCarro <=100_000) {
            System.out.println("Comprar o carro");
        } else {
            System.out.println("Não compra.Valor abaixo da Tabela");
        }

        /* Operadores Ternário */
        int ingresso = 800;
        //String terAcesso = "Pista";
        String terAcesso = (ingresso >= 500) ? "VIP" : "Pista";

        /*
        if(ingresso >= 500){
            terAcesso = "VIP";
        }
        */

        System.out.println(terAcesso);
    }
}