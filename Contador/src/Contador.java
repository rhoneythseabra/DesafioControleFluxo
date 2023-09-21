import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        
        
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
    }

    

}
