import java.lang.Math;
public class Palindrome
{
    public static boolean isPalindrome(int x) 
    {
    if (x < 0) return false;
    int rev = 0, num = x;
    while(x != 0)
        {
        rev = rev * 10 + x % 10;
        x /= 10;
        }
    return (num == rev);
    }
    
    public static void main(String[] args)
    {
        isPalindrome(1453);
    } 
}