package day26_methods;
/*
    create a method that accepts a name, make it in correct format
        Ex:     toM --- > Tom
                WINNIE - > Winnie
 */
public class FixFormat {

    //TODO:  Can you improve this code in case if user give more than one word - "tom jerry" - "Tom Jerry"
    public static String fixFormat (String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println( fixFormat( "wINNE") );
        System.out.println( fixFormat( "tom") );
    }

}
