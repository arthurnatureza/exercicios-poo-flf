
package somadeumatequinhentosdoze;

/**
 *
 * @author arthurnatureza
 */
public class SomaDeUmAteQuinhentosDoze {

    public static void main(String[] args) {
        // TODO code application logic here
        int soma = 1;
        int aux = 0;
        for(int i = 1; i < 512; ++i){
            soma += (i + 1);
            System.out.println(soma);
            
        }
    }
    
}
