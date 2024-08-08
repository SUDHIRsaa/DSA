public class Singledimen {
    int array[]=null;
    

    public Singledimen(int size) {
        array = new int[size];
        System.out.println("Array created successfully {Size: "+array[1]+"}");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.MIN_VALUE;
            
        }
    }
    public void insert(int location,int value){
        try{
            if (array[location]==Integer.MIN_VALUE)
            {
                array[location]=value;
                System.out.println("Successfully inserted "+value+" at location "+location);
               
        }
        else{
            System.out.println("This cell is already occupied by another value");
        }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
       
}
    public void traversal(){
        try{
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]+" ");
            }
        }
        catch (Exception e){
            System.out.println("Array no longer exists");
        }

    }
    public void search(int value){
        for(int i=0;i<array.length;i++){
            
            if(array[i]==value){
                System.out.println("Value "+value+" found at location "+i);
                return;
            }
            
        }
        
            System.out.println("Value not found");
            
        
    }
    public void delete(int delete){
        try{
            array[delete] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted "+delete);
        }
        catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }
}
