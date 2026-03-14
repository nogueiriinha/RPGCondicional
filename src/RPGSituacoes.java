import java.util.Scanner;

public class RPGSituacoes {
    public static void main(String[] args) {

        int way = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual caminho você gostaria de seguir?");
        System.out.println("\n(1) Caverna");
        System.out.println("(2) Lago");
        System.out.println("(3) Ruínas");
        System.out.println("(4) Montanhas");
        way = leia.nextInt();

        switch (way) {
            case 1: //Não há a necessidade de ' ' pois não é um caracter e sim um número
                System.out.println("\nVocê entrou na caverna e encontrou um dragão adormecido!");
                break;

            case 2:
                System.out.println("\nVocê chegou ao lago e encontrou um espírito da água que lhe oferece uma poção.");
                break;

            case 3:
                System.out.println("\nVocê encontrou ruínas antigas e um baú com um artefato mágico!");
                break;

            case 4:
                System.out.println(
                        "\nVocê atravessou as montanhas geladas e encontrou um antigo templo onde uma espada lendária repousa em um altar de pedra.");
                break;

            default:
                System.out.println("\nCaminho desconhecido. Você se perdeu na floresta.");
        }
        leia.close();
    }

}
