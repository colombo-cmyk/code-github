import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        apresentarMenu();
        int escolha = sc.nextInt();
        tratarEscolha(escolha);
        sc.close();
    }

    static void apresentarMenu() {
        System.out.println("=== Cardápio ===");
        System.out.println("1 - Salada");
        System.out.println("2 - Arroz e feijão");
        System.out.println("3 - Espaguete ao sugo");
        System.out.println("4 - Misto quente");
        System.out.println("5 - Misto frio");
        System.out.println("6 - Arroz e ovo frito");
        System.out.print("Escolha uma opção: ");
    }

    static void tratarEscolha(int opcao) {
        switch (opcao) {
            case 1 -> salada();
            case 2 -> arrozFeijao();
            case 3 -> espaguete();
            case 4 -> mistoQuente();
            case 5 -> mistoFrio();
            case 6 -> arrozOvo();
            default -> indisponivel();
        }
    }

    static void salada() { System.out.println("Você escolheu: Salada"); }
    static void arrozFeijao() { System.out.println("Você escolheu: Arroz e feijão"); }
    static void espaguete() { System.out.println("Você escolheu: Espaguete ao sugo"); }
    static void mistoQuente() { System.out.println("Você escolheu: Misto quente"); }
    static void mistoFrio() { System.out.println("Você escolheu: Misto frio"); }
    static void arrozOvo() { System.out.println("Você escolheu: Arroz e ovo frito"); }
    static void indisponivel() { System.out.println("Prato indisponível"); }
}
