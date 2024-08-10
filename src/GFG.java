

class GFG {
    public static void main(String[] args)
    {
        // String name = "Sachin";
        // name = name.concat(" Tendulkar");
        // System.out.println(name);
        // String name1 = "Sachin";
        // name1 = name1 + name;
        // System.out.println(name1);
        
        String name = "Sachin";
        int count = 0;
        char[] ch = name.toCharArray();
        for (char c:ch){
            System.out.println(c);
            count++;
        }
        System.out.println(count);
        
   


    }
}

