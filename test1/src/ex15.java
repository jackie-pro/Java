import java.util.*;

public class ex15 {
	
	public static void main(String[] args) {
		// 不佳犯行，使用for each語法，輸出排序數值
		//TreeSet
		SortedSet a1 = new TreeSet();
		a1.add(1);
		a1.add(5);
		a1.add(3);
		a1.add(7);
		a1.add(9);
		a1.add(7);
		a1.add(5);
		
		for(Object obj1:a1) {
			System.out.print(obj1+" ");
		}
	    System.out.println();
	
	    //不加泛型，使用iterator語法，輸出順序數值
     	//ArrayList
	    Collection a2 = new ArrayList();
	    a2.add(1);
	    a2.add(5);
	    a2.add(3);
	    a2.add(7);
	    a2.add(9);
	    a2.add(7);
        a2.add(5);	
        
	    Iterator it = a2.iterator();
	    while(it.hasNext()) {
	      	Object obj2 = it.next();
	    	System.out.print(obj2+" ");
	    }
        System.out.println();

        //加入泛型，使用for each語法，輸出排序數值
        //ArrayList
        Collection <Integer> a3 = new TreeSet<Integer>();
        a3.add(1);
        a3.add(5);
        a3.add(3);
        a3.add(7);
        a3.add(9);
        a3.add(7);
        a3.add(5);
        
        for(Object obj3:a3) {
        	System.out.print(obj3+" ");
        }
        System.out.println();
}
	
}



