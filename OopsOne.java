public class OopsOne{
    String userEmail = "";
    String userPassword = "";

    public OopsOne(){
        //Constructor
        
    }

    public static void main(String[] args){
        OopsOne obj1 = new OopsOne();
        obj1.userEmail = "mohankrishnan@gmail.co";
        obj1.userPassword = "Krish.@@";

        OopsOne obj2 = new OopsOne();
        obj2.userEmail = "krishnan802@@gmail";
        obj2.userPassword = "Moh@n";

        System.out.println(obj1.userEmail);
        System.out.println(obj1.userPassword);

        System.out.println(obj2.userEmail);
        System.out.println(obj2.userPassword);
    }
}