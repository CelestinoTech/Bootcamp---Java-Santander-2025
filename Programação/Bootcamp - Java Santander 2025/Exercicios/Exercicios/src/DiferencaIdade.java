import java.util.Scanner;
public class DiferencaIdade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome1,nome2;
        int idade1,idade2,calculo;

         System.out.println("Por Favor, digite o nome da primeira pessoa:");
         nome1 = input.nextLine();
         System.out.println("Por Favor, digite a idade da primeira pessoa:");
         idade1 = input.nextInt();
         input.nextLine();
         System.out.println("Por Favor, digite o nome da segunda pessoa:");
         nome2 = input.nextLine();
         System.out.println("Por Favor, digite a idade da segunda pessoa:");
         idade2 = input.nextInt();
         calculo = idade1 - idade2;
         if(calculo < 0){
            calculo = (idade1 - idade2) * -1;
            //System.out.printf("\n Nome Primeira Pessoa: %s \n Idade Primeira Pessoa: %d \n Nome Segunda Pessoa %s \n Idade Segunda Pessoas %d \n Diferenca: %d \n",nome1,idade1,nome2,idade2,calculo);
         }
           System.out.printf("\n Nome Primeira Pessoa: %s \n Idade Primeira Pessoa: %d \n Nome Segunda Pessoa %s \n Idade Segunda Pessoas %d \n Diferenca: %d \n",nome1,idade1,nome2,idade2,calculo);
         




         
    }
}