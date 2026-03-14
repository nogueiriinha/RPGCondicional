import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        
        System.out.print("\nDigite sua idade: ");
        
        Scanner leia = new Scanner(System.in);

        int idade = leia.nextInt();

        if(idade >= 18){
            System.out.println("\nOlá aventureiro!");
        }else{ 
            System.out.println("\nMuito pigmeu ainda. Volte daqui uns anos!");
        }
        
        leia.close();

    }
}
