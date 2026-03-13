package AULA_03_26_01_26;

import java.util.Scanner;

public class SimuladorCheckout {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double desconto=-1;

        while (desconto<0 || desconto>100)
        {
        System.out.println("Digite o valor do desconto que será dado no item mais caro! [0 a 100]: ");
        desconto = in.nextDouble();

            if(desconto<0 || desconto>100)
            {
                System.out.println("Digite um valor de desconto entre 0 e 100!");
            }
            else
            {
                System.out.println("O valor do desconto é" + desconto);
            }

        }

        System.out.println("Digite o valor do primeiro produto!: ");
        double valorPrimeiroProduto = in.nextDouble();
        double maior=valorPrimeiroProduto;
        
        System.out.println("Digite o valor do segundo produto!: ");
        double valorSegundoProduto = in.nextDouble();
                if(valorSegundoProduto>maior) maior=valorSegundoProduto;

        System.out.println("Digite o valor do terceiro produto!: ");
        double valorTerceiroProduto = in.nextDouble();
                if( valorTerceiroProduto>maior) maior=valorTerceiroProduto;

        double produtoComDesconto = maior*(1-(desconto/100));

        System.out.println("Produto maior com desconto: R$ " + produtoComDesconto );

        in.close();
    }
}
