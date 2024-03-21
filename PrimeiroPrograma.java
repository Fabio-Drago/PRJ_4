import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>>>>>Menu<<<<<<<<");
        System.out.println("1 - Ver tamanho do texto");
        System.out.println("2 - Converter texto para número");
        System.out.println("3 - Sair");
        
        int escolha = Integer.parseInt(scanner.nextLine()); // Ler a escolha do usuário
        
        if (escolha == 1) {
            System.out.println("Digite a palavra:");
            String txt = scanner.nextLine(); // Ler a linha inteira como texto
            System.out.println("Tamanho do texto: " + txt.length());
        } else if (escolha == 2) {
            System.out.println("Digite um texto:");
            String textoNumero = scanner.nextLine(); // Ler a linha inteira como texto
            try {
                int numero = Integer.parseInt(textoNumero); // Converter o texto em número
                System.out.println("Texto convertido: " + textoNumero);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter texto para número: Formato inválido!");
            }
        } else if (escolha == 3) {
            System.out.println("Terminado!");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close(); // Fechar o scanner após a utilização
    }
}
