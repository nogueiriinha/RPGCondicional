import java.util.Scanner;

public class ADO2Preparatorio {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int s;

        System.out.println("\nInsira um número de 1 a 7 para descobrir o dia da semana correspondente:");
        s = leia.nextInt();

        switch (s) {
            case 1:
                System.out.println("\nDomingo");
                break;

            case 2:
                System.out.println("\nSegunda-feira");
                break;

            case 3:
                System.out.println("\nTerça-feira");
                break;

            case 4:
                System.out.println("\nQuarta-feira");
                break;

            case 5:
                System.out.println("\nQuinta-feira");
                break;

            case 6:
                System.out.println("\nSexta-feira");
                break;

            case 7:
                System.out.println("\nSábado");
                break;

            default:
                System.out.println("\nValor inválido!");
        }
        leia.close();
    }

}
