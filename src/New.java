public class New {
    public static void  main(String[] args){
        calc(10);

    }
    public static void calc(int n){
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");      
            
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(j);      
            
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(i);      
            
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i=n;i>=1;i--){

            for (int j=1;j<=i;j++){
                System.out.print(i);      
            
            }
            System.out.println();
        }System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
}
