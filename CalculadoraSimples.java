import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        //  Declaração de Variáveis
        int n1, n2, total;

        // Criação e Instância do Obj. de Entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");

        // Entrada
        System.out.println("Soma Simples: ");
        System.out.println("Informe 'n1':");
        n1 = entrada.nextInt();
        System.out.println("Informe 'n2':");
        n2 = entrada.nextInt();

        // Processamento
        total = n1 + n2;

        // Saída
        System.out.println("O Calculo é: " + n1 + " + " + n2 + " = " + total);
    }    
}
