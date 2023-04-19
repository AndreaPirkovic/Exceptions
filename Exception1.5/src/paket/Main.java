package paket;

public class Main {

	public static void main(String[] args) {
		try {
			int a=0;
			System.out.println(" a= " + a);
			
			int b= 10/a;
			int c[]= {1};
			c[10]=100;// dodeljivanje vrednosti 100, desetom elementu niza c
		
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {// oba exceptiona su izvedeni potomci iz iste klase 
			//pa su zato mogli da se spoje u jedan catche
			System.out.println("Uhvacen exception " + e);
			}
		System.out.println("Nakon try/catch bloka " );
		}
		
	}


