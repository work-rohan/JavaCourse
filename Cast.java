public class Cast {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // Explicit casting
        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

        String str = "1";
        int z = Integer.parseInt(str);
        System.out.println(z);

        String str1 = "1.1";
        double z1 = Double.parseDouble(str1);
        System.out.println(z1);
    }
}
