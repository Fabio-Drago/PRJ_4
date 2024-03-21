import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        //Here we have our menu and the Scanner is going to read everything.
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>>>>>Menu<<<<<<<<");
        System.out.println("1 - Ver tamanho do texto");
        System.out.println("2 - Calcular área e perímetro de um quadrado");
        System.out.println("3 - Somar dois números");
        System.out.println("4 - Subtrair dois números");
        System.out.println("5 - Dividir os números");
        System.out.println("6 - Sair");
        
        int escolha = Integer.parseInt(scanner.nextLine()); //Read one option
        
        if (escolha == 1) {

            System.out.println("Digite a palavra:");
            String txt = scanner.nextLine(); // Read all line as text
            System.out.println("Tamanho do texto: " + txt.length());

        } else if (escolha == 2) {

            System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble(); // side of the square
            double area = lado * lado; //  Multiply the side of the square
            double perimetro = 4 * lado; //  Multiply Area with the side of the square to find the perimeter

            System.out.println("Área do quadrado: " + area);
            System.out.println("Perímetro do quadrado: " + perimetro);

        }else if(escolha==3){

            System.out.println("Digite o primeiro número");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número");
            int numero2 = scanner.nextInt();
            int numerofinal = numero1 + numero2;
            System.out.println("A soma é: " + numerofinal);

        }else if(escolha==4){

            System.out.println("Digite o primeiro número");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número");
            int numero2 = scanner.nextInt();
            int numerofinal = numero1 - numero2;
            System.out.println("A subtraçao é: " + numerofinal);

        }else if(escolha==5){

            System.out.println("Digite o primeiro número");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número");
            int numero2 = scanner.nextInt();
            int numerofinal = numero1 / numero2;

            if(numero1==0) 
                System.out.println("Nao é possivel dividir por zero");
            else
            System.out.println("A subtraçao é: " + numerofinal);

        }else if(escolha==6) {

            System.out.println("Terminado!");

        } else {
            System.out.println("Opção inválida!");
        }

       scanner.close(); // Close the scan after using
    }
}
