import java.lang.*;
import java.io.*;
class VowelorConsonant
{
public static void main(String args[])throws Exception
{
char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
c=(char)br.read();
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
System.out.println("The character is a vowel");
}
else if((c>=97)&&(c<=122))
{
System.out.println("The character is a consonant");
}
else
{
System.out.println("Enter valid character");
}
}
}
