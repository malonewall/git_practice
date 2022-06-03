public class methodPractice{

	public static void main(String[] args){

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int addResult = add(x,y);
		int multiplyResult = multiply(x,y);

		System.out.println("Addition: " + addResult + "     Multiplication: " + multiplyResult);
	}

	public static int add(int a, int b){

		return a + b;
	}

	public static int multiply(int a, int b){

		return a * b;
	}


}
