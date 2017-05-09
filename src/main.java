import java.io.*;

class main
{
  public static void main(String[] args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.print("Gib was ein: ");
    String eingabe = br.readLine();
    
    eingabe=eingabe.toUpperCase();
    System.out.println(eingabe);
    
    
  }
}