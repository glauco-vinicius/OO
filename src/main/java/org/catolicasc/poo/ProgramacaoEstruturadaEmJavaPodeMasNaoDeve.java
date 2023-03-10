package org.catolicasc.poo;

import java.util.Scanner;

public class ProgramacaoEstruturadaEmJavaPodeMasNaoDeve {
    public static void main(String[] args) {
        System.out.println("Qual o valor?");
        Scanner digitar = new Scanner(System.in);
        double preco = digitar.nextDouble();

        System.out.println("Digite o tipo de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Crédito");
        System.out.println("3. Boleto");

        int opcao = digitar.nextInt();
        String tipoPagamento;

        switch (opcao) {
            case 1:
                tipoPagamento = "Pix";
                // fazer aqui o balaco baco do pagamento via PIX
                //
                //
                //
                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                //

                break;
            case 2:
                tipoPagamento = "Crédito";
                //
                //
                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                //
                break;
            case 3:
                tipoPagamento = "Boleto";
                //
                //
                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                //
                break;
            default:
                tipoPagamento = "Opção inválida";
                //
                //
                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                ////
                //                //
                break;
        }

        System.out.println("Opção selecionada: " + tipoPagamento);
    }
}