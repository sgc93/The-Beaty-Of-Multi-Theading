package The_Validators;

public class IsEmpty extends Thread{
    String token;

    public IsEmpty(String token){
        this.token = token;
    }

    public void run(){
        if(token.length() == 0){
            System.out.println("\033[31m");
            System.out.println("   your Have entered empty values!");
        }
    }
}
