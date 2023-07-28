package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String>HM=new HashMap<Integer,String>();
		
		HashMap HM1=new HashMap();
		
		HM.put(10, "Sampada");
		HM.put(11, "Niyati");
		HM.put(12, "Aditi");
		HM.put(13, "Divya");
		HM.put(14, "Manavi");
		
		System.out.println(HM);   //{10=Sampada, 11=Niyati, 12=Aditi, 13=Divya, 14=Manavi}
		
		System.out.println(HM.get(12));   //Aditi
		
		System.out.println(HM.containsKey(13));  // True
		System.out.println(HM.containsKey(17));  // false
		
		System.out.println(HM.containsValue("Sampada"));  //true
		System.out.println(HM.containsValue("Akshay"));  //false
		
		System.out.println(HM.isEmpty());  //false
		System.out.println(HM1.isEmpty());  //true
		
		System.out.println(HM.keySet());  //[10, 11, 12, 13, 14]
		System.out.println(HM.values());  //[Sampada, Niyati, Aditi, Divya, Manavi]
		
		for(Object obj:HM.keySet()) {
			System.out.println(obj);   // 10 11 12 13 14
		}
		for(Object obj:HM.values()) {
			System.out.println(obj);  // Sampada Niyati Aditi Divya Manavi
		}

		for(Object obj1:HM.keySet()) {
		System.out.println(obj1+" "+HM.get(obj1));	 
//		10 Sampada
//		11 Niyati
//		12 Aditi
//		13 Divya
//		14 Manavi
		}
		//Entry Method
		System.out.println("********************");
		
		for(Map.Entry entry:HM.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("********************");

		Set S1=HM.entrySet();
		Iterator it = S1.iterator();
		while(it.hasNext()) {
			Map.Entry entry =(Entry)it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		
	}

}
