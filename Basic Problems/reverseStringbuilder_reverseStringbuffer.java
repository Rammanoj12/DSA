public class reverseStringbuilder_reverseStringbuffer {
    
    public static void main(String[] args) {
        String str = "RAM"+" ";
        //StringBuffer sb = new StringBuffer(str);
        //sb.reverse();
        //System.out.println(sb);
        StringBuffer sb = new StringBuffer(str);
        sb.append("MANOJ");
        sb.reverse();
        

        String result = String.valueOf(sb);
        System.out.println(result);
    }
}
