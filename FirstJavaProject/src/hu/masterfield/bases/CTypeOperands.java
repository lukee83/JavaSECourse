package hu.masterfield.bases;

public class CTypeOperands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int szam = 1;
		szam++;
		System.out.println(szam);
		
		System.out.println(szam++);
		
		System.out.println(szam);
		
		System.out.println(++szam);
		
		szam+=6;
		
		System.out.println(szam);
		
		String s1 = "alma";
		String s2 = s1;
		s2 = "korte";
		System.out.println(s1);
		
		System.out.println("------------");
		
		String ss1 = "HW";
		String ss2 = "HW";
		String ss3 = "HW";
		
		System.out.println(ss1.hashCode());
		System.out.println(ss2.hashCode());
		System.out.println(ss3.hashCode());
		
		ss3 = "aaaaaaa";
		
		System.out.println(ss2);
		
		System.out.println(ss1.hashCode());
		System.out.println(ss2.hashCode());
		System.out.println(ss3.hashCode());
		ss3+='b';
		System.out.println(ss3.hashCode());
		
		
		System.out.println(ss3);
		
		
		
	}

}
