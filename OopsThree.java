public class OopsThree{

    String title = "";
    int price = 0;
    public OopsThree(String inptitle,int inpprice){
        title = inptitle;
        price = inpprice;
    }
    public static void main(String[] args){
        OopsThree obj1 = new OopsThree("Iphone 16 Pro Max",1699);
        System.out.println(obj1.title+":"+obj1.price);

        OopsThree obj2 = new OopsThree("Samsung Galaxy S24 Plus",1299);
    
        System.out.println(obj2.title+":"+obj2.price);

    }
}