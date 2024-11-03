public class App {
    public static void main(String[] args)  {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        System.out.println("\nTesting SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}

//STEP FOUR'S PART
/*
 * I used the defualt class of App thats made with VS Code for this part. 
 * Class "App" instaniates the classes of "AsteriskLogger" and "SpacedLogger" to run/test methods on them.
 * 
 * The Expected output for "AsteriskLogger" should look like:
 * ***Hello***
****************
***Error: Hello***
****************


   The Expected output for "SpacedLogger" should look like:
   H e l l o
   ERROR: H e l l o


   - Wayne Novich
 */