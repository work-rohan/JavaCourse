import java.util.Scanner;

public class ReadInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.println("You are "+name);
    }
}
