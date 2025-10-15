import java.util.Scanner;
public class AreaQuadrado {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float lado,calculo;

            System.out.println("Digite medida:");
            lado = input.nextFloat();
            calculo = lado * lado;
            System.out.printf("Area do Quadrado: %.2f",calculo);
        }
}
