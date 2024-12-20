package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


//        gênero  gender
//        cerveja  beer
//        churrasco barbecue
//        refrigerante softdrink
//        cobrir cover
//        alimentação feeding
//        bilhete  ticket

        System.out.print("Sexo: ");
        Bill.gender = sc.next().charAt(0);

        System.out.print("Quantidade de Cervejas: ");
        int quantidadeCerveja = sc.nextInt();

        System.out.print("Quantidade de Refrigerantes: ");
        int quantidadeRefrigerantes = sc.nextInt();

        System.out.print("Quantidade de Espetinhos: ");
        int quantidadeEspetinhos = sc.nextInt();

        System.out.println();
        System.out.println("RELATÓRIO:");

        double consumo = Bill.feeding(quantidadeCerveja, quantidadeRefrigerantes, quantidadeEspetinhos);
        System.out.printf("Consumo = R$ %.2f%n", consumo);

        double cover = Bill.cover(consumo);
        if (cover == 0.00) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", cover);
        }

        double ticket = Bill.ticket();
        System.out.printf("Ingresso = R$ %.2f%n", ticket);


        double valorTotal = Bill.total(consumo, cover, ticket);
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f%n", valorTotal);

        sc.close();
    }
}
