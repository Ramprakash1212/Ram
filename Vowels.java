import java.io.*;
import java.util.*;
  class Vowels
{
  public static void main(String args[])throws IOException 
  {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    String str=br.readLine();
    if(str=="a" || str=="A" || str=="e" || str=="E" || str=="i" || str=="I"|| str=="o" || str=="O" || str=="u" || str=="U")
    {
      System.out.println("Vowel");
    }
    else
    {
      System.out.println("Consonant");
    }
  }
}
