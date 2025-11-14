class MemSize{
	public static void main(String args[]){
		int size = Integer.SIZE;
		System.out.println("Size of integer is "+ size/8);
		int min = Integer.MIN_VALUE;
		System.out.println("minimum value of integer is "+ min);
		int max = Integer.MAX_VALUE;
		System.out.println("maximum value of integer is "+ max);
		
		int size2 = Long.SIZE;
		System.out.println("Size of Long is "+ size2/8);
		long min2 = Long.MIN_VALUE;
		System.out.println("minimum value of Long is "+ min2);
		long max2 = Long.MAX_VALUE;
		System.out.println("maximum value of Long is "+ max2);
		
		int size3 = Short.SIZE;
		System.out.println("Size of Short is "+ size3/8);
		long min3 = Short.MIN_VALUE;
		System.out.println("minimum value of Short is "+ min3);
		long max3 = Short.MAX_VALUE;
		System.out.println("maximum value of Short is "+ max3);
		
		int size4 = Character.SIZE;
		System.out.println("Size of Character is "+ size4/8);
		int ch = Character.MAX_VALUE;
		System.out.println(ch);
	}
}