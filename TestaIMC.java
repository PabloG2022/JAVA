import java.util.Scanner; 

public class TestaIMC {

public static void main(String[] args) {
	
    IMC imc = new IMC();  

    Scanner entrada = new Scanner(System.in); 

    System.out.print("Digite seu peso: "); 

    imc.setPeso(entrada.nextDouble()); 

		 

	System.out.println(); 

	System.out.print("Digite sua altura: "); 

	imc.setAltura(entrada.nextDouble()); 

	System.out.println(); 

		 

	double indice = imc.calculoIMC(); 

	imc.classificar(indice); 

	imc.imprimirIMC();     

	}

}