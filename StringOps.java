import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(Arrays.toString(allIndexOf("MMMM",'M')));
    }

    public static String capVowelsLowRest (String string) {
        String newStr = new String("");
        boolean bool = true;
        for(int i = 0; i < string.length(); i++)
        {
            bool = (string.charAt(i)!=69 && string.charAt(i) !=73 && string.charAt(i) !=79 && string.charAt(i) != 85);
            if(string.charAt(i)==97 || string.charAt(i)==101 || string.charAt(i)==105 || string.charAt(i) ==111 || string.charAt(i) ==117)
            {
                newStr = newStr + toCapital(string.charAt(i));
            }
            else if (string.charAt(i)>65 && string.charAt(i)<=90 && bool )
            {
                newStr = newStr + toLower(string.charAt(i));
            }
            else
            {
                newStr = newStr + string.charAt(i);
            }
        }
        return newStr;
    }

    public static String camelCase (String string) {
        String newStr = new String("");
        for ( int i = 0; i<string.length(); i++)
        {
            if (i == 0 && string.charAt(i)!=32 )
            {
                newStr = newStr + toLower(string.charAt(i));
            }
            else if (string.charAt(i)!=32 && string.charAt(i-1) ==32 && newStr.length() !=0)
            {
                newStr = newStr + toCapital(string.charAt(i));       
            }
            else if (string.charAt(i)!=32)
            {
                newStr = newStr + toLower(string.charAt(i));
            }
        }


        return newStr;
    }

    public static int[] allIndexOf (String string, char chr) {
        int num = 0;
        for (int i = 0; i<string.length(); i++)
        {
            if(chr==string.charAt(i))
            {
                num++;
            }
        }
        int [] arrIndex = new int[num];
        int index = 0;
        for ( int j = 0; j<string.length(); j++)
        {
            if(chr==string.charAt(j))
            {
                arrIndex[index] = j;
                index++;
            }   
        }
        return arrIndex;
    }

    private static char toCapital (char chr)
    {
        if( chr >= 97 && chr <= 122)
        {
            char chrNew ;
            chrNew = (char)(chr-32);
            return chrNew;
        }
        return chr;

    }

    private static char toLower (char chr)
    {
        if( chr >= 65 && chr <= 90)
        {
            char chrNew ;
            chrNew = (char)(chr+32);
            return chrNew;  
        }
        return chr;

    }
}