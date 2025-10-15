import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso,altura,imc;

        System.out.println("Digite sua altura");
        altura = input.nextFloat();
        System.out.println("Digite seu peso");
        peso = input.nextFloat();
        imc = peso / (altura*altura);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Um pouco acima do peso");
        }else if (imc >= 30 && imc <= 34.9 ) {
            System.out.println("Obesidade Grau I");
        }else if(imc >= 35 && imc < 39.9 ){
            System.out.println("Obesidade Grau II");
        }else{
            System.out.println("Obesidade Grau III");
        }
    }
}
