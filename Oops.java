public class Oops{
    public static void main(String [] args){
        String name = "Krish";
         Oops obj = new Oops();
         //j.Login();
         obj.Signup();
         obj.Login();
         

    }

    public void Login(){
        System.out.println("Login Successful");
    }
    public void Signup(){
        System.out.println("You have suggessfully signed-up");
    }
    public void Resetpassword(){
        System.out.println("New password has sent to your email");
    }
}