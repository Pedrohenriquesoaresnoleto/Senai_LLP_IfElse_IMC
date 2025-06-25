import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Informe seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String interpretacao;
        if (imc < 18.5) {
            interpretacao = "Abaixo do peso";
        } else if (imc < 25.0) {
            interpretacao = "Peso normal";
        } else if (imc < 30.0) {
            interpretacao = "Sobrepeso";
        } else {
            interpretacao = "Obesidade";
        }

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Interpretação: " + interpretacao);

        scanner.close();
    }
}