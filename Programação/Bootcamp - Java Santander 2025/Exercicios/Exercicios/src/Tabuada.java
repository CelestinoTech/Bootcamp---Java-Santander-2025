import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int numero,mult;
    
            System.out.println("Digite um numero:");
            numero = input.nextInt();
            for(int i=1;i<=10;i++){
                mult = numero * i;
                System.out.printf("%d X %d = %d\n",numero,i,mult);
            }
    }
    
    
   


}
