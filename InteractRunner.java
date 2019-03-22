import java.util.Scanner;

public class InteractRunner {

	public static void main (String[] arg){
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")){

				System.out.println("Enter first arg: ");
				String first = reader.next();
			
				System.out.println("Enter second arg: ");
				String second = reader.next();

				System.out.println("Enter the operation: +, -, *, /");
				String sign = reader.next();

				switch(sign)
				{
					case "+":
						calc.add(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result summ = "+calc.getResult());
						calc.cleanResult();
						break;

					case "-":
						calc.subs(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result Subs = "+calc.getResult());
						calc.cleanResult();
						break;

					case "*":
						calc.pow(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result * = "+calc.getResult());
						calc.cleanResult();
						break;

					case "/":
						calc.divis(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result / = "+calc.getResult());
						calc.cleanResult();
						break;
				}

		/*		calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : "+ calc.getResult());
				
				calc.cleanResult();

		*/
				System.out.println("Exit ^ yes/no ");
				exit = reader.next();
			}
		}
		finally {
			reader.close();
		}
	}	
}
