import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner variavel = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        int numero = variavel.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = variavel.nextInt();

        System.out.println("Digite seu nome!");
        String nomeCliente = variavel.next();

        System.out.println("Digite seu saldo!");
        double saldo = variavel.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}