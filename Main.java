//Name: 
//Date: 

public class Main
{
	public static void main( String[] args )
	{
		Dog d = new Dog( "rover" );
		System.out.println( d.getDogYears( 7 ) );  //will output 7
		d.increaseAgeByOne();
		d.increaseAgeByOne();     //age should be 3 after this call
		System.out.println( d.getDogYears( 11 ) );  //will output 33
 		System.out.println( d.getName() );	  //will output rover
 		d.increaseAgeByOne();
// 		d.increaseAgeByOne();
// 		d.increaseAgeByOne();
// 		d.increaseAgeByOne();    //age should be 7 after this call
// 		System.out.println( d.getDogYears( 8 ) );  //will output 56

//		Add more of your own test cases
// 		Dog g = new Dog( "bob", 3 );
// 		System.out.println( g.getName() );
// 		System.out.println( g.getDogYears( 5 ) );
		
	}
}
