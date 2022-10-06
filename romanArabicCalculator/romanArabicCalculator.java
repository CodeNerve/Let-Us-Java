import java.util.Scanner;


public class romanArabicCalculator {
    static int number1, number2, result; 
    static char symbol;

    public static void main(String[] args) throws CalcException {
        Scanner console = new Scanner(System.in);
        String inputConsole = console.nextLine(); 
        char[] inputConsoleMass = inputConsole.toCharArray();
        String inputConsoleMassStr = String.valueOf(inputConsoleMass);
        int ii=0;

        for (int i=0; i<inputConsoleMassStr.length(); i+=1){ 
            char c = inputConsoleMassStr.charAt(i);
            if(c=='/' || c=='*' || c=='+' || c=='-'){
                ii+=1;
                if(ii>=2){
                    throw new CalcException("Формат математической операции не удовлетворяет заданию");
                }
            }
        }

        if(ii<=0){
            throw new CalcException("String isn't math operation"); 
        }

        String[] inputConsoleMassStrMass = inputConsoleMassStr.split("[ ]");
        number1 = RomatoAraba(inputConsoleMassStrMass[0]);
        number2 = RomatoAraba(inputConsoleMassStrMass[2]);
        if (number1<0 && number2<0){ 
            result=0;
            number1 = Integer.parseInt(inputConsoleMassStrMass[0]);
            number2 = Integer.parseInt(inputConsoleMassStrMass[2]);
            symbol = inputConsoleMassStrMass[1].charAt(0);
            result=calca(number1, number2, symbol);
            System.out.println(result); 
        }else if(number1<0 || number2<0){ 
            throw new CalcException("Input does not meet requirements"); 
        }else{ 
                symbol = inputConsoleMassStrMass[1].charAt(0);
                result=calca(number1, number2, symbol);
                if(result>0){
                    String  resultRoman = convertNumToRoman(result);
                    System.out.println(resultRoman);
                }else if(result<=0){
                    throw new CalcException("Roman Numerals do not have a negative number and zero");
                }
            }
        }
        
    

    static int calca(int n1, int n2, char sym) throws CalcException { 
        int res = 0;
        if (n1 <= 10 && n2 <= 10 && n1 != 0 && n2 != 0) {
            switch (sym) {
                case '*':
                    res = n1 * n2;
                    return res;

                case '/':
                    if (n2 == 0) {

                        throw new CalcException("You can't divide by zero!");
                        
                    } else {
                        res = n1 / n2;
                        return res;

                    }

                case '+':
                    res = n1 + n2;
                    return res;

                case '-':
                    res = n1 - n2;
                    return res;

                default:

                throw new CalcException("Operator missing");
                    
            }
        } else {

            throw new CalcException("The calculator accepts numbers from 1 to 10 inclusive, no more.");
        }

    }

    static int RomatoAraba(String roman) { 
        int s = 0;

        if (roman.equals("I")) {
            s = 1;
            return s;
        } else if (roman.equals("II")) {
            s = 2;
            return s;
        } else if (roman.equals("III")) {
            s = 3;
            return s;
        } else if (roman.equals("IV")) {
            s = 4;
            return s;
        } else if (roman.equals("V")) {
            s = 5;
            return s;
        } else if (roman.equals("VI")) {
            s = 6;
            return s;
        } else if (roman.equals("VII")) {
            s = 7;
            return s;
        } else if (roman.equals("VIII")) {
            s = 8;
            return s;
        } else if (roman.equals("IX")) {
            s = 9;
            return s;
        } else if (roman.equals("X")) {
            s = 10;
            return s;
        }
        return -1;

    }

    static String convertNumToRoman (int numArabian) { 
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }

}