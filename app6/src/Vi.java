class Vi
{
	public static void main(String[] args) 
	{ int i = 0;
	int j = i++ + --i - ++i + i-- + i + --i + i++ ;
	//  j = 0   +   0 -  1  + 1   + 0 +  -1 + -1
		System.out.println(i);
		System.out.println(j);
	}
}


// Ans i =  0
//     j = -2