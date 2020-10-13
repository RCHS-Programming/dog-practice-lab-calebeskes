//(c) A+ Computer Science
//www.apluscompsci.com

public class Dog
{
  private int age;
  private String name;
	
  public Dog( String n )  
  {
    age = 1;
    name = n;
  }
  
  public Dog( String n, int a )  
  {
	  name = n;
    age = a;
  }
  
  public void increaseAgeByOne()
  {
    age ++;
  }
  
  public int getDogYears( int scale )
  {
  	
  	return age * scale;
  }
	
  public int getAge()    {
    return age;
  }
	
  public String getName()    {
    return name;
  }
	
//   public String toString()    {
//     return "Dog - " + name + " " + age;
//   }
}
