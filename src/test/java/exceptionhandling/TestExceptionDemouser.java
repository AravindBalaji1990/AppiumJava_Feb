package exceptionhandling;

// We have created the user defined class for exception 
// instead of using the java default exceptions
// Since its a user defined exception we are extending it to a base exception defined by java

public class TestExceptionDemouser extends Exception {
    // is the name of the exception
    TestExceptionDemouser(String s) {
        super(s);
    }
}
