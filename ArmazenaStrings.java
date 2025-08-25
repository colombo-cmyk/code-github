import java.util.Scanner;

public class ArmazenaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linhas = new String[128];
        int count = 0;

        while (count < 128) {
            String linha = sc.nextLine();
            linhas[count] = linha;
            if (linha.endsWith("fim")) {
                break;
            }
            count++;
        }

        System.out.println("Linhas em ordem inversa:");
        for (int i = count; i >= 0; i--) {
            System.out.println(linhas[i]);
        }

        sc.close();
    }
}
