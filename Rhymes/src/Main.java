import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String previousLine ="";
        int row=0;
        boolean flag = true;
        do {
            String currentLine=scanner.nextLine();
            row++;
            if(currentLine.toLowerCase().equals("quit"))
                break;
            if(row%2==0 && !currentLine.endsWith(previousLine)){
                flag=false;
            }
            previousLine=currentLine.substring(currentLine.length()-2);
        }while(true);
        if(!flag) System.out.print("Don't ");
        System.out.println("rhymes!");
    }
}
