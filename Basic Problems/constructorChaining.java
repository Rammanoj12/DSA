class A{
    A(){
        
    System.out.println("Default Constructor");    
    }
    A(String name){
        this();
      System.out.println("Parent Constructor");
    }
    A(String name,int x){
        this.x=x;
        this.name =name;
        System.out.println(x);
        System.out.println(name);
        System.out.println("Parent Constructor2");
        
    }

}





public class constructorChaining extends A{
    constructorChaining(){
        System.out.println("Child Default Constructor");
    }
    constructorChaining(String name){
        super(name);
        
        System.out.println("Child Default Constructor1");
    }
     constructorChaining(String name,int x){
        super(name,x);
        
        System.out.println("Child Default Constructor");
    }
    public static void main(String[] args) {
        constructorChaining obj= new constructorChaining("MANOJ",1);
        
    }
    
}
