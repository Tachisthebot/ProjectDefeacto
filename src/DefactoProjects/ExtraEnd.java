package DefactoProjects;

import java.util.Scanner;

public class ExtraEnd {
    public static void main(String[] args) {

        String str = "Hello";
        String word = str.substring(str.length()-2,str.length());
        System.out.println(word);
        for (int i = 0; i < 3; i++) {
            System.out.print(word);
        }


    }
}
