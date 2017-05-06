import java.util.Scanner;

public class SecondClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj swój wiek");
		
		int age = sc.nextInt();
		
		System.out.println("Twój wiek to: "+age);
		
		if ( age==18 ) {
			System.out.println("W tym roku uzyska³eœ pe³noletnoœæ.");}
		if (age>18) { 
			System.out.println("Jesteœ osob¹ pe³noletni¹");
		}
		else { System.out.println("Nie kupisz jeszcze piwa");
		
		}
		
		
		
	}
	
	
	
}
