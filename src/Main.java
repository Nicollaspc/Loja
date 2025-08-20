import LojaVirtual.Loja;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Quantos produtos deseja comprar: ");
        int qtd = sc.nextInt();

        Loja loja = new Loja();

        String nomeProduto = sc.nextLine();
        double preco = 0;

        for(int i = 1 ; i <= qtd ; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.println("Digite o preco unitario: ");
            preco = sc.nextDouble();
            loja.setPrice(preco);
            System.out.println("Digite a quantidade desejada: ");
            int qtdDesejada = sc.nextInt();
            loja.setQtd(qtdDesejada);
            sc.nextLine();

            loja.adicionarProduto(preco,qtdDesejada);
        }



        System.out.printf("Valor total = %.2f ", loja.valorTotal());


        System.out.println("Qual a forma de pagamento  (a vista / parcelado) ?  ");
        String pagamento = sc.nextLine();

        if(pagamento.equalsIgnoreCase("a vista")){
            System.out.printf("Desconto de 10%%= %.2f ", loja.aVista());
        }
        else{
            System.out.printf("Acrescimo de 5%% = %.2f ",loja.parcelado());
        }
    }
}
