import java.util.Scanner;

public class DesafioBackEnd {

    public static void main(String[] args) {
        int resposta = 1;
        System.out.println("Informe seu código:");
        Scanner ler = new Scanner(System.in);
        String entrada = ler.next();
        int tamanho = entrada.length();
        char[] lista_entrada = entrada.toCharArray();

        for (int i = 0; i < (tamanho); i++) {
            if (Integer.parseInt(String.valueOf(lista_entrada[i])) <= 2 && (Integer.parseInt(String.valueOf(lista_entrada[i + 1])) <= 6)) {
                resposta += 1;
            }
        }

         System.out.printf("Total de combinações teste: %d ",resposta);
    }
}
