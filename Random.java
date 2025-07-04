public class Random {
    public static void main(String[] args) {
        double Random = Math.random();
        System.out.println(Random);
        System.out.println(Random * 10000);
        int otp = (int)(Random*10000);
        System.out.println(otp);
    }
}
