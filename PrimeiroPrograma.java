import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>>>>>Menu<<<<<<<<");
        System.out.println("1 - Ver tamanho do texto");
        System.out.println("2 - Calcular área e perímetro de um quadrado");
        System.out.println("3 - Sair");
        
        int escolha = Integer.parseInt(scanner.nextLine()); // Ler a escolha do usuário
        
        if (escolha == 1) {
            System.out.println("Digite a palavra:");
            String txt = scanner.nextLine(); // Ler a linha inteira como texto
            System.out.println("Tamanho do texto: " + txt.length());
        } else if (escolha == 2) {
            System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble(); // Ler o lado do quadrado
            double area = lado * lado; // Calcular a área do quadrado
            double perimetro = 4 * lado; // Calcular o perímetro do quadrado
            System.out.println("Área do quadrado: " + area);
            System.out.println("Perímetro do quadrado: " + perimetro);
        } else if (escolha == 3) {
            System.out.println("Terminado!");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close(); // Fechar o scanner após a utilização
    }
}
