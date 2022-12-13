package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt();
		double [] vect = new double [n]; //instancia um vetor vect de tamanho n
		
		for (int i=0; i<n; i++) {
			System.out.print("Entre com altura: ");
			vect[i]= sc.nextDouble();		
			}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) { //Le da tela e preenche o vetor vect com as alturas
			sum += vect[i];			
		}
		
		double avg = sum/n;
		System.out.printf("Altura média: %.2f%n", avg);
		
		sc.close();

	}

}
