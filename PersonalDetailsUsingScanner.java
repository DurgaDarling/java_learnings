import java.util.Scanner;
class PersonalDetailsUsingScanner 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Employe Name");
		String name=scan.next();
		System.out.println("Employee Age");
		int age=scan.nextInt();
		System.out.println("Employee mail id");
		String mail=scan.next();
		System.out.println("Employee Gender");
		char gender=scan.next().charAt(0);
		System.out.println("Employee loaction");
		String location=scan.next();
		System.out.println("Employee  IsIndian");
		boolean isIndian=scan.nextBoolean();
		System.out.println("***Employee Details***");
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee mail:"+mail);
		System.out.println("Employee gender:"+gender);
		System.out.println("Employee location:"+location);
		System.out.println("Employee isindain?:"+isIndian);

	}
}
