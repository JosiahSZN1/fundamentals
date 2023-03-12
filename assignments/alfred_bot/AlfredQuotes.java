import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    Date date = new Date();

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name + ". Lovely to see you!";
    }

    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s. Lovely to see you!", dayPeriod, name);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        else if(conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else {
            return "Okay. But pay me my money.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String guestGreeting() {
        date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("H");

        String strDate = formatter.format(date);
        System.out.println(strDate);
        if(Integer.parseInt(strDate) < 12) {
            return "Good Morning!";
        }
        else if(Integer.parseInt(strDate) < 17) {
            return "Good Afternoon!";
        }
        else {
            return "Good Evening!";
        }
    }
}

