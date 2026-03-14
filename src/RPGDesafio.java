import java.util.Scanner;

public class RPGDesafio {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        //Variáveis para armanezar características do personagem
      

        System.out.print("\nOlá mundano!\n");
            leia.nextLine(); //Pula a linha entrando com ENTER
        System.out.print("\nEscolha sua classe entre as opções: \n(1) Mago \n(2) Guerreiro\n ");
            int escolha = leia.nextInt();
        System.out.println("\nQual o seu nível atual?");
            int nivel = leia.nextInt();
        System.out.println("\nQual o seu nível da sua Força?");
            int forca = leia.nextInt();
        System.out.println("\nQual o seu nível de Magia?");
            int magia = leia.nextInt();



        if((escolha == 1) && (nivel >= 10) && (magia >= 8)){
            leia.nextLine();
            System.out.println("\nBem vindo à Guilda dos Magos!\nVocê será um Mago épico!");
            leia.nextLine();
            System.out.println("\nAtributos: ");
            System.out.println("Magia: "+ magia);
            System.out.println("Força: "+ forca);
        }else if((escolha == 2) && (nivel >= 10) && (forca >= 8)){
            leia.nextLine();
            System.out.println("\nSeja bem vindo à Guilda dos Guerreiros!\nVocê será um Guerreiro lendário!");
            leia.nextLine();
            System.out.println("\nAtributos: ");
            System.out.println("Magia: "+ magia);
            System.out.println("Força: "+ forca);
        }else if((magia >= 8) || (forca >= 8) && (nivel < 10)){
            System.out.println("\nVocê possui talento, mas precisa elevar seu nível.");
        }else{
            System.out.println("\nTreine mais antes de entrar na Guilda.");
        }
        
        leia.close();

            
    } //Fim do main

} //Fim da classe
//Não funciona o código a partir daqui.
