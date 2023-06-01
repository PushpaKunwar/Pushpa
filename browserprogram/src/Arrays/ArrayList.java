package Arrays;

import java.util.List;

public class ArrayList {
	public static void main(String[]args) {
		List<Object>arrayList1 =new java.util.ArrayList<>();
		arrayList1.add(10);
		arrayList1.add("Selenium");
		
		for(int index=0;index<arrayList1.size();index++)
		{
		
			System.out.println(arrayList1.get(index));
		}
		System.out.println("******");
		
		for(Object index:arrayList1)
		{
			System.out.println(index);
			
	}
}
}



