import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s=s.toLowerCase();
        s=s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(s);
    }
}
