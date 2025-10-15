import java.util.Scanner;
public class ImparPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1,numero2,opcao;

        System.out.println("Digite um numero: ");
        numero1 = input.nextInt();
        do { 
            System.out.println("Digite outro numero maior que o primeiro");
            numero2 = input.nextInt();    
        } while (numero2 <= numero1);
        
        System.out.printf("Escolha o tipo de número que deseja ver: \n1 - Impar \n2 - Par\n" + //
                        "");
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
            System.out.printf("Numeros Impares: ");    
                while(numero2 != numero1){
                    if(numero2 % 2 != 0){
                        System.out.printf("%d,",numero2);
                    }  
                    numero2--;
                }
                break;
            case 2:
            System.out.printf("Numeros Pares: ");
                while(numero2 != numero1){
                    if(numero2 % 2 == 0){
                        System.out.printf("%d,",numero2);
                    }
                    numero2--;  
                }
            break;
            default:
            System.out.println("Erro, Tente Novamente");
        }
    }
}
