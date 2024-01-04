class parent{
    parent(){
        this(y);
       System.out.println("Default");
    }
    parent(int y){
        
        System.out.println(y);
        System.out.println("Parent constructor");
    }
    parent(int y,int x){
        
        System.out.println(y+x);
        System.out.println("Parent constructor");                                                           
    }
}
class A extends parent{
    A(){
        System.out.println("The child construcutor1");
    }
    A(int y){
        
        super(y);
        
        System.out.println("The child construcutor2");
    }
    A(int y,int x){
        
        super(y,x);
        
        System.out.println("The child construcutor2");
    }
    

    public static void main(String[] args) {
        A obj = new A(2, 5);
    }
}
