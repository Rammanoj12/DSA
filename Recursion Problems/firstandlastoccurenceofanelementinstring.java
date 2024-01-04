public class firstandlastoccurenceofanelementinstring {
    static int first =-1;
    static int last =-1;
    static void solve(String s,char c,int index){
        if(index == s.length()){
            System.out.println(first);
            if(last == -1){
                System.out.println("null");
            }else{
                 System.out.println(last);
            }
            
            return;
        }
        char curr = s.charAt(index);
        if(curr ==  c){
            if(first == -1){
                first =index;
            }else{
               last=index;
            }

            
            
            
        }
        
        solve(s, curr, index+1);
    }
    public static void main(String[] args) {
        String s ="abaa";
        char c ='a';
        int index=0;
        solve(s,c,index);
    }
}
