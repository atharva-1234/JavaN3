package org.tnsif.staticvariabledemo;

public class StaticBlockExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StaticBlock.getName());
		
		StaticBlock s=new StaticBlock();
		s.setN(410);
		System.out.print(s.getN());

	}

}
