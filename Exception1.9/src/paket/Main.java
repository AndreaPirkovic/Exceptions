package paket;

public class Main {

	public static void main(String[] args) {
		try {
			int a=2;// 0,1 i 2 su vrednosti za testiranje
			int b= 10/a;// ovde je rizicna operacija spoljasnjeg catch bloka
			System.out.println("a= " + a);
			
			try {
				if (a==1)
					a=a/(a-a);
				if (a==2) {
					int c[]= {1};
				c[10]=100;// rizicna operacija poziva unutrasnji catch blok
				}
			}catch(ArrayIndexOutOfBoundsException e){
				//unutrasnji catch blok
				System.out.println("Greska sa indeksom. " + e);
			}
			
		}catch (ArithmeticException e) {
			//spoljasnji catch blok
			System.out.println("Greska prilikom deljenja  " + e);
		}

	}

}
