import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto respnsável pela leitura dos dados digitados pleo usuario
        Scanner entrada = new Scanner(System.in);

    // instanciar um objeto do tipo equacao
        equacao equacao = new equacao();
        System.out.println("Digite o valor de A: ");
        equacao.a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        equacao.b = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        equacao.c = entrada.nextInt();

        equacao.CalcDelta();
        System.out.println("Delta = " + equacao.delta);
        System.out.println(equacao.raiz());




    }
}

