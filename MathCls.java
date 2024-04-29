public class MathCls {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        result = (int)Math.ceil(1.1F);
        result = (int)Math.floor(1.1F);
        result = Math.min(1,2);
        result = Math.max(1,2);

        double res = Math.random();
        System.out.println(res);
    }
}
