package esII;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    static double imc;
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.print("Digite seu peso (XXX,XX): ");
        double peso = s.nextDouble();
        System.out.print("Digite sua altura (X,XX): ");
        double altura = s.nextDouble();
        
        NovoImc novoImc = new NovoImc(idade, peso, altura, imc);
        double resultado = novoImc.Calculos();
        resultado = (double)Math.round(resultado * 100d) / 100d;
        
        System.out.println("O IMC é: " + resultado);
        
        novoImc.Avalia();
        
    }
    
}
