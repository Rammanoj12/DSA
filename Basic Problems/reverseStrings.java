public class reverseStrings {

  
}


  ////// --manoj --- amonj
    /*static char[] strings(String str){
        int l = str.length();

        //convert from string to char array
        /*char[] arr = new char[l];
        for(int j =0;j<l;j++){
            arr[j] = str.charAt(j);
        }

        //mthod 2-- convert from string to char array
        char[] arr= str.toCharArray();
        
        for(int i=0;i<=arr.length-2;i+=2){
            char z =  arr[i];
            arr[i] = arr[i+1];
            arr[i+1]= z;
           
        }
        return arr;
      
    }
    public static void main(String[] args) {
        String str ="manoj";
        char[] result=strings(str);
        for(int i=0;i<=result.length-1;i++){
            System.out.print(result[i]);
        }
        
    }*/
//////////

    /*recursion method-- JONAM
    static void strings(StringBuffer sb,int idx){
        if(idx==0){
            sb.toString();
            System.out.print(sb.charAt(idx));
            return;
        }
        System.out.print(sb.charAt(idx));
        strings(sb,idx-1);
        
}
    
    public static void main(String[] args) {
        String str= "MANOJ";
        StringBuffer sb = new StringBuffer(str);
        int idx=sb.length()-1;
        
        strings(sb,idx);
        
       
}*/

///////////////////////////////////////////

        //StringBuffer/StringBuilder
        /*OUPUT -- JONAM

            int first = i;
            int second = sb.length()-(i+1);
            char front  = sb.charAt(first);
            char last  = sb.charAt(second);

            sb.setCharAt(first, last);
            sb.setCharAt(second, front);
            //JONAM
            }
            System.out.println(sb);*/