package day45_a_stream.functions;

import java.util.ArrayList;

public class CallPredicateMethods {
    public static void main(String[] args) {

        //new ArrayList<>().removeIf(each -> each.contains("hi"));

        // Since I am calling that Functional Interface reference FROM DIFFERENT CLASS
        // I DO need to use the Class Name to call
        boolean result = UsePredicate.isPalindrome.test("anna");
        System.out.println(result);
        System.out.println(  UsePredicate.isPalindrome.test("hello")   );

        System.out.println();
        System.out.println(UsePredicate.isPrime.test(5));
        System.out.println(UsePredicate.isPrime.test(6));



    }
}
