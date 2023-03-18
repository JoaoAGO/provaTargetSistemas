package respostas;

import java.util.Scanner;
public class questao5 {
        public static void main(String[] args) {
            Scanner str = new Scanner(System.in);
            String teclado = str.nextLine();
            String strInvertida = "";

            for (int i = teclado.length() - 1; i >= 0; i--) {
                strInvertida += teclado.charAt(i);
            }
            System.out.println("String invertida: " + strInvertida);
        }
}
