/*Fazer um projeto para ler Nome, Idade, Altura de N pessoas. Depois mostrar na tela a altura e a porcentagem das pessoas com menos de 16 anos, bem como o nome dessas pessoas, caso haja.
 */
package src.app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade pessoas: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o nome da "+ (i+1) + " pessoa: ");
            name[i] = sc.next();
        }
        int[] age = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite a idade da "+ (i+1) + " pessoa: ");
            age[i] = sc.nextInt();
        }
        double[] height = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite a altura da "+ (i+1) + " pessoa: ");
            height[i] = sc.nextDouble();
        }


        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + height[i];
        }
        double avarage = sum / n;
        System.out.println();
        System.out.println("Avarage: " + avarage);

        

        double count = 0.0;
        for(int i = 0; i < n; i++) {
            if(age[i] < 16) {
                count = count + 1;
            }
        }
        double percent = count * 100.0 / n;
        System.out.println("< 16 y.o : " + percent);

        for(int i = 0; i < n; i++) {
            if(age[i] < 16){
                System.out.println(name[i]);
            }
        }


        sc.close();
    }
}