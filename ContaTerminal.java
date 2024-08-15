import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Step 1: Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Display messages and obtain input
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        // Consuming the newline left after nextInt()
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Step 3: Display the account creation confirmation message
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Close the scanner
        scanner.close();
    }
}
