
package fatorialnumerosmaiores;

import java.math.BigInteger;

/**
 *
 * @author arthurnatureza
 */
public class FatorialNumerosMaiores {

    public static void main(String[] args) {
        // TODO code application logic here
        long mult = 1;
        for(int i = 1; i <=20; i++){
            mult = mult * i;
            System.out.printf("Fatorial de %d! = %d\n", i, mult);
        }
        /*O código só funciona com núm maiores se usar long em vez de int,
         *pois o int só vai até 2147483, porém, mesmo com o long, só vai até 20,
         *pois causa um estouro nas casas.
         *Para fatoriais maiores que 20 devemos usar a classe BigInteger
         *importando o pacote java.math
        */
        System.out.println("\nAgora de 1 até 40:\n");
        BigInteger fat = BigInteger.ONE;
        for(int i = 1; i <= 40; i++){
            fat = fat.multiply(BigInteger.valueOf(i));
            System.out.printf("Fatorial de %d! = %d\n", i, fat);
        }
    }    
    
}
