import java.util.Scanner;
public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base,altura,calculo;

            System.out.println("Digite base:");
            base = input.nextFloat();
            System.out.println("Digite altura:");
            altura = input.nextFloat();
            calculo = (base * altura)/2;
            System.out.printf("Area do Triangulo: %.2f",calculo);
    }
}
