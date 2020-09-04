
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
        System.out.printf("Gasto total do mês: R$%d \n", gastoTotal);
        
        //Para calcular médias devo usar o float, pois o resultado pode ser um 
        //número real, com diversas casa decimais a direita do ponto, o que 
        //exige uma variável float
        float mediaDeGastos = (gastoTotal/4);
        System.out.printf("Média dos Gastos: R$%.2f \n", mediaDeGastos);
        
    }
    
}
