package br.com.conversor.application;

import br.com.conversor.service.ExchangeRateService;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat DF = new DecimalFormat("#,##0.00");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExchangeRateService service = new ExchangeRateService();

        while (true) {
            exibirMenu();

            System.out.print("Escolha uma opção válida: ");
            int opcao;

            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                scanner.next();
                continue;
            }

            if (opcao == 17) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (opcao < 1 || opcao > 16) {
                System.out.println("Opção inválida! Digite um número de 1 até 16 ou 17 para sair.");
                continue;
            }

            System.out.print("Digite o valor a converter: ");
            double valor;

            try {
                valor = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite apenas números.");
                scanner.next();
                continue;
            }

            if (valor <= 0 || valor > 1_000_000_000) {
                System.out.println("O valor deve ser maior que 0 e no máximo 1 bilhão.");
                continue;
            }

            String from;
            String to;

            switch (opcao) {
                case 1 -> { from = "BRL"; to = "USD"; }
                case 2 -> { from = "USD"; to = "BRL"; }
                case 3 -> { from = "BRL"; to = "EUR"; }
                case 4 -> { from = "EUR"; to = "BRL"; }
                case 5 -> { from = "BRL"; to = "ARS"; }
                case 6 -> { from = "ARS"; to = "BRL"; }
                case 7 -> { from = "BRL"; to = "BOB"; }
                case 8 -> { from = "BOB"; to = "BRL"; }
                case 9 -> { from = "BRL"; to = "CLP"; }
                case 10 -> { from = "CLP"; to = "BRL"; }
                case 11 -> { from = "BRL"; to = "COP"; }
                case 12 -> { from = "COP"; to = "BRL"; }
                case 13 -> { from = "BRL"; to = "CAD"; }
                case 14 -> { from = "CAD"; to = "BRL"; }
                case 15 -> { from = "BRL"; to = "MXN"; }
                case 16 -> { from = "MXN"; to = "BRL"; }
                default -> {
                    System.out.println("Erro inesperado.");
                    continue;
                }
            }

            double resultado = service.convert(from, to, valor);

            if (resultado == -1) {
                System.out.println("Erro na conversão. Tente novamente.");
                continue;
            }

            System.out.printf(
                    "Para o valor de %s %s, a sua conversão atual será de %s %s%n",
                    DF.format(valor),
                    from,
                    DF.format(resultado),
                    to
            );
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== CONVERSOR DE MOEDAS ===");
        System.out.println(" 1) BRL  -> USD");
        System.out.println(" 2) USD  -> BRL");
        System.out.println(" 3) BRL  -> EUR");
        System.out.println(" 4) EUR  -> BRL");
        System.out.println(" 5) BRL  -> ARS");
        System.out.println(" 6) ARS  -> BRL");
        System.out.println(" 7) BRL  -> BOB");
        System.out.println(" 8) BOB  -> BRL");
        System.out.println(" 9) BRL  -> CLP");
        System.out.println("10) CLP  -> BRL");
        System.out.println("11) BRL  -> COP");
        System.out.println("12) COP  -> BRL");
        System.out.println("13) BRL  -> CAD");
        System.out.println("14) CAD  -> BRL");
        System.out.println("15) BRL  -> MXN");
        System.out.println("16) MXN  -> BRL");
        System.out.println("17) Sair");
    }
}
