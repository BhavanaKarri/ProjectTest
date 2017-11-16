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

    
