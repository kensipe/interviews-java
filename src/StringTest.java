public class StringTest {

    public static void main(String[] args) {

        String x = "java";

        String y = "java";


        if (x == y) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }

        x = x.toUpperCase();
        String z = y.toUpperCase();

        if (x == z) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }


    }
}
