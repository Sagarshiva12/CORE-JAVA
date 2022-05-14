/**6. Write a function to print your name and call the function from main method.*/

package javabasic;

public class callingfunction {
	
	
	static void myMethod() 
	{
        System.out.println("My Name is Sagar");
    }

    public static void main(String[] args)     /* To call a method, you just need to type the method name
                                               followed by open and closed parentheses */
    {
       
        myMethod();
    }

}
