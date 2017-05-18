import java.util.Scanner;

public class SecondClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj swój wiek");
		
		int age = scanner.nextInt();
		
		System.out.println("Twój wiek to:" +age);
		
		if (age>18) {
			System.out.println("Możesz kupić piwo od conajmniej roku");
		}
		else if (age<18) {
			System.out.println("Od ostatnich urodzin jesteś pełnoletni");
		
	} else (age==18) {
				System.out.println("Jesteś dzieckiem");
			}
		}
		
	}

	
}
