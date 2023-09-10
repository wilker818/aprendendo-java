import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        String number = entradaDados.next();
        int digitosTotal = 0;

        for(char caracter : number.toCharArray()){
            int asciiCode = (int)caracter;
            if(asciiCode >= 48 &&  asciiCode <= 57) digitosTotal++;
        }

        if(digitosTotal >= 5){
            System.out.format("Este numero tem %d digitos ou mais", digitosTotal);
        } else{
            System.out.format("Este numero tem %d digitos", digitosTotal);
        }

    }
}