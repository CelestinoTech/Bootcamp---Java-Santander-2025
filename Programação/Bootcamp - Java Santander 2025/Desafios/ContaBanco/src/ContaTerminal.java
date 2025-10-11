import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia,nomeCliente;
        float saldo;

        System.out.println("Por Favor, digite seu nome:");
        nomeCliente = input.nextLine();
        System.out.printf("Ola %s Por Favor, digite o número \n",nomeCliente);
        numero = input.nextInt();
        System.out.println("Digite o número da Agencia");
        agencia = input.nextLine();
        input.nextLine();
        System.out.println("Digite o saldo");
        saldo = input.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque\n",nomeCliente,agencia,numero,saldo);
    }
}
