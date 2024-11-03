public class SpacedLogger implements Logger {

    private String addSpaces(String message) {
        return String.join(" ", message.split(""));
    }

    @Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + addSpaces(message));
    }
}

//STEP THREE'S PART
/*
 * Created the ask class of SpacedLogger. Calls logger to the interface.
 * The method "addSpaces", inserts spaces between the characters.
 * The method "log" and "error" print the message after "addSpaces" has modified the message. 
 * Error message will print as "ERROR: WORD(s) GOES HERE".
 * 
 * - Wayne Novich
 */