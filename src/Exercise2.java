public class Exercise2 {
    public static void main(String[] args){

    /*
    #2
    Rotate the characters in a string by a given input and have the overflow appear at the beginning,
    e.g. “MyString” rotated by 2 is “ngMyStri”.
    */


        System.out.println(rotateStringRight("MyString", 2));
        System.out.println(rotateStringRight("HelloWorld", 5));

    }


    public static String rotateStringRight(String str, int num){
        int start = str.length() - num;
        String result = str.substring(start) + str.substring(0, start);

        return result;
    }

}
