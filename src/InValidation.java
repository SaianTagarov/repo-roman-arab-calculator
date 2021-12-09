public class InValidation {
    boolean isCorrect(String[] inValue){
        if(inValue.length != 3){
            throw new IllegalArgumentException("Неверное выражение!");
        }

        try{
            int val1 = Integer.parseInt(inValue[0]);
            if(val1 < 1 || val1 > 10) {
                throw new IllegalArgumentException("Первый аргумент должен быть от 1 до 10 включительно!");
            }
            try{
                int val2 = Integer.parseInt(inValue[2]);
                if(val2 < 1 || val2 > 10) {
                    throw new IllegalArgumentException("Второй аргумент должен быть от 1 до 10 включительно!");
                }
            }catch(NumberFormatException e){
                throw new IllegalArgumentException("Введены аргументы разного формата!");
            }
        }catch(NumberFormatException j){
            if(inValue[2].charAt(0)!='V'&&inValue[2].charAt(0)!='X'&&inValue[2].charAt(0)!='I'){
                throw new IllegalArgumentException("Введены аргументы разного формата!");
            }
        }
        return true;
    }

}
