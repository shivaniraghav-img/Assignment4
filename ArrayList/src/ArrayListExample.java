// this program shows how to add odd number is array list using lambda expression 
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner(System.in);//Scanner Object
   int number=Integer.MAX_VALUE;// 
  
     ArrayList<Integer> list = new ArrayList<>();//Array list
     
     ArrayList<Integer> odd= new ArrayList<>();//Array odd list
     System.out.println("Enter number of an ArrayList");
     System.out.println("If you print 0 you will not allowed  to enter next element in list");
     
     while (number!=0)// number not equal to zero then add element in list
     {
    	 number=sc.nextInt();
    	 list.add(number);
     }
     for(int i =0;i<list.size();i++)
     {
    	 if(list.get(i)%2!=0)
    	 {
    		 odd.add(list.get(i));// if number divide by zero and not equal to zero its a odd number
    	 }
	}
    if (odd.isEmpty())
	System.out.println("odd number is not present in this list");// odd number is not present
    else
    	odd.forEach(l->System.out.println(l));// print list
}
}