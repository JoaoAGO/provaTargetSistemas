package respostas;

import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == numero) {
            System.out.println(numero + " O número digitado pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " O número digitado não pertence à sequência de Fibonacci.");
        }
    }
}
