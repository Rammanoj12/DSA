package RevisionJava;
import java.util.Arrays;
import java.util.Scanner;







// Encapsulation
// class A{
//     private String name;

//     public void setName(String Name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
// }

// public class Practise{
    


//     public static void main(String[] args) {
//         Practise obj = new Practise();
//         obj.setName("MANOJ");
//         System.out.println(obj.getName());
//     }
// }




//String
// public class Practise{
//     public static void m1(){
//         System.out.println("HI");
//     }
//     public static void main(String[] args) {
//         String s1 = "RAM";
//         String s2 = new String("RAM");
//         if(s1.equals(s2)){
//             System.out.println("This is equals");
//         }else{
//             System.out.println("This is not equals");
//         }

//     }
// }









//Two Dimensional Array
// public class Practise{
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int row =  sc.nextInt();
//         // int col = sc.nextInt();
//         // int[][] arr = new int[row][col];
//         // System.out.println("Enter the array");
//         // for(int i=0;i<row;i++){
//         //     for(int j=0;j<col;j++){
//         //         arr[i][j] = sc.nextInt();
//         //     }
//         // }

//         // for(int i=0;i<row;i++){
//         //     for(int j=0;j<col;j++){
//         //         System.out.print(arr[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

        

//         int[][] arr = {{1,2,3},{4,5,6,10},{7,8,9}};
       
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }








// //String to char array
// public class Practise{
//     public static void main(String[] args) {
//         String str ="MANOJ";

//         char[] arr =  new char[str.length()];
//         for(int i =0;i<str.length();i++){
//             arr[i] = str.charAt(i);
//         }

//         for(char result:arr){
//             System.out.println(result);
//         }
//         // char[] arr = str.toCharArray();
//         // System.out.println(arr);

        
//     }
// }




// //String to integer array

// public class Practise{
//     // static String myString(String str){
//     //     return str;
//     // }
//     public static void main(String[] args) {
//     //     String str ="1 2 3 4 5";
//     //     String[] newString= str.split(" ");
//     //    int[] myArray = new int[newString.length];
//     //    for(int i=0;i<newString.length;i++){
//     //     myArray[i] = Integer.parseInt(newString[i]);
//     //    }
//     //    System.out.print("[");
//     //   for(int i=0;i<myArray.length;i++){
//     //     System.out.print(myArray[i]+" ");
//     //   }
//     //   System.out.print("]");
//         String str ="MANOJ";
//         int[] myArray = new int[str.length()];
//         for(int i=0;i<str.length();i++){
//             myArray[i] = (int) str.charAt(i);//narrow casting(manually)
//         }
//         System.out.print("[");
//         for(int num:myArray){
//             System.out.print(num+" ");
//         }
//         System.out.print("]");
//     }
// }






 //Integer array to string
// public class Practise{
//     static int[] myArray(int[] arr){
//         return arr;
//     }

//     public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] result = myArray(arr);
//        String conversion =  Arrays.toString(result);
//        System.out.println(conversion);
   
// }
// }






// //Method Overriding and Static Overriding
// // abstract  class A{
// //     abstract void square();
// // }
//   class A{
//     static void display(){
//         System.out.println("This is from parent display static");
//     }
//     static void print(){
//         System.out.println("This is from parent print static");
//     }
// }
//  public class Practise extends A {
//      static void display(){
//         System.out.println("This is from child display static");
//     }
//     static void print(){
//         System.out.println("This is from child print static");
//     }


//     public static void main(String[] args) {
//         A.display();
//         A.print();
//     }
// }



// //Function Overloading
// public class Practise {
//      static int square(int x){
//         return x * x;

//      }
//      static double square(double a){
//         return a * a*a;
//      }
//     public static void main(String[] args) {
        
//         Practise obj =  new Practise();
//         int result  = obj.square(2);
//         System.out.println(result);
//         double z  =  obj.square(12.2f);
//         System.out.println(z);
        
// }
//    Method overloading
// public class Practise{

     
//     static void square(int x){
//         System.out.println(x*x);
//     }
//     static void square(int x,int y){
//         System.out.println(x*y*y);
//     }
//     public static void main(String[] args) {
//         square(2);
//         square(2, 5);
//     }
// }


