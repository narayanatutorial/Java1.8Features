package com.narayanatutorial.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapForEachExample {

	public static void main(String[] args) {
		Map<String, Integer> mapObj=new HashMap<String,Integer>();
		mapObj.put("java", 10);
		mapObj.put("oracle", 20);
		mapObj.put("sap", 30);
		mapObj.put("spring", 40);
		mapObj.put("mysql", 50);
		mapObj.put("sqlserver", 60);
		
		System.out.println("\n*** normal for loop  with keyset ***");
		Set<String> setObj =mapObj.keySet();
		for(String obj:setObj) {
			System.out.println("key:"+obj+" value:"+mapObj.get(obj));
		}
		
		System.out.println("\n*** normal for loop with entryset ***");
		Set<Entry<String, Integer>> entrySetObj =mapObj.entrySet();
		for(Entry<String, Integer> entryObj:entrySetObj) {
			System.out.println("key:"+entryObj.getKey()+" value:"+entryObj.getValue());
		}
		
			
		System.out.println("\n*** foreach lamda ***");
		mapObj.forEach((k,v)->System.out.println("key:"+k+" value:"+v));

	}

}
