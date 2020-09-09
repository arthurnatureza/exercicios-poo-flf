
package modelandoconta;

/**
 *
 * @author arthurnatureza
 */
public class ModelandoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        Data d1 = new Data();
        
        c1.nome = "Arthur";
        c1.numero = 57052;
        c1.abertura = d1;
        c1.abertura.dia = 9;
        c1.abertura.mes = 9;
        c1.abertura.ano = 2020;
        c1.agencia = "3190-2";
        c1.saldo = 1000;
        System.out.println(c1.recuperaDadosParaImpressao());
        
        
        //System.out.println("Saldo inicial: " + c1.saldo);
        c1.sacar(200);
        System.out.println("Saldo apos saque: " + c1.saldo);
        c1.depositar(350);
        System.out.println("Saldo apos deposito: " + c1.saldo);
        System.out.println("Rendimento: " + c1.calcularRendimento());
        
        /*System.out.println("\n\n");
         *
         *Conta c2 = new Conta();
         *c2.nome = "Aline";
         *c2.numero = 57053;
         *c2.abertura = "10/09/2020";
         *c2.agencia = "3190-2";
         *c2.saldo = 1230;
         *System.out.println(c2.recuperaDadosParaImpressao());
        */
        
        
    }
    
}
