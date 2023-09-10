import java.util.Scanner;

//package java.util
public class Main {//class
    public static void main(String[] args) {//method
        Scanner idadeScanner = new Scanner(System.in);

        //primitivos
        byte minhaIdade = 26;
        int salarioMensal = 50_000;
        long idadeMilisegundos = 788400000000L;
        double altura = 1.74;
        char initial = 'A';
        boolean eMaiorDeIdade = true;

        //referencias
        String firsName = "wilker ferreira";

        System.out.println("digite a sua idade");
        byte idadeCliente = idadeScanner.nextByte();




        System.out.println("sua idade é " + idadeCliente);
        System.out.println("Hello world!");//statement

    }
}