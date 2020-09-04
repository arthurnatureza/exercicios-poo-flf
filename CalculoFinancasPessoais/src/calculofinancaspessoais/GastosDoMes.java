
package calculofinancaspessoais;
/**
 * @author arthurnatureza
 */
public class GastosDoMes {

    public static void main(String[] args) {
        // TODO code application logic here
        int gastosAlimentacao = 600;
        int gastoSaude = 1000;
        int gastoTransporte = 500;
        int gastoLazer = 400;
        int gastoTotal = gastosAlimentacao + gastoSaude + gastoTransporte + gastoLazer;
        System.out.printf("Gasto total do mês: %d \n", gastoTotal);
        
    }
    
}
