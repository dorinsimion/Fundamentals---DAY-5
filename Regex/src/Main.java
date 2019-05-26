import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[naA]+","anaaaa"));//true
        System.out.println(Pattern.matches("[a-zA-Z\\\\]+","Ana\\are\\mere"));//true
        System.out.println(Pattern.matches("[a-z]+\\s+[a-z]+","aaa   aaa".toLowerCase()));
        System.out.println(Pattern.matches("An.","An$"));//true
        System.out.println(Pattern.matches("An\\.","An$"));//false
        System.out.println(Pattern.matches("\\d{2}\\.\\d{2}\\.\\d{4}","10.10.2000"));

        // cifre,liter . _ @ cifre sau litere . litere
        System.out.println(Pattern.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-z]+","dorin-simion_aaa@yahoo1.com"));//true

        Pattern p = Pattern.compile("^\\d{2}");
        Matcher m = p.matcher("44 de ani are George");
        while(m.find()){
            System.out.println(m.group(0));
        }

        p=Pattern.compile("^([a-zA-Z]+)\\sare\\s(\\d+)\\sani$");
        m =p.matcher("Ana are 44 ani");
        if(m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }
}
