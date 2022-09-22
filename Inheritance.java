public class  Inheritance
{
public static void main(String args[])
{
   Daughter rohan=new Daughter();
   rohan.relation1();
   rohan.relation2();
}
public class GrandMother
 {
	
	void relation1()
	{
		System.out.println("Grandmother : Having a 1 daughter");
	}
	
	void relation2()
	{
		System.out.println("Grandmother : Having a 2 granddaughter");
	}
	
	
}
 public class Mother extends GrandMother 
{

	void relation1()
	{
	    super.relation1();
		System.out.println("mother: Having 2 daughter");
	}
}
 public class Daughter extends Mother
{
	
	void relation2()
	{   
		System.out.println("Daughter: I have 1 sister,we are sisters");
	}
}

}



 