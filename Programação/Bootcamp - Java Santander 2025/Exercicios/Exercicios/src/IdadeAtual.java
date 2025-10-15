import java.util.Scanner;
import java.util.Calendar;
public class IdadeAtual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar dt = Calendar.getInstance();
        String nome;
        int ano,calculo;

        System.out.println("Digite seu nome:");
        nome = input.nextLine();
        System.out.println("Digite o ano do seu nascimento");
        ano = input.nextInt();
        calculo = dt.get(Calendar.YEAR) - ano;
        System.out.printf("Ola %s voce tem %d anos",nome,calculo);
    }
}
