
class Obj {
String fname;
String lname;
Obj(String f,String l)
{
	fname=f;
	lname=l;
}

public boolean equals(Obj ob)
{ if(this.fname==ob.fname) return true;
else return false;
  
	
}
	public static void main(String[] args) {
		Obj a= new Obj("abcd","efgh");
		

	}

}
