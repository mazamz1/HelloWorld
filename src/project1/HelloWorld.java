package project1;

public class HelloWorld {


	static void printMyName(){
		
		String myName = "Azam";
		//boolean isCorrect = myName == "Azam";
		if(myName == "Azam") {
			System.out.println("Hell World, this is " + myName);
		}

	}

	public static void main(String[] arg) {

		for (int i = 0; i < 5; i++) {
			printMyName();
		}

	}
}

