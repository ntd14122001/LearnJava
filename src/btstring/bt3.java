package btstring;

public class bt3 {

	public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);

        return string;
    }

    public static void main(String args[])
    {

        // Character array
        char s[] = { 'D','A','T'};

        // Printing converted string from character array
        System.out.println(toString(s));
    }
}