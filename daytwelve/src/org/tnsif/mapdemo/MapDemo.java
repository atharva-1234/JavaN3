package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unordered 
      Map<Integer,String>obj1=new HashMap<> ();
      obj1.put(411001, " MG road ");// pune 
      obj1.put(422001, "MG road ");// nashik 
      System.out.println(obj1);
      // ordered
      Map<Integer,String>obj2=new LinkedHashMap<> ();
      obj2.put(411001, " MG road ");// pune 
      obj2.put(422001, "MG road ");// nashik 
      System.out.println(obj2);
	}

}
