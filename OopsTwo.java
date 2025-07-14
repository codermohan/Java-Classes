public class OopsTwo{

    String userEmail = "";
    String userPwd = "";

    public OopsTwo(String inpEmail, String inpPwd){
        //Constructor
        userEmail = inpEmail;
        userPwd = inpPwd;
    }

    public static void main(String[] args){
        OopsTwo obj1 = new OopsTwo("ohankrish@gmail.co","assword@123");
        OopsTwo obj2 = new OopsTwo("rishn@123@co","rish@Pwd");

        System.out.println(obj1.userEmail);
        System.out.println(obj2.userPwd);
    }
}