import java.util.Scanner;

public class menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void iniciar() {
        String opcao;

        do {
            System.out.println("\n=== CALCULADORA POO ===");
            System.out.println("Escolha a operação:");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Potência");
            System.out.println("[6] Raiz Quadrada do primeiro número");
            System.out.println("[Q] Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine().toUpperCase();

            if (opcao.equals("Q")) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            double numeroUm = lerNumero("Informe o primeiro número: ");

            double numeroDois = 0;
            if (!opcao.equals("6")) { // Raiz só usa o primeiro número
                numeroDois = lerNumero("Informe o segundo número: ");
            }

            calculadora calc = new calculadora(numeroUm, numeroDois);
            switch (opcao) {
                case "1":
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case "2":
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case "3":
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case "4":
                    System.out.println("Resultado: " + calc.dividir());
                    break;
                case "5":
                    System.out.println("Resultado: " + calc.potencia());
                    break;
                case "6":
                    System.out.println("Resultado: " + calc.raizQuadrada());
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals("Q"));
    }

    private static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return Double.parseDouble(scanner.nextLine());
    }
}