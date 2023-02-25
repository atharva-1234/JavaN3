package org.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=Arrays.asList(12,4,67,113);
		Optional<Integer>obj1=obj.stream().reduce((a,b)->(a+b));
		if(obj1.isPresent())
		{
			System.out.println(obj1.get());
		}

	}

}
