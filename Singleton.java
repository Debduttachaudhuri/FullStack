
public class Singleton {
	static Singleton obj=new Singleton(3,"abcd");
	int a;
	String name;
	 private Singleton(int c,String d) {
		 a=c;
		 name=d;
	 }
	public static Singleton getobj(){return  obj;
	
		 
	 }
	 

	public static void main(String[] args) {
	Singleton ob= Singleton.getobj();
	System.out.println(ob.hashCode());
	Singleton ob1= Singleton.getobj();
	System.out.println(ob1.hashCode());
	}

}
