import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        InValidation inValidation=new InValidation();
        RomanNumeral romanNumeral=new RomanNumeral();
        Calculation calculation = new Calculation();
        char operator;
        String[] inValues;


        while(inValidation.isCorrect(inValues=scanner.nextLine().split(" "))){
            operator = inValues[1].charAt(0);

            if (romanNumeral.isRomNumeral(inValues[0])) {
                calculation.romanCalc(romanNumeral, inValues[0], operator, inValues[2]);
            } else {
                calculation.arabCalc(inValues[0], operator, inValues[2]);
            }
        }
    }




}
