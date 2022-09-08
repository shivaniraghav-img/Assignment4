// this program will display using a key print its square 

import java.util.HashMap;
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,Integer> numbers = new HashMap<>();// add values to the HashMap
     numbers.put(2,4);
     numbers.put(5,25);
     numbers.put(7,49);
     numbers.put(9,81);
     for(int i=1;i<=15;i++)
     {
    	 if(numbers.containsKey(i))//display key and value if its contain
    	 {
    		 System.out.println(i+"Number presnt in this list");
    	 }
    	 else
    	 {
    		 System.out.println(i+"Number  is not presnt in this list");
    	 }
     }
     for(Integer i:numbers.keySet())
     {
    	 System.out.println("key:"+i+"value:"+numbers.get(i));// prints square value of key
     }
	}

}
