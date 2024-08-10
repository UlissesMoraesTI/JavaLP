package lp;

import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome:");
        String name = sc.nextLine();
        System.out.println("Salario Bruto:");
        double grossSalary = sc.nextDouble();

        double netSalary = grossSalary * 0.7;
        System.out.printf("Salario Liquido: r$ %.2f%n", netSalary);
    }
}
