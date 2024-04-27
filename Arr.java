import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        System.out.println(Arrays.toString(numbers));

        int[] check = {2,4,1,5,3};
        Arrays.sort(check);
        System.out.println(Arrays.toString(check));
    }
}
