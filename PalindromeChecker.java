import java.util.*;

class PalindromeChecker 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("                    PALINDROME CHECKER \n");
        System.out.print("Enter the word or phrase: ");
        String str = sc.nextLine();
        
        // Remove spaces and punctuation
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) 
        {
            if (Character.isLetterOrDigit(ch)) 
            {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String processedStr = sb.toString();
        
        String revstr = "";
        int len = processedStr.length();
        
        for(int i = len - 1; i >= 0; i--) 
        {
            revstr = revstr + processedStr.charAt(i);
        }
        
        if(revstr.equals(processedStr)) 
        {
            System.out.println("Yes! It is a palindrome.");
        } 
        else
        {
            System.out.println("It is not a palindrome.");
        }
        
        sc.close();
    }
}



    

