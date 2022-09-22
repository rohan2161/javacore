  

class BankInfo
{

public class Bank
{  
void getRateOfInterest()
{

System.out.println("");
}  
}  
 
public class RBI extends Bank
{  
void getRateOfInterest()
{
System.out.println("8.6");
}  
}  
public class YES extends Bank
{  
void getRateOfInterest()
{
System.out.println("5.9");
}  
} 
public static void main(String args[])
{  
RBI s=new RBI();  
 YES a=new YES();  
System.out.println("RBI Rate of Interest: ");
s.getRateOfInterest();  
System.out.println("Yes Rate of Interest: "); 
a.getRateOfInterest(); 
}  

}