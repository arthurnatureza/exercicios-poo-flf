
package fatorialdeumadez;

/**
 *
 * @author arthurnatureza
 */
public class FatorialDeUmAdez {

    public static void main(String[] args) {
        // TODO code application logic here
        int mult = 1;
        for(int i = 1; i <=10; ++i){
            mult = mult * i;
            System.out.printf("Fatorial de %d! = %d\n", i, mult);
        }
        
    }
    
}
