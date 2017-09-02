import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Student
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String str=br.readLine();
        int i=0;
        for(i=0;i<str.length();i++)
        {
            char ch[]=str.toCharArray();
              if(Character.isLetter(ch[i]))
              {
                  System.out.println("alphapet");
              }
              else
              {
                  System.out.println("not a alphaphet");
              }
        }
        
        
    }
    
}
