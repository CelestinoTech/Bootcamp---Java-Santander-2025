import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        HomeAppBank conta = new HomeAppBank(0, 0, 0, 0, 0, false, false);
        int option;
        float value;

        System.out.println("Olá, Bem Vindo(a)");


        do {
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Consultar Saldo");
            System.out.println("3 - Consultar Cheque Especial");
            System.out.println("4 - Deposito");
            System.out.println("5 - Saque");
            System.out.println("6 - Pagar Boleto");
            System.out.println("7 - Utilizando Cheque Especial");
            System.out.println("8 - Sair");

            System.out.println("Selecione uma opção para prosseguir");
            option = input.nextInt();

            if (option == 8) {
                break;
            } else {
                switch (option) {
                    case 1:
                        if (conta.isExistAccount()){
                            System.out.println("Conta ja existente:");
                        }else{
                            System.out.println("Vamos Criar sua conta:");
                            System.out.println("Digite o valor: ");
                            conta.createAccount(input.nextFloat());
                            if (conta.isExistAccount()) {
                                System.out.println("Conta Criada Com Sucesso");
                            }
                        }
                        break;
                    case 2:
                        if (conta.isExistAccount()){
                            System.out.println("Saldo: " + conta.getBalance());
                        }else {
                            System.out.println("Crie uma conta para verificar");
                        }
                        //TimeUnit.SECONDS.sleep(30);
                        break;
                    case 3:
                        if (conta.isExistAccount()){
                            System.out.println("Cheque Especial: " + conta.getEspecialCheck());
                        }else {
                            System.out.println("Crie uma conta para verificar");
                        }
                        break;
                    case 4:
                        if (conta.isExistAccount()){
                            System.out.println("Deposito:");
                            System.out.println("Digite um valor para o deposito:");
                            conta.deposit(input.nextFloat());
                            input.nextLine();
                        }else {
                            System.out.println("Crie uma conta para realizar um deposito");
                        }
                        break;
                    case 5:
                        if (conta.isExistAccount()) {
                            System.out.println("Saque:");
                            System.out.println("Digite um valor para realizar o saque:");
                            conta.sake(input.nextFloat());
                        }else{
                            System.out.println("Crie uma conta para realizar o saque");
                        }
                        break;
                    case 6:
                        if (conta.isExistAccount()){
                            System.out.println("Pagar Boleto:");
                            System.out.println("Digite um valor para realizar o pagamento do boleto:");
                            conta.payTicket(input.nextFloat());
                        }else {
                            System.out.println("Crie uma conta para realizar pagamentos");
                        }
                        break;
                    case 7:
                        if (conta.isExistAccount()){
                            if (conta.isUseEspecialCheck()) {
                                System.out.println("Você está utilizando o cheque especial.");
                            } else {
                                System.out.println("Você não está utilizando o cheque especial.");
                            }
                        }else {
                            System.out.println("Crie uma conta para realizar pagamentos");
                        }
                        break;
                    default:
                        System.out.println("Erro, tente novamente");
                        break;
                }
            }
        } while (true);
    }
}
