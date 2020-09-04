
package parouimpar;

import java.util.Scanner;

/**
 *
 * @author arthurnatureza
 */
public class ParOuImpar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = teclado.nextInt();
        System.out.printf("%d", x);
        do{
            if(x%2==0){
                x = (x / 2);
            } else{
                x = (3*x) + 1;
            }
            System.out.printf(" > %d", x);
        }
        while (x != 1);
        System.out.println("");
    }
    
}
