import java.util.*;
public class Task2{

   static <E> void  copyArray ( E [] arr, Collection <E> coll){
     for (E e:arr){
      coll.add(e);
     }
   }

   public static void main (String [] args){
     String [] arrS = {"aa","bb","cc"};
     Collection<String> collS = new HashSet<String>();
     copyArray(arrS, collS);

     System.out.println(collS);

     Integer [] arrI = {1,2,3,4,5};
     Collection<Integer> collI = new HashSet<Integer>();
     copyArray(arrI, collI);

     System.out.println(collI);

     
   }
}