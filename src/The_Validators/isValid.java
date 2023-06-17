package The_Validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isValid extends Thread{
    String token;
    String only_alphaBets = "^[a-zA-Z_]+$";
    Pattern pattern = Pattern.compile(only_alphaBets);
    public isValid(String token) {
        this.token = token;
    }

    public void run(){
        Matcher matcher = pattern.matcher(token);
        if (!matcher.matches()) {
            System.out.println("your user name should contain only alphabets and underscore -> [a,z] + [A,Z] + _ ");
        }
    }
    
}
