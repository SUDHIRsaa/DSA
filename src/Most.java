public class Most {
    public  static void main( String[] args ) {
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=i;j>=1;j--){
                
                if (j%2==0){
                    System.out.print(0);
    
                }
                else{
                    System.out.print(1);
                }
    
    
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
         
        for (int i=1;i<=n ;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=n-2*i+1;j++){
                System.out.print("*");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        
        }
        for (int i =0;i<=n;i++) {
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i+1;j++){
                System.out.print("*"+ " ");
            }
            System.out.println( );

        }   }
    
}
