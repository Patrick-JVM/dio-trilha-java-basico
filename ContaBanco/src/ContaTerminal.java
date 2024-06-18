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
        
        
        System.out.println("Deseja fazer um deposito? digite (1)Sim ou (2)Não");
        int resposta = dadosBancarios.pergunta = sc.nextInt();
        
        if(resposta == 1){
            System.out.print("Por favor, digite o valor do deposito: ");
            dadosBancarios.saldo = sc.nextDouble();
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f.\n",
            dadosBancarios.nomeCliente,dadosBancarios.agencia,dadosBancarios.numero,dadosBancarios.saldo);
            
        }else{
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f.\n",
            dadosBancarios.nomeCliente,dadosBancarios.agencia,dadosBancarios.numero,dadosBancarios.saldo);
        }
        
    }
}
