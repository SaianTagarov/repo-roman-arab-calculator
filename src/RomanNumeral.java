public class RomanNumeral {
    public boolean isRomNumeral(String val1) {
        return val1.charAt(0) == 'I' || val1.charAt(0) == 'V' || val1.charAt(0) == 'X';
    }

    public int[] readRomNum(String val1, String val2){
        int dec;
        int unit;

        if (val1.equals("I")) {
            dec = 1;
        } else if (val1.equals("II")) {
            dec = 2;
        } else if (val1.equals("III")) {
            dec = 3;
        } else if (val1.equals("IV")) {
            dec = 4;
        } else if (val1.equals("V")) {
            dec = 5;
        } else if (val1.equals("VI")) {
            dec = 6;
        } else if (val1.equals("VII")) {
            dec = 7;
        } else if (val1.equals("VIII")) {
            dec = 8;
        } else if (val1.equals("IX")) {
            dec = 9;
        } else if (val1.equals("X")) {
            dec = 10;
        }else{
            throw new IllegalArgumentException("Аргумент должен быть от I до X включительно!");
        }


        if (val2.equals("I")) {
            unit = 1;
        } else if (val2.equals("II")) {
            unit = 2;
        } else if (val2.equals("III")) {
            unit = 3;
        } else if (val2.equals("IV")) {
            unit = 4;
        } else if (val2.equals("V")) {
            unit = 5;
        } else if (val2.equals("VI")) {
            unit = 6;
        } else if (val2.equals("VII")) {
            unit = 7;
        } else if (val2.equals("VIII")) {
            unit = 8;
        } else if (val2.equals("IX")) {
            unit = 9;
        } else if (val2.equals("X")) {
            unit = 10;
        }else{
            throw new IllegalArgumentException("Аргумент должен быть от I до X включительно!");
        }
        int[] arabNum = new int[2];
        arabNum[0] = dec;
        arabNum[1] = unit;
        return arabNum;
    }



    public String writeRomNum(String resultArabNum) {
        String resultRomNum = "";

        if(resultArabNum.equals("100")) {
            return "C";
        }else if(resultArabNum.equals("1")) {
            return "I";
        }else if(resultArabNum.equals("2")) {
            return "II";
        }else if(resultArabNum.equals("3")) {
            return  "III";
        }else if(resultArabNum.equals("4")) {
            return "IV";
        }else if(resultArabNum.equals("5")) {
            return "V";
        }else if(resultArabNum.equals("6")) {
            return "VI";
        }else if(resultArabNum.equals("7")) {
            return "VII";
        }else if(resultArabNum.equals("8")) {
            return "VIII";
        }else if(resultArabNum.equals("9")) {
            return "IX";
        }else if(resultArabNum.equals("10")) {
            return "X";
        }else if(resultArabNum.equals("0")) {
            throw new IllegalArgumentException("Решение равно нулю (не формат)");
        }

        if(resultArabNum.charAt(0) == '1' ) {
            resultRomNum += "X";
        }else if(resultArabNum.charAt(0) == '2') {
            resultRomNum += "XX";
        }else if(resultArabNum.charAt(0) == '3') {
            resultRomNum += "XXX";
        }else if(resultArabNum.charAt(0) == '4') {
            resultRomNum += "XL";
        }else if(resultArabNum.charAt(0) == '5') {
            resultRomNum += "L";
        }else if(resultArabNum.charAt(0) == '6') {
            resultRomNum += "LX";
        }else if(resultArabNum.charAt(0) == '7') {
            resultRomNum += "LXX";
        }else if(resultArabNum.charAt(0) == '8') {
            resultRomNum += "LXXX";
        }else if(resultArabNum.charAt(0) == '9') {
            resultRomNum += "XC";
        }else if(resultArabNum.charAt(0) == '-') {
            throw new IllegalArgumentException("Решение меньше нуля (не формат)");
        }

        if(resultArabNum.charAt(1) == '1' ) {
            resultRomNum += "I";
        }else if(resultArabNum.charAt(1) == '2') {
            resultRomNum += "II";
        }else if(resultArabNum.charAt(1) == '3') {
            resultRomNum += "III";
        }else if(resultArabNum.charAt(1) == '4') {
            resultRomNum += "IV";
        }else if(resultArabNum.charAt(1) == '5') {
            resultRomNum += "V";
        }else if(resultArabNum.charAt(1) == '6') {
            resultRomNum += "VI";
        }else if(resultArabNum.charAt(1) == '7') {
            resultRomNum += "VII";
        }else if(resultArabNum.charAt(1) == '8') {
            resultRomNum += "VIII";
        }else if(resultArabNum.charAt(1) == '9') {
            resultRomNum += "IX";
        }else if(resultArabNum.charAt(1) == '0') {
            resultRomNum += "";
        }
        return resultRomNum;
    }
}
