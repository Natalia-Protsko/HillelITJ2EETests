import java.io.*;
import java.util.*;
public class Task1{
  
  public static void readFile(String fileName) throws IOException{
    FileInputStream f = new FileInputStream(fileName); 
    HashSet<String> words = new HashSet<String>() ;
    try{
      BufferedReader r = new BufferedReader(new InputStreamReader (f) );
      String line; 
      while (r.ready()){
        line = r.readLine().toLowerCase().replaceAll("[,;:/.]","");
        for (String s:line.split(" ")){
          if (s.length() >0){
            words.add(s);
          }
        }
      }
    }
    finally {
      f.close();
    }
    System.out.println(words);
        
  }

  public static void main (String [] args){
    if (args.length == 0 ){
       System.out.println("put filename  as  parameter");
    }
    else {
      try{
        readFile(args[0]);
      }
      catch (IOException e){
        System.out.println(e);
      }
      
    }
    
  }
}