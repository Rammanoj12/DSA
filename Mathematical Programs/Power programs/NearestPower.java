// Given two integers N and M  you have to find out an integer which is a power of M and is nearest to N.
// Note: If there are multiple answers possible to, print the greatest number possible.

 

// Example 1:

// Input:
// N = 6, M = 3
// Output:
// 9
// Explanation:
// Both 3 (31) and 9 (32) are equally
// near to 6. But 9 is greater,
// so the Output is 9.
public class NearestPower {
    static long nearestPower(long  N , long M) {
        if(N ==0){
            return 0;
        }
        long temp = 0;
        for(int i =1;i<N;i++){
            temp = M * i;
            if(temp>N){
                break;
            }
        }
        return temp;
}
    public static void main(String[] args) {
        long N=6;
        long M =3;
      System.out.println(nearestPower(N, M));
    }
}
