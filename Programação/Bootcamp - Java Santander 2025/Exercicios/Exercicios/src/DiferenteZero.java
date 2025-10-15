import java.util.Scanner;
public class DiferenteZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInicial,numeroDividir,calculo;


        System.out.println("Digite um numero: ");
        numeroInicial = input.nextInt();



        do{
            System.out.println("Digite outro numero: ");
            numeroDividir = input.nextInt();
            if(numeroDividir < numeroInicial){
                 System.out.println("Ignorado");
                numeroDividir = input.nextInt();
            }
        }while( numeroDividir% numeroInicial == 0);
    }
}
