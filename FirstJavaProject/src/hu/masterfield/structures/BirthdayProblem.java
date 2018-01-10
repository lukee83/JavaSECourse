package hu.masterfield.structures;

import hu.masterfield.structures.MaxSearch;

class A
{
	public A() {this(10);}
	public A(int i) {this.i = i;}
	
	//final public int ffunc() {return 0;}
	//final public final int fiffunc() {return 0;}
	
	public final int i;
}

/*public */ class BirthdayProblem 
{
	public static boolean hasDuplicateElement(int[] arr) 
	{
		int i = 0, j= 0;
		while (i < arr.length-1) 
		{
			j = i+1;
			while(j < arr.length) 
			{
				
				if(arr[i] == arr[j]) {/*System.out.println(arr[i] + " <-> " + arr[j]);*/return true;}
				++j;
			}
			++i;
			
		}

		return false;
	}
	
	
	public static void main(String[] args) 
	{
		final int LETSZAM = 30;
		final int KISERLET_SZAM = 50000;
		
		int sikeres = 0;
		for(int k = 0; k<KISERLET_SZAM; ++k)
		{
			int[] arr = MaxSearch.arrayGenerator(LETSZAM);
		
			//MaxSearch.printArray(arr);
			//System.out.println(hasDuplicateElement(arr));
			if(hasDuplicateElement(arr)) ++sikeres;
		}
		
		System.out.println("atlag: " + ((float)sikeres / KISERLET_SZAM * 100));
		
	}

	

}
