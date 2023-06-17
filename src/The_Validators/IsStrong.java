package The_Validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsStrong extends Thread{
    String token;
    String uppercases = ".*[A-Z].*";
    Pattern pattern = Pattern.compile(uppercases);
    public IsStrong(String token){
        this.token = token;
    }
    
    public void run(){
        Matcher matcher = pattern.matcher(token);
        if(token.length() < 5){
            System.out.println("\033[31m");
            System.out.println("    Your username must have at least 5 containers!");
        } else if (!matcher.matches()) {
            System.out.println("\033[31m");
            System.out.println("Your username should contain at least one uppercase alphabet.");
        }
    }
}
