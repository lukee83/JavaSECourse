package hu.unicon.oop;

public class OOP_Tasks 
{

	public static void emp() 
	{
		Employee e1 = new Employee();
		
		e1.setSalary(100);
		e1.incrSalary(20D);
		
		System.out.println(e1.getSalary());
		System.out.println(e1.getClass().getName());
		
		System.out.println(e1);
	}

	public static void callMyRandom()
	{
		MyRandom r = new MyRandom();
		System.out.println(r.nextInt(3));
		System.out.println(r.nextIntInterval(10, 11));
	}
	
	public static void callBooksShelf()
	{
		BookShelf bs1 = new BookShelf();
		System.out.println(bs1);
		int[] tempShelf = {2,3,4};
		BookShelf bs2 = new BookShelf(2, 3, tempShelf );
		System.out.println(bs2);
		
		bs1.addBooks(30);
		System.out.println(bs1);
		System.out.println("BookCount: " + bs1.getBookCount());
		bs1.str("kiscica");
	}
	
	public static void callShape()
	{
		Shape idom1 = new Circle(10);
		System.out.println("idom1 kerulete: " + idom1.getPerimeter());
		System.out.println("idom1 terulete: " + idom1.getArea());
		
		Shape idom2 = new Rectangle(4, 5);
		System.out.println("Idom2 kerulete: " + idom2.getPerimeter());
		System.out.println("idom2 terulete: " + idom2.getArea());
		
		Shape idom3 = new Triangle(2, 3, 4);
		System.out.println("Idom3 kerulete: " + idom3.getPerimeter());
		System.out.println("idom3 terulete: " + idom3.getArea());
		
		System.out.println(idom3.getClass());
		
		((Circle)idom1).test();
		((Rectangle)idom2).test();
		
		// ((Circle)idom2).test(); // ClassCastException
		
		Object o = new Triangle(2,3,4);
		System.out.println(((Shape)o).getArea());
		
		System.out.println("Class of o: " + o.getClass().getName());
		
		
		
	}
	
	public static void task5()
	{
		
	}
	
	public static void main(String[] args) 
	{
		// emp();
		// callMyRandom();
		// callBooksShelf();
		// callShape();
		
		task5();
		
		
	}

}
