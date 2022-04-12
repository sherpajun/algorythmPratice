package project;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Max ");
        System.out.print("a :") ; int a = scanner.nextInt();
        System.out.print("b :") ; int b = scanner.nextInt();
        System.out.print("c :") ; int c = scanner.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        
        
        System.out.println("Max result"+ max +"");
        
        
    }

}
