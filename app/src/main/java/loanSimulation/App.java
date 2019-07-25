package loanSimulation;


import java.util.Scanner;
import java.time.LocalDate;
import loanSimulation.entities.*;

/**
 * Hello world!
 *
 */
public class App {
	
    private static Scanner sc;
	private static String str;
	
    public static void main( String[] args )
    {
    	Funding funding = getUserWishes();
    	System.out.println(funding.toString());
        
    }
    private static Funding getUserWishes() {
    	sc = new Scanner(System.in);
        
	    System.out.println("Montant souhaité:");
	    Double amount = sc.nextDouble();
	    
	    System.out.println("Type de crédit souhaité: (IMOBILIER, AUTOMOBILE, CONSOMMATION, WORKS, STUDIES)");
	    String type = sc.next();
	    
	    sc.nextLine();
	    
	    System.out.println("Date de début: (YYYY-MM-DD)");
	    String date = sc.nextLine();
	    
	    System.out.println("Durée du prêt: (en année)");
	    Integer duration = sc.nextInt();
	    
	    System.out.println("Taux d'intérêt: (en %)");
	    Double interest = sc.nextDouble();
	    
	    System.out.println("Taux d'assurance: (en %)");
	    Double assurance = sc.nextDouble();
	    
	    LocalDate starterDate = LocalDate.parse(date);
	    
	    Funding funding = new Funding(amount, type, starterDate, duration, interest, assurance);
		return funding;
    	
    }
}
