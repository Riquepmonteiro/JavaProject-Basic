import java.util.Scanner;  // Importa a classe Scanner para ler a entrada do usuário

public class ContaTerminal {

    public static void main(String[] args) {

         //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        Scanner scanner = new Scanner(System.in);  // Inicializa o Scanner para capturar dados do terminal

        // Solicita o número da agência e armazena a entrada do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();  // Lê o valor da agência como String

        // Solicita o número da conta e armazena a entrada do usuário
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();  // Lê o valor da conta como inteiro
        scanner.nextLine();  // Consome a linha restante após a entrada do número

        // Solicita o nome do cliente e armazena a entrada do usuário
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();  // Lê o nome do cliente como String

        // Solicita o saldo da conta e armazena a entrada do usuário
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();  // Lê o saldo da conta como double

        // Exibe a mensagem final para o usuário utilizando concatenação de Strings
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();  // Fecha o Scanner para liberar os recursos
    }
}
