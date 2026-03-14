import java.util.Scanner;

public class RPG1 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        //Variáveis para armanezar características do personagem
        int forca = 0;
        int magia = 0;

        System.out.print("\nFala aí seu gostosão!");
        System.out.print("\nEscolha sua classe entre as opções: \n(1) Mago \n(2) Guerreiro\n ");

        int escolha = leia.nextInt();

        if(escolha == 1){
            System.out.println("Você será um Mago épico!");
            System.out.println("Atributos: ");
            forca = 3;
            magia = 10;
            System.out.println("Magia: "+ magia);
            System.out.println("Força: "+ forca);
        }else if(escolha == 2){
            System.out.println("Você será um Guerreiro lendário!");
            System.out.println("Atributos: ");
            forca = 10;
            magia = 2;
            System.out.println("Magia: "+ magia);
            System.out.println("Força: "+ forca);
        }else{
            System.out.println("Opção inválida!");
        }

        leia.close();

            
    } //Fim do main

} //Fim da classe
//Não funciona o código a partir daqui.
