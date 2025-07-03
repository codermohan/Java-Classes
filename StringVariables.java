public class StringVariables {
    public static void main(String[] args) {
        String userName = "Krish";
        userName.length();
        System.out.println(userName.length()); 
        String userPassword = "Nmvk99@";
        System.out.println(userPassword.length());
        System.out.println(userPassword.contains("#"));
        String userEmail = "    mohankrishnan802@gmail.com    ";
        System.out.println(userEmail.length());
        userEmail = userEmail.trim();
        System.out.println(userEmail);

        String FN = "Mohan";
        String LN = "Namburi";
        System.out.println(FN +" "+ LN);
        String fullName = FN +" Venkata Krishna"+" "+ LN;
        System.out.println(fullName);

        String orgCouponCode = "JUL50";
        String userCouponCode = "jul50";
        System.out.println(orgCouponCode==userCouponCode.toLowerCase());



    }
}
