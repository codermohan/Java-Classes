public class NumberVariables {
    public static void main(String[] args) {
        String price = "199.9";
        String qty = "3";
        System.out.println(Float.parseFloat(price)*Integer.parseInt(qty));

        float totalPrice = Float.parseFloat(price)*Integer.parseInt(qty);
        System.out.println(totalPrice);
        String outMsg = "Total Price is "+ String.valueOf(totalPrice);
        System.out.println(outMsg);
        System.out.println(price);
    }
}
