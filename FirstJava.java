class FirstJava{
	int i,j;//instance or object variable
    /*FirstJava(){
	    System.out.println("Constructor....Default");
	}*/
	FirstJava(int i,int j){
		//System.out.println("Constructor....");
		this.i=i;
		this.j=j;
	}
	void add(){
		System.out.println(this.i+this.j);
	}
	public static void main(String str[])
	{
		//System.out.println("Hello World!!!");
		FirstJava fj1=new FirstJava(123,456);
		fj1.add();
		//FirstJava fj2=new FirstJava();
		//System.out.println(fj2);		
		//System.out.println(fj1.i);	//Error because i is local variable
	}
}				