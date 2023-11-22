import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por Favor, digite o número da agência:");
        String numeroAgencia = scan.nextLine();
        System.out.println("Por favor digite o número da conta:");
        int numeroConta = scan.nextInt();
        System.out.println("Digite o valor de depósito:");
        double valorDeposito = scan.nextDouble();
        System.out.println("Entre com seu nome e sobrenome : ");
        String nome = scan.nextLine();
        String sobrenome = scan.nextLine();
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        ContaTerminal novaconta =  new ContaTerminal(numeroConta, numeroAgencia,nomeCompleto ,valorDeposito);

        System.out.print("Olá " + novaconta.getNomeCliente() + " obrigado por criar uma conta no nosso banco, sua Agência é : " + novaconta.getAgencia() + " conta: " + novaconta.getNumero() + " e seu saldo de : R$");
        System.out.printf("%.2f", novaconta.getSaldo());
        System.out.println( " já está disponível para saque");
    }
}
