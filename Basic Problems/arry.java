import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class arry{
    public static void main(String[] args) {
        // int [] x={2,4,8,6,7};
        // System.out.println(x[2]);
        // System.out.println(x[4]);

        // forward array
        // int [] x={4,5,7,3,8,1,9};
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     System.out.print(x[i]+" ");
        // }
        // reverse array 
        // int [] x={4,5,7,3,8,1,9};
        // for(int i=x.length-1;i>=0;i--)
        // {
        //     System.out.print(x[i]+" ");
        // }

        // sum of all the array elemets
        // int [] x={4,5,7,3,8,1,9};
        // int sum=0;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     sum=sum+x[i];
        // }
        // System.out.println(sum);

        // reverse sum of all the array elements 
        // int [] x={4,5,7,3,8,1,9};
        // int sum=0;
        // for(int i=x.length-1;i>=0;i--)
        // {
        //     sum=sum+x[i];
        // }
        // System.out.println(sum);

        // sum of first three elements and last three elements
        // int [] x={4,5,7,3,8,1};
        // int sum1=0;int sum2=0;
        // int l=x.length;
        // for(int i=0;i<=(l/2)-1;i++)
        // {
        //     sum1=sum1+x[i];
        // }
        // System.out.println(sum1);
        // for(int i=l/2;i<=l-1;i++)
        // {
        //     sum2=sum2+x[i];
        // }
        // System.out.println(sum2);

        // reverse order of making sum for three elements and last three elements
        // int [] x={4,5,7,3,8,1};
        // int sum1=0;int sum2=0;
        // int l=x.length;
        // for(int i=(l/2)-1;i>=0;i--)
        // {
        //     sum1=sum1+x[i];
        // }
        // for(int i=l-1;i>=l/2;i--)
        // {
        //     sum2=sum2+x[i];
        // }
        // System.out.println(sum1);
        // System.out.println(sum2);

        // postive number and negative numbers finding
        // int [] x={4,-8,-6,-2,6,7,-3,8};
        // int pos=0;int neg=0;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]>0)
        //       pos=x[i];
        //     else
        //       neg=x[i];
        // }
        //  System.out.println(pos);
        //  System.out.println(neg);

        // finding the positive and negative and sum and multiply 
        // int [] x={4,-8,-6,-2,6,7,-3,8};
        // int pos=0;int neg=0;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]>0)
        //       pos=x[i];
        //     else
        //       neg=x[i];
        // }
        //  System.out.println(pos*neg*-1);
        //  System.out.println(pos-neg);
        
        // even and odd numbers
        // int [] x={4,5,6,2,1,7,3,8};
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]%2==0)
        //       System.out.print(x[i]+" ");
        //     else
        //       System.out.print(x[i]+" ");
        // }

        // even sum and odd sum numbers
        // int [] x={4,7,1,2,6,5,3,8};
        // int evensum=0;int oddsum=0;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]%2==0)
        //       evensum=evensum+x[i];
        //     else
        //       oddsum=oddsum+x[i];
        // }
        // System.out.println(evensum);
        // System.out.println(oddsum);
        // System.out.println(evensum*oddsum);

        // find the largest number 
        // int [] x={4,7,1,2,6,5,3,8};
        // int max=0;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]>max)
        //        max=x[i];
        // }
        // System.out.println(max);
        // method 2
        // int [] x={4,7,1,2,6,5,3,8};
        // int max=x[0];
        // for(int i=1;i<=x.length-1;i++)
        // {
        //     if(x[i]>max)
        //        max=x[i];
        // }
        // System.out.println(max);


        // find the lowest number
        // int [] x={4,7,1,2,6,5,3,8};
        // int min=x[7];
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]<min)
        //        min=x[i];
        // }
        // System.out.println(min);
        // method 2
        // int [] x={4,7,1,2,6,5,3,8};
        // int min=x[2];
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]<min)
        //        min=x[i];
        // }
        // System.out.println(min);

        // least value in negative members
        // int [] x={-4,-7,-1,-2,-6,-5,-3,-8};
        // int min=Integer.MIN_VALUE;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]>min)
        //      min=x[i];
        // }
        // System.out.println(min);


        // even highest number and odd highest number
        // int [] x={4,7,1,2,6,5,3,8};
        // int heven=Integer.MIN_VALUE;
        // int hodd=Integer.MIN_VALUE;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]%2==0)
        //      { if(x[i]>heven)
        //         heven=x[i];}
        //     else
        //     {if(x[i]>hodd)
        //      hodd=x[i];   } 
        // }
        // System.out.println(heven);
        // System.out.println(hodd);

        //  2 method even highest and odd highest on based on index
        // int [] x={4,7,1,2,6,5,3,8};
        // int heven=Integer.MIN_VALUE;
        // int hodd=Integer.MIN_VALUE;
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(i%2==0)
        //      {  if(x[i]>heven)
        //            heven=x[i];}
        //     else
        //     { if(x[i]>hodd)
        //         hodd=x[i];} 
        // }
        // System.out.println(heven);
        // System.out.println(hodd);

        // 3 method even highest and odd highest on based on index
        // int [] x={4,7,1,2,6,5,3,8};
        // int heven=Integer.MIN_VALUE;
        // int hodd=Integer.MIN_VALUE;
        // for(int i=0;i<=x.length-1;i=i+2)
        // {
        //     if(i%2==0)
        //       if(x[i]>heven)
        //           heven=x[i];}
        // for(int i=1;i<=x.length-1;i=i+2)
        // {      if(x[i]>hodd)
        //          hodd=x[i];
        // }
        // System.out.println(heven);
        // System.out.println(hodd);

        // Two array adding sum to second array
        // int[] x={4,5,9,8,7};
        // int[] x1={6,8,3,2,4};
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     x1[i]=x[i]+x1[i];
        //     System.out.println(x1[i]);
        // }

        // Two array subtracting sum to second array
        // int[] x={4,5,9,8,7};
        // int[] x1={6,8,3,2,4};
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     x1[i]=x[i]-x1[i];
        //     System.out.println(x1[i]);
        // }
        
        // max number in both arrays comparsion and it will be in second array
        // int[] x={4,5,9,8,7};
        // int[] x1={6,8,3,2,4};
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]>x1[i])
        //     x1[i]=x[i];     
        // }
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     System.out.println(x1[i]+" "+x[i]);
        // }

        // min number in both arrays comparsion and it will be in second array
        // int[] x={4,5,9,8,7};
        // int[] x1={6,8,3,2,4};
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     if(x[i]<x1[i])
        //     x1[i]=x[i];     
        // }
        // for(int i=0;i<=x.length-1;i++)
        // {
        //     System.out.println(x1[i]+" "+x[i]);
        // }

        //minimum number value
       // static void m1(int [] x)
    //    {
    //     int max=x[0];
    //     int l=x.length;
    //     for(int i=0;i<=l-1;i++)
    //     {
    //         if(x[i]<max)
    //            max=x[i];
    //     }
    //     System.out.println(max);
    //    }

    // or
    // static void m1(int [] x)
    // {
    //     int max=Integer.MIN_VALUE;
    //     int l=x.length;
    //     for(int i=0;i<=l-1;i++)
    //     {
    //         if(x[i]<max)
    //            max=x[i];
    //     }
    //     System.out.println(max);
    //    }

    //order of elements from positive to negative
//     static int[] m1(int [] x1)
//     {
//         int l=x1.length;int p=0;int n=0;int j=0;
//         int [] pos=new int[6];
//         int [] neg=new int[6];
//         for(int i=0;i<=l-1;i++)
//         {
//            if(x1[i]>0) 
//            pos[p++]=x1[i];
//            else
//            neg[n++]=x1[i];
//         }
//         for(int i=0;i<=l-3;i++)
//         {
//             x1[i]=pos[i];
//         }
//         for(int i=l-2;i<=l-1;i++)
//         {   
//             x1[i]=neg[j];
//             j++;
//         }    
//         return x1;
//     }
//     static void print(int [] b)
//     {     int l=b.length;
//         for(int i=0;i<=l-1;i++)
//         {
//             System.out.print(b[i]+" ");
//         }
//     }
//       public static void main(String[] args){
//       int [] x={-8,5,4,-7,9,6};
//       int [] y=Test.m1(x);
//       Test.print(y);
//    }  } or
// static void sum(int[] x,int l)
//       { int[] y=new int[l];int j=0;
//         for(int i=0;i<=l-1;i++)
//         { 
//             if(x[i]>0)
//             {y[j]=x[i];
//             j++;}
//        } 
//        for(int i=0;i<=l-1;i++)
//        {
//         if(x[i]<0)
//         {y[j]=x[i];
//         j++;}
//        }
//        for(int i=0;i<=l-1;i++)
//        {
//         x[i]=y[i];
//        }
//     }

//   order of elements from negative to positive
// static int[] m1(int [] x1)
// {
//     int l=x1.length;int p=0;int n=0;int j=0;
//     int [] pos=new int[6];
//     int [] neg=new int[6];
//     for(int i=0;i<=l-1;i++)
//     {
//        if(x1[i]<0) 
//        pos[p++]=x1[i];
//        else
//        neg[n++]=x1[i];
//     }
//     for(int i=0;i<=l-5;i++)
//     {
//         x1[i]=pos[i];
//     }
//     for(int i=l-4;i<=l-1;i++)
//     {   
//         x1[i]=neg[j];
//         j++;
//     }    
//     return x1;
// }
// static void print(int [] b)
// {     int l=b.length;
//     for(int i=0;i<=l-1;i++)
//     {
//         System.out.print(b[i]+" ");
//     }
// }

// the number we pass we get the index of that number
// static int m1(int[] x,int l,int n)
//     {
//        System.out.println("the index value is:");
//       for(int i=0;i<=l-1;i++)
//       {if(x[i]==n)
//          return i;}
//      return -1;}
//     public static void main(String[] args) {
//       Scanner s=new Scanner(System.in);
//       System.out.println("Enter input:");
//       int n=s.nextInt();
//       System.out.println("Enter length :");
//       int a=s.nextInt();
//       System.out.println("Enter value:");
//       int []y=new int[a];
//       for(int i=0;i<a;i++)
//       {
//         y[i]=s.nextInt();
//       }
//       int l=y.length;
//       int maxind=Test.m1(y,l,n);
//       System.out.println(maxind);

// addition adjacent values elements
// static void duplicate(int[] arr,int l)
// { 
//   for(int i=0;i<=l-1;i++)
//   {int result=0;
//     for(int j=(i+1);j<=l-1;j++)
//     {
//       result=result+arr[j];
//     }
//   System.out.println(result);
//   }
// }

// duplicate value print
// for(int i=0;i<=l-2;i++)
//     {
//       for(int j=i+1;j<=l-1;j++)
//       {
//         if(arr[i]==arr[j])
//         {
//           System.out.println(arr[j]);
//           break;
//         }
//       }
//     }

// Function to find the missing number
// public static int getMissingNo(int[] nums, int n)
// {
//     int sum = ((n + 1) * (n + 2)) / 2;
//     for (int i = 0; i < n; i++)
//         sum -= nums[i];
//     return sum;
// }

// elements sum in a array

// static int digit(int n,int l)
//      { int sum=0,ld;
//         for(int i=0;i<=l-1;i++)
//         {
//        while(n>0) 
//        {
//         ld=n%10;
//         sum=sum+ld;
//         n=n/10;
//        }}
//     return sum; }
//      static void replace(int[] n,int l)
//      {
//         for(int i=0;i<=l-1;i++)
//         {
//             n[i]=digit(n[i],l);
//         }
//      }
//      static void print(int [] n,int l)
//      {
//         for(int i=0;i<=l-1;i++)
//         {
//         System.out.println(n[i]);
//      }}

// sum of element
// while(n>0) 
//        {
//         ld=n%10;
//         sum=sum+ld;
//         n=n/10;
//        }

 // count of elements 
 // int count=0;
//  while(n[i]>0)
//        { count++;
//          n[i]=n[i]/10;
//        } 

// reverse of element number
// int result=0,ld;
//        while(n>0)
//        { ld=n%10;
//         result=result*10+ld;
//          n=n/10;
//        } 

// duplicate 
// static void count(int[] n,int l)
//     {
//       for(int i=0;i<=l-2;i++)
//       {
//         for(int j=i+1;j<=l-1;j++)
//          {if(n[i]==n[j])
//           {
//            System.out.println(n[i]);
//           break;

// leader numbers
//    static void m1(int[] arr,int l,ArrayList a)
//    { int max=arr[l-1];
//      a.add(max);
//     for(int i=l-1;i>=0;i--)
//     {
//         if(arr[i]>max)
//         {
//           max=arr[i];
//           a.add(arr[i]);
//         }
//     }
//    }
//  public static void main(String[] args) {
//     ArrayList a=new ArrayList();
//     int [] arr={16,17,4,3,5,2};
//     int l=arr.length;
//     m1(arr,l,a);
//     Collections.reverse(a);
//     System.out.println(a);

// prime numbers
// static void isPrime(int n) {
        
//     for(int i=2;i<=n;i++)
//     {  int count=0;
//        for(int j=2;j<=i-1;j++) // for(int j=2;j*j<=i;j++) // for(int j=2;j<=i/2;j++)
//     {          
//      if(i%j==0)
//        { 
//          count++;
//          break;
//        }
//     }
//     if(count==0)
//     System.out.println(i);
//     }
//  }
//  public static void main(String[] args)
//  {
//    int n=20;
//    isPrime(n);
//  }

// prime numbers check 
// static String m1(int n)
//   {
//      for(int i=2;i<=n-1;i++) // for(int j=2;j<=n/2;j++) // for(int j=2;j*j<=n;j++)
//      {
//        if(n%i==0)
//         return "NO"; 
//      }
//   return "yes";
// }
//   public static void main(String[] args) {
//     int n=Integer.parseInt(args[0]);
//     String result=m1(n);
//     System.out.println(result);
//   }

// prime numbers 
// static void m1(int [] arr)
//   {
//     int l=arr.length;
//     for(int i=0;i<=l-1;i++)
//     { int count=0;
//       for(int j=2;j<=arr[i]-1;j++) // for(int j=2;j<=arr[i]/2;j++) // for(int j=2;j*j<=arr[i];j++)  
//       {
//         if(arr[i]%j==0)
//         {count++;
//         break; }
//       }
//       if(count==0)
//       {
//         System.out.println(arr[i]);
//         Arrays.sort(arr);
//       }
//     }
// }
// public static void main(String[] args) {
//   int [] arr={10,2,1,4,3,7,5,8,9,12,15,18,25,61};
//   m1(arr);

// problem to find leaders
// static void m1(int [] n,int l)
//   { int j;
//     for(int i=0;i<=l-2;i++)
//     {
//        for(j=i+1;j<=l-1;j++)
//        {
//          if(n[i]<n[j])
//            break;    
//        }
//        if(j==l)
//          System.out.println(n[i]);
//    }
// System.out.println(n[l-1]); }
//  public static void main(String[] args) {
//    int [] n={16,17,4,3,5,2};
//    int l=n.length;
//    m1(n,l);

// exact solution for leaders problems
// static void m1(int [] n,int l,ArrayList a)
// { int maxx=n[l-1];
//   a.add(maxx);
//   for(int i=l-1;i>=0;i--)
//   { 
//     if(n[i]>maxx)
//     {
//       maxx=n[i];
//       a.add(maxx);
//     }
//   }
  
// }
// public static void main(String[] args) {
//   ArrayList a=new ArrayList();
//   int [] n={16,17,4,3,5,2};
//   int l=n.length;
//   m1(n, l,a);
//   Collections.reverse(a);
//   System.out.println(a);
}
    }
}