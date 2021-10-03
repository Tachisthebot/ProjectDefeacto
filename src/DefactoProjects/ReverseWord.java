package DefactoProjects;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(word("I love Java"));
    }

    public static String word(String str) {
        String [] arr = str.split(" ");
        String result = "";

        for (int i = arr.length; i >=0; i--) {
        result += arr[1].charAt(i);
        }
return result;
    }
}
