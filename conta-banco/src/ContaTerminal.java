import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número da conta. ");
        int numeroConta = sc.nextInt();

        System.out.println("Insira o número da agência.");
        int numeroAgencia = sc.nextInt();

        System.out.println("Insira o seu nome. ");
        String nomeCliente = sc.next();

        System.out.println("Insira o saldo da conta. ");
        double saldoConta = sc.nextDouble();

        System.out.println("Olá," + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + " e sua conta é " + numeroConta + ". Seu saldo de " + saldoConta + " já está disponível para saque.");

    }
}
