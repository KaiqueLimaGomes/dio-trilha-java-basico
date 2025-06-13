import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Declaração de variáveis
        int numeroAgencia;
        int numeroConta;
        String nomeCliente;
        float saldo;

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");

        System.out.println("Por favor, digite o número da Conta !");
            numeroConta = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o número da Agência !");
            numeroAgencia = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o nome do Cliente !");
            nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da Conta !");
            saldo = Float.parseFloat(scanner.nextLine());
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d,   conta %d e seu saldo %.2f já está disponível para saque%n",
            nomeCliente, numeroAgencia, numeroConta, saldo);
        
        scanner.close();
    
    }
}
