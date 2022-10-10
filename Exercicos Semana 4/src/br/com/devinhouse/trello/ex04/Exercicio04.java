package br.com.devinhouse.trello.ex04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        boolean idadeValida = false;
        Integer idade = null;

        while(!idadeValida) {
            System.out.print("Qual eh sua idade? ");
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.next();
            try {
                idade = Integer.valueOf(entrada);
                if (idade <= 0 || idade > 100) {
                  // throw new IdadeInvalidaException();
                }
                idadeValida = true;
            } catch(NumberFormatException e) {
                System.out.println("Valor informado é inválido ");
           // } catch (IdadeInvalidaException e) {
                System.out.println("Fora do intervalo");
            }
        }

        System.out.println("Sua idade informada é " + idade);

    }
}
