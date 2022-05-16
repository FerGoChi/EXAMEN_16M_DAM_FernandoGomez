package NumeroPrimo;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) { 		
		
		Scanner num = new Scanner(System.in);
		int contador,numero;
    
	    System.out.print("Buenos días Ceinmark, soy Fernando Gomez \r\n"
	    		+ "\r\n"
	    		+ "Introduce un número para averiguar si es primo o no:\r\n"
	    		+ " ");
	    numero = num.nextInt();
	    contador = 0;
	
	    for(int i = 1; i <= numero; i++)    {
	        if((numero % i) == 0)
	        {
	            contador++;
	        }
	    }	
	    if(contador <= 2)
	    {
	        System.out.println("El numero es primo");
	    }else{
	        System.out.println("El numero no es primo");
	    }

	}

}
