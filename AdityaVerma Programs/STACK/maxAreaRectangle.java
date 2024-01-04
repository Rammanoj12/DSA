// class rectangle{
//     int length;
//     int breadth;
//     rectangle(int length,int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public int area(){
//         return (this.length * this.breadth);
//     }
// }
// public class maxAreaRectangle {
//     static void solve(int N ,rectangle rect[]){
//         int mx =Integer.MIN_VALUE;
//         int area=0;
//            for(int i =0;i<N;i++){
//             area = rect[i].area();
//             if(area>mx){
//                 mx= area;
//             }
//            }
//            System.out.println(mx);
          
//     }

//     public static void main(String[] args) {
    
//         rectangle[] rect = {
//             new rectangle(1, 2),
//             new rectangle(3, 4),
//             new rectangle(5, 6)
//         };
//         int N = rect.length;
//        solve(N,rect);
//     }
// }
/////////////////////////////////////////////////////////

// public class maxAreaRectangle {
//     static void solve(int N ,int[][] rect){
//         int mx =Integer.MIN_VALUE;
//         int area=0;
//             for(int i =0;i<N;i++){
//                 for(int j =0 ;j<i-1;j++){
//                     area = rect[i][j] * rect[i][j+1];
//                     if(area>mx){
//                         mx = area;
//                     }
//                 }
//             }
//             System.out.println(mx);
//     }

//     public static void main(String[] args) {
    
//         int rect[][] = {{1,2},{3,4},{5,6}};
//         int N = rect.length;
//        solve(N,rect);
//     }
// }
