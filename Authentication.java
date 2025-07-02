public class Authentication {


    public static void main(String []args){
        System.out.println("Hello World.......");
        Authentication authObj=new Authentication();
        authObj.Login();
        authObj.CreateAccount();
        authObj.ResetPassword();
    }
    public void Login(){
        System.out.println("Login Success");
    }

    public void CreateAccount(){
        System.out.println("Account Creation Successfully");
    }

    public void ResetPassword(){
        System.out.println("Reset Password Successfully");
    }
    
}
