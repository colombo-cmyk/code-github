import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do prato: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1 -> System.out.println("Salada");
            case 2 -> System.out.println("Arroz e feijão");
            case 3 -> System.out.println("Espaguete ao sugo");
            case 4 -> System.out.println("Misto quente");
            case 5 -> System.out.println("Misto frio");
            case 6 -> System.out.println("Arroz e ovo frito");
            default -> System.out.println("Prato indisponível");
        }

        sc.close();
    }
}
