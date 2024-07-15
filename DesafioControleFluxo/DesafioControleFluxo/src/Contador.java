import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número para fazer a contagem");
        int parametroUm = terminal.nextInt();
        System.out.println("Agora digite o segundo número");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Contando o número " + i);
        }
    }
}
