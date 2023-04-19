package paket;

	public class Main {

		public static void main(String[] args) {
			int d, a;
			try {
				a=0;
				System.out.println("a="+ a);
				//int b =10/ a;
				
				int c[]= {1};// jedan od nacina inicijalizacije niza
			c[10]=100;
				
			}catch(ArithmeticException e){
				System.out.println("Deljenje nulom.  "   + e);
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Nepostojeci indeks unutar niza!  " + e.getMessage());
			}
			System.out.println("Nakon try/catch, catch bloka");
		}}
