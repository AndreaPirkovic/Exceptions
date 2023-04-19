package paket;

public class Main {

	public static void checkAge(int age) throws InvalidAgeException{
		System.out.println("Checking age validity:(" + age + ")");
	if (age <0 || age> 100)
		throw new InvalidAgeException(age);
	System.out.println("Age:" + age + " is a valid age.");
	}
	public static void main(String[] args) throws InvalidAgeException {
	try {
		checkAge(25);
		checkAge(-5);}
	catch (InvalidAgeException e ) {
		System.out.println("Caught." + e);
	}finally {
	System.out.println("Finally block.");
	}
		
	}
	}
//throws se koristi u zaglavlju metode da naznaci tipove izuzetaka koje baca metoda
//throw se koristi za bacanje izuzetka u telu metode