import java.util.Scanner;

public class ADO2Preparatorio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println(
                "\nConverta o número binário 11001111(2) para Hexadecimal e selecione a alternativa correta: ");
        System.out.println("\na - CC(16)");
        System.out.println("b - AC(16)");
        System.out.println("c - CA(16)");
        System.out.println("d - CF(16)");
        System.out.println("e - AF(16)\n");
        char resposta = leia.nextLine().charAt(0);

        switch (resposta) {
            case 'a':
                System.out.println("\nResposta incorreta.");
                break;

            case 'b':
                System.out.println("\nResposta incorreta.");
                break;

            case 'c':
                System.out.println("\nResposta incorreta.");
                break;

            case 'd':
                System.out.println("\nResposta correta! CF(16)");
                break;

            case 'e':
                System.out.println("\nResposta incorreta.");
                break;

            default:
                System.out.println("\nSeleção inválida. Por favor escolha uma alternativa expressa na questão.");
        }

        leia.close();
    }

}
