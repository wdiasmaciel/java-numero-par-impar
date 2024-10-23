import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        num = teclado.nextInt();

        if(num % 2 == 0)
            System.out.println("O número " + num + " é par!");
        else
            System.out.println("O número " + num + " é ímpar!");
        
        teclado.close();
    }
}