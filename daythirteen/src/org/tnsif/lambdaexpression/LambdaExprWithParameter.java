package org.tnsif.lambdaexpression;
//program to demonstrate on Lambda Expression to implement functional interface
//driver class

public class LambdaExprWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using lambda expression
				Cube c=(a)->
				{
					return a*a*a;
				};
				System.out.println("Cube of 5 is:" +c.calculate(5));
				//using lambda expression

				IsOdd o=(a)->a%2!=0?true:false;
				System.out.println(o.checkOdd(15));
				System.out.println(o.checkOdd(16));

	}

}
