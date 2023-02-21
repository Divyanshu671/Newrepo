//Inheritance
class Super extends Object{
    int a,b,c;
    Super(int a){
        //this(a,456);
        //super();//super must be first statement
        System.out.println("In Super Constructor 1");
        this.a = a;
    }
    Super(int a,int b){
        System.out.println("In Super Constructor 2");
        this.b=b;
    }
    int add(){
        c=a+b;
        return c;
    }
}
class FJ extends Super{//extends Super{}
    FJ(int a){
            super(a);
    }
    public static void main(String str[]){
        System.out.println("In Main");
        FJ obj = new FJ(123);
        System.out.println(obj.add());
    }
}