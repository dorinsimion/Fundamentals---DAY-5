package main;

import java.util.Scanner;
import java.util.regex.Pattern;
import angajat.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nume=insertField(input,"nume","[A-Z][a-z]+");
        String prenume=insertField(input,"prenume","[A-Z][a-z]+");
        String email=insertField(input,"email","[a-z]+\\.*[a-z]+@[a-z]+\\.[a-z]{3}");

        Angajat angajat= new Angajat(nume,prenume,email);
        System.out.println(angajat);
    }

    private static String insertField(Scanner input,String fieldName,String regex){
        String fieldValue;
        do{
            System.out.println("Introduceti " +fieldName+" :");
            fieldValue = input.nextLine();
        }while(!Pattern.matches(regex,fieldValue));
        return fieldValue;
    }

}
