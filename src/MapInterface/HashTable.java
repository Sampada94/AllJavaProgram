package MapInterface;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer,String>HT=new Hashtable<>();
		Hashtable HT1=new Hashtable();
		
		HT.put(100, "Sampada");
		HT.put(200, "Niyati");
		HT.put(300, "Manavi");
		HT.put(400, "Divya");
		HT.put(500, "Arjun");
		HT.put(600, "Aditi");
		HT.put(700, "Dipika");
	// HT.put(100,"null");    // Hashtable doesnot allow null key -NullPointerException
		
	System.out.println(HT);   // {600=Aditi, 500=Arjun, 400=Divya, 300=Manavi, 200=Niyati, 100=Sampada}
		
		System.out.println(HT.get(200));   //Niyati
		
		System.out.println("************");
		
		System.out.println(HT.remove(700));  // Dipika
		System.out.println(HT);              //{600=Aditi, 500=Arjun, 400=Divya, 300=Manavi, 200=Niyati, 100=Sampada}
		System.out.println("************");
		
		System.out.println(HT.containsKey(500));  // True
		System.out.println(HT.containsKey(700));  // false
		
		System.out.println("************");
		
		System.out.println(HT.containsValue("Sampada"));  //true
		System.out.println(HT.containsValue("Prachi"));  //false
		System.out.println("************");
		
		System.out.println(HT.isEmpty());  //false
		System.out.println(HT1.isEmpty());  //true
		System.out.println("************");
		
		
		System.out.println(HT.keySet());  //[600, 500, 400, 300, 200, 100]
		System.out.println(HT.values());  //[Aditi, Arjun, Divya, Manavi, Niyati, Sampada]
		
		System.out.println("************");
		for(Object obj:HT.keySet()) {
			System.out.println(obj);   // 600 500 400 300 200 100
		}
		System.out.println("************");
		for(Object obj:HT.values()) {
			System.out.println(obj);  // Aditi Arjun divya Manavi Niyati Sampada
		}

		System.out.println("************");
		for(Object obj1:HT.keySet()) {
		System.out.println(obj1+" "+HT.get(obj1));	 

//		600 Aditi
//		500 Arjun
//		400 Divya
//		300 Manavi
//		200 Niyati
//		100 Sampada
		
		
		}
	}
}
	


