import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DadosBancarios dadosBancarios = new DadosBancarios();
        
        System.out.print("Por favor, digite seu nome: ");
        dadosBancarios.nomeCliente = sc.nextLine();
        
        System.out.print("Por favor, digite o número da Agência: ");
        dadosBancarios.agencia = sc.next();
        
        System.out.print("Por favor, digite o número da conta: ");
        dadosBancarios.numero = sc.nextInt();
        
        System.out.print("Digite o valor de depósito Inicial com '.' em vez de virgula Ex:2.50 : ");
        dadosBancarios.saldo = sc.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
        dadosBancarios.nomeCliente,dadosBancarios.agencia,dadosBancarios.numero,dadosBancarios.saldo);
        
        
    }
}
