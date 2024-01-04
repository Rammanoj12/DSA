public class tripletsSum {
    static int[] isTriplet(int[] arr,int x) {
        int l = arr.length;
        int[] idx = new int[4];
        for (int i = 0; i <l-2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (arr[i] + arr[j] + arr[k] ==x ) {
                        idx[0]=i;
                        idx[1]=j;
                        idx[2]=k;
                        return idx;
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,2,1,220};
        int x=13;
        int[] result= isTriplet(arr,x);
        if(result!=null){
            System.out.println(result[0]+" "+result[1]+" "+result[2]);
        }else{
            System.out.println("No triplets");
        }
    }
}

// ///  another method with two pointers to sum equals to x
//     Arrays.sort(A);

//         for (int i = 0; i < n - 2; i++) {
//             int left = i + 1;
//             int right = n - 1;
            

//             while (left < right) {
//                 int sum = A[i]+A[left] + A[right];
//                 if (sum == X) {
//                     return true;
//                 } else if (sum < X) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }

//         return false;
       
    
//     }
// }


// ///  another method with two pointers to sum equals to 0
//     Arrays.sort(A);

//         for (int i = 0; i < n - 2; i++) {
//             int left = i + 1;
//             int right = n - 1;
//              int mainNumber= -A[i]
            

//             while (left < right) {
//                 int sum = A[left] + A[right];
//                 if (sum == mainNumber) {
//                     return true;
//                 } else if (sum < mainNumber) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }

//         return false;
       
    
//     }
// }


