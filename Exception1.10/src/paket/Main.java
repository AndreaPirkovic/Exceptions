package paket;

public class Main {

	public static void main(String[] args) {
		finallyBlockWithException fbwe = new finallyBlockWithException();
		try {
			fbwe.procA();
			
		}catch (Exception e) {
			System.out.println("Exception caught");
		}
		fbwe.procB();
		fbwe.procC();
	}

}
