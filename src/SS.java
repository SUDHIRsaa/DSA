public class SS {
    public static void main(String[] args) {
        String s="Samiksha Sudhir Maurya";
        
        char ss[]=s.toCharArray();
        int number=0;
        for (char c : ss) {
            number++;
            // System.out.print(c);
            
            
            
        }
        char wow=' ';
        // System.out.println(ss.length);
        for(int i=ss.length-1;i>=0;i--){

          wow =ss[i];
          String wo =  " "+wow;
          System.out.print(wo);
          


        }
        


        

        // System.out.println(number);
        // System.err.println(s.length());
        // int count=0;
        // for (int i=0;i<number;i++){
        //     for(int j=i+1;j<=number;j++){
        //         String a= s.substring(i, j);
        //         count++;                          
        //         System.out.println(a);
        //     }
          

        // }
        // System.out.println(count);
    }
    
}
