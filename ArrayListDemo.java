import java.util.*;
//Array list demo
class ArrayListDemo
{
   public static void main(String args[])
    {
      ArrayList<String>al=new ArrayList<String>();
      al.add("Asia");
	al.add("North America");
      al.add("South America");
      al.add("Africa");
      al.add("Europe");
	al.add(1,"Australia");
      al.add(2,"Antarctica");
	System.out.print("Size of the array list is:"+al.size());
      System.out.print("\nRetrieving the elements using ArrayList using iterator:");
      Iterator it=al.iterator();
      while(it.hasNext())
      System.out.print(it.next()+"\t");
      
   }
}