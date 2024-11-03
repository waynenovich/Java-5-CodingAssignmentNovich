public class AsteriskLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "Error: " + message;
        String border = "*".repeat(errorMessage.length() + 6); 
        //Border \/.
        System.out.println(border);
        System.out.println("***" + errorMessage + "***");
        System.out.println(border);
    }
}

//STEP TWO'S PART
/*
 * Created the ask class of AsteriskLogger. Inputed the logger class into this.
 * The method "log", will print "***" for message. Error messages will be shown as an error along side the asterisks.
 * 
 * - Wayne Novich
 */