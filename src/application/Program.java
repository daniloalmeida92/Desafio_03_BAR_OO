package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo: ");
        Bill.gender = sc.nextLine().charAt(0);
        while (Bill.gender != 'F' && Bill.gender != 'M') {
            System.out.println("Digite o sexo do cliente corretamente com F ou M: ");
            Bill.gender = sc.nextLine().charAt(0);
        }
        System.out.print("Quantidade de cervejas: ");
        Bill.beer = sc.nextInt();
        while (Bill.beer < 0) {
            System.out.print("não pode ser menor que zero, digite a quantidade de cervejas: ");
            Bill.beer = sc.nextInt();
        }
        System.out.print("Quantidade de refrigerantes: ");
        Bill.softDrink = sc.nextInt();
        while (Bill.softDrink < 0) {
            System.out.print("não pode ser menor que zero, digite a quantidade de refrigerantes: ");
            Bill.softDrink = sc.nextInt();
        }
        System.out.print("Quantidade de espetinhos: ");
        Bill.barbecue = sc.nextInt();
        while (Bill.barbecue < 0) {
            System.out.print("não pode ser menor que zero, digite a quantidade de espetinhos: ");
            Bill.barbecue = sc.nextInt();
        }


        System.out.println("RELATÓRIO:");

        System.out.printf("Consumo = %.2f%n", Bill.feeding());
        if (Bill.cover() > 0) {
            System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
        } else {
            System.out.println("Isento de Couvert");
        }
        System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket());
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f%n", Bill.total() + Bill.cover());

        sc.close();
    }

}