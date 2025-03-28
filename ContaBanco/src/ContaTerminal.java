import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo: ");
        float saldo =  sc.nextFloat();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para o saque.");
    }
}
