package The_Validators;

public class IsBlank extends Thread{
    String token;

    public IsBlank(String token){
        this.token = token;
    }

    public void run(){
        if(token.isBlank()){
            System.out.println("\033[31m");
            System.out.println("    Attempting to use only Blank spaces is not allowed!, sorry try again please");
        }
    }
}
