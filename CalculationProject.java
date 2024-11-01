import java.util.Scanner;
class CalculationProject 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for Addttion Operation");
		System.out.println("Enter 2 for Subtraction Operation");
		System.out.println("Enter 3 for Multiplication Operstion");
		System.out.println("Enter 4 for Division(Quotent) Operation");
		System.out.println("Enter 5 for Division(Remainder) Operation");
		int userChoice = scan.nextInt();
		switch(userChoice)
		{
			case 1:
			{
				System.out.println("You Have Choosen the Addition Operation");
				System.out.println("Enter the First Number");
				int num1=scan.nextInt();
				System.out.println("Enter the Second Number");
				int num2=scan.nextInt();
				int result=num1+num2;
				System.out.println(num1+ "+" + num2+ "="+ result);
				System.out.println("Thank you .");
			}
			break;
			case 2:
			{
				System.out.println("You Have Choosen the Subtraction Operation");
				System.out.println("Enter the first number");
				int num1=scan.nextInt();
				System.out.println("Enter the Second Number");
				int num2=scan.nextInt();
				int result=num1-num2;
				System.out.println(num1+  "-" +num2+ "="+ result);
				System.out.println("Thank You.");
			}
			break;
			case 3:
			{
				System.out.println("You Have Choosen the Multiplication Operation");
				System.out.println("Enter the first number");
				int num1=scan.nextInt();
				System.out.println("Enter the Second Number");
				int num2=scan.nextInt();
				int result=num1*num2;
				System.out.println(num1+ "*"+num2+"="+result);
				System.out.println("Thank You.");
			}
				break;

			case 4:
			{
				System.out.println("You Have Choosen the Division(Quotent) Operation");
				System.out.println("Enter the numerator value");
				int num1=scan.nextInt();
				System.out.println("Enter the Denominator value");
				int num2=scan.nextInt();
				int result=num1/num2;
				System.out.println(num1+ "/"+num2+"="+result);
				System.out.println("Thank You.");
			}
			break;
			case 5:
			{
				System.out.println("You Have Choosen the Divison(Remainder) Operation");
				System.out.println("Enter the numerator value");
				int num1=scan.nextInt();
				System.out.println("Enter the Denominator value");
				int num2=scan.nextInt();
				int result=num1%num2;
				System.out.println(num1+ "%"+num2+"="+result);
				System.out.println("Thank You.");
			}
				break;
				default : System.out.println("Please Enter the valid input");
		}
	}
}
        
	


