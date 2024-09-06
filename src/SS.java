public class SS {
    public static void main(String[] args) {
        String s="sudhir";
        System.err.println(s.length());
        for (int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String a= s.substring(i, j);                          
                System.out.println(a);
            }
           

        }
    }
    
}
