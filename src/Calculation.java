public class Calculation {

    public void romanCalc(RomanNumeral romanNumeral, String val1, char operator, String val2){
        int[] arrRomNum = romanNumeral.readRomNum(val1, val2);
        int costing = calculate(arrRomNum[0], operator, arrRomNum[1]);
        String result = romanNumeral.writeRomNum(costing+"");
        System.out.println(result);
    }

    public void arabCalc(String val1, char operator, String val2){
        int value1 = Integer.parseInt(val1);
        int value2 = Integer.parseInt(val2);
        int costing = calculate(value1, operator, value2);
        System.out.println(costing);
    }

    static int calculate(int val1, char operator, int val2) {
        int costing;
        switch(operator) {
            case '-':
                costing = val1 - val2;
                break;
            case '+':
                costing = val1 + val2;
                break;
            case '*':
                costing = val1 * val2;
                break;
            case '/':
                costing = val1 / val2;
                break;
            default:
                throw new IllegalArgumentException("Неожиданный оператор вычисления!");
        }
        return costing;
    }
}
