package paket;

public class Main {

	public static void main(String[] args) {
		int d, a;
		try {//u try bloku se stavljaju naredbe koje mogu baciti izuzetak,
			//kao i one naredbe koje se nece izvrsiti ako 
			//dodje do izuzetka
			d=0;
			a =10/ d;
			// do ovde se izvrsava naredna koja je izuzetak
			System.out.println("Ova poruka nece biti odstampana");
			
		}catch(ArithmeticException e){
			System.out.println("Deljenje nulom.");
		}
System.out.println("Program nastavlja sa izvrsenjem!");
	}}
// Hijerarhija izuzetaka:
// Svi izuzeci su izvedeni iz klase Throwable.
//Klasa Throwable ima dva direktna naslednika(potomka): Error i Exception.
// Klasa Error opisuje fatalne greske(Greske na koje ne mozemo uticati).
// Za greske tog tipa nije potrebno navoditi try/catch blokove.
//Klasa Exception jeste klasa iz koje se izvode klase koje pripadaju
//neproverenim tipovima izuzetaka.
// Exception{RuntieException, IOException}
//RuntieException{IndexOutOfBoundsException, ArithmeticException}

