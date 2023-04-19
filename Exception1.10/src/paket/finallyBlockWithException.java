package paket;

public class finallyBlockWithException {


	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");//mi bacamo izuzetak
			//throws je u zaglavlju metode
			//throw se koristi za bacanje izuzetaka u telu metode
		}// ovde nema catch blok pa se ne detektuje ovde greska
		finally {// finally blok se izvrsava bez obzira
			//da li je ili nije doslo do izuzetka
		System.out.println("finally procA");
		}
		}
	static void procB() {
		try {
			System.out.println(" procB");
			return;// break, continue, System.exit(0)
		}
		finally {
		System.out.println("procB's finally");
		}
	}
	static void procC() {
		try {
			System.out.println("inside procC");
		}finally {
			System.out.println("procC's finally ");
		}
	
	}}
//Blok finally se koristi zajedno sa 
//blokom try kako bi se osiguralo da 
//se određeni deo koda izvršava bez 
//obzira na to da li je izbačen izuzetak ili ne.

//Ovo je korisno za situacije 
//u kojima želimo da budemo sigurni 
//da su određeni resursi pravilno 
//očišćeni ili zatvoreni, čak i ako dođe do greške tokom izvršavanja programa.