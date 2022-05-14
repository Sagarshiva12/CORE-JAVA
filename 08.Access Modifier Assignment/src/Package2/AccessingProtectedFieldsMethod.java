/**
 3. Also, Access the PROTECTED fields and methods from child class located
  in a different package
  <p>
  - Access the PROTECTED fields and methods from any class in different package
 */


package Package2;





//Accessing the PROTECTED fields and methods from child class
public class AccessingProtectedFieldsMethod extends Package1.ProtectedClassFieldsMethod {

    public static void main(String[] args) {
        //Creating object of AccessingProtectedFieldsMethod
        AccessingProtectedFieldsMethod sub = new AccessingProtectedFieldsMethod();
        //Accessing protected field
        sub.name = "Protected Method in SubClass";
        //Accessing protected method
        sub.protectedMethod();
    }

    /* NOTE :- protected member can be access within the package and
                outside the package but within the child classes */
}