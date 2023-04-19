package paket;

public class InvalidAgeException extends Throwable {// nasledjuje klasu throwable
	 private int age;
	 InvalidAgeException(int a){
		 age = a;
	 }
	 public String toString() {
		 return "Age:" + age + "  is not a valid age.";
	 }
	 }
	 

