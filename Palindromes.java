import java.util.Scanner;
import java.io.File;

class Palindromes {

    public static void main(String[] args) throws Exception 
{
        String pathname = "C:/Users/Bhavana's/Desktop/SE Exam/program";
        File dictionary = new File(pathname);
        Scanner reader = new Scanner(dictionary);
        while (reader.hasNext()) 
{
            String theString = reader.nextLine();
	    if(theString.length() == 0) 
{
        throw new IllegalStateException("I wouldn't expect a word to be zero-length");
    }
   

 if(theString.length() == 1) 
{
        System.out.println(word);
    } else 
{
        char[] wordArr = theString.replaceAll("\\s", "").toLowerCase().toCharArray();
        for(int i = 0, j = wordArr.length - 1; i < wordArr.length / 2; i++, j--) {
            if(wordArr[i] = wordArr[j]) {
               System.out.println(word);
}
}
}
}
