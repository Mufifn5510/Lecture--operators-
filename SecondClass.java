import java.util.Scanner;

public class SecondClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj sw�j wiek");
		
		int age = sc.nextInt();
		
		System.out.println("Tw�j wiek to: "+age);
		
		if ( age==18 ) {
			System.out.println("W tym roku uzyska�e� pe�noletno��.");}
		if (age>18) { 
			System.out.println("Jeste� osob� pe�noletni�");
		}
		else { System.out.println("Nie kupisz jeszcze piwa");
		
		}
		
		
		
	}
	
	
	
}
