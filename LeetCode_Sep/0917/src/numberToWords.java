////273 Integer to English Words
//
//import java.util.Scanner;
//
//public class numberToWords {
//    public String numberToWords(int num) {
////        String result = new String();
//        String[] oneDigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//        String[] twoDigits = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
//        String[] plusTens = {null, null, "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
//        String[] moreThanHundreds = {"Hundred", "Thousand", "Million", "Billion"};
//
//        if (num < 10) return oneDigit[num];
//        else if (num < 20) {
//            int firstDigit = num % 10;
//            return twoDigits[firstDigit];
//        } else if (num < 100) {
//            int firstDigit = num % 10;
//            int secondDigit = num / 10;
//
//            if (firstDigit == 0) return plusTens[secondDigit];
//            else return plusTens[secondDigit] + " " + oneDigit[firstDigit];
//
//        } else if (num < 1000) {
//            int hundred = num / 100;
//            num = num % 100;
//            if (num == 0) {
//                return oneDigit[hundred] + " Hundred ";
//            } else {
//                int firstDigit = num % 10;
//                int secondDigit = num / 10;
//
//                if (firstDigit == 0) {
//                    return oneDigit[hundred] + " Hundred " + plusTens[secondDigit];
//                } else return oneDigit[hundred] + " Hundred " + plusTens[secondDigit] + " " + oneDigit[firstDigit];
//            }
//        } else if (num < 1000000) {
//            int thousand = num / 1000;
//            num = num % 1000;
//            if (num == 0) {
//                return oneDigit[thousand] + " Thousand ";
//            } else {
//                int hundred = num / 100;
//                num = num % 100;
//                int firstDigit = num % 10;
//                int secondDigit = num / 10;
//                if (hundred == 0) {
//                    if (firstDigit == 0) return oneDigit[hundred] + " Hundred " + plusTens[secondDigit];
//                    else return oneDigit[hundred] + " Hundred " + plusTens[secondDigit] + " " + oneDigit[firstDigit];
//                }
//
////
////            int billion = num / 1000000000;
////            num = num % 100000000;
////            if (num == 0 ) return oneDigit[billion] + " Billion ";
////            else {
////                int million = num / 1000000;
////                num = num % 1000000;
////                if (num == 0 ) return oneDigit[billion] + " Billion " + oneDigit[million] + " Million ";
////                else {
////                    int thousand = num / 1000;
////                    num = num % 1000;
////                    if (num == 0) {
////                        return oneDigit[billion] + " Billion " + oneDigit[million] + " Million " + oneDigit[thousand] + " Thousand";
////                    }
////                    else {
////                        int hundred = num / 100;
////                        num = num % 100;
////                        if(num == 0) {
////                            return oneDigit[billion] + " Billion " + oneDigit[million] + " Million " + oneDigit[thousand] + " Thousand" + oneDigit[hundred] + " Hundred ";
////                        }
////                        else {
////                            int firstDigit = num % 10;
////                            int secondDigit = num / 10;
////
////                            if (firstDigit == 0) {
////                                return oneDigit[billion] + " Billion " + oneDigit[million] + " Million " + oneDigit[thousand] + " Thousand" + oneDigit[hundred] + " Hundred " + plusTens[secondDigit];
////                            }
////                            else return oneDigit[billion] + " Billion " + oneDigit[million] + " Million " + oneDigit[thousand] + " Thousand" + oneDigit[hundred] + " Hundred " + plusTens[secondDigit] + " " + oneDigit[firstDigit];
////                        }
////                    }
////                }
////            }
////        }
////    }
//            }
//        }
//    }
//
//
//        public static void main(String[] args) {
//            numberToWords words = new numberToWords();
//            int number = 2000;
//            System.out.println("The number " + number + " in English is " + words.numberToWords(number));
//        }
//
//}
