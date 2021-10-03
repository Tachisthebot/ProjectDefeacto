package DefactoProjects;
import java.util.Scanner;
public class CaffeineOverdose {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int numberOfMgs = scn.nextInt();
        int lethalOverdose = 10*1000 / numberOfMgs;
        System.out.println("Enter number of milligrams in drink:");
        System.out.println("It would take about " + lethalOverdose + " drinks for a lethal overdose.");


    }
}
