
package atividade7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Atividade7 {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        
        double imc = weight / (height * height);
        
        System.out.println("Your imc is: " + String.format("%.2f", imc));       
        
    }
    
}
