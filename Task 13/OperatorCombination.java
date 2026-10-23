class OperatorCombination{
	public static void main(String [] args){
		int a = 10;
		int b = 3;
		int c = 5;
		
		a = b++ + c++;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		c = b = a;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		b = a-- + --b - c++;  
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		//10, 3, 5
		// 5, 5, 5
		//5, 4+4-6=2, 5
	}
}