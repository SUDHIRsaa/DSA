public class Questions {
    public static void main(String[] args) {
//         char d ;

//         // for (d = 'a'; d <= 'z'; d++) {
//         //     System.out.print(d + " ");
//         // }
//         char ch1 = 'S';  
//         char ch2 = 'U';
//         char ch3 = 'M';
//         char ch4 = 'A';  
//         int asciivalue1 = ch1;  
//         int asciivalue2 = ch2;  
//         int asciivalue3 = ch3;
//         int asciivalue4 = ch4;
//         System.out.println("ASCII values of all characters are: "+ asciivalue1 + " " + asciivalue2 + " " + asciivalue3 + " " + asciivalue4);
//         for(int i = 0; i <= 255; i++)  
// {  
// System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
// }  

        Lenth("SUDHIR");
    }
    public static void Lenth(String s){
        int count = 0;
        try {
            for (int i = 0; i < 100; i++) { // Loop with a fixed upper limit
                s.charAt(i);  // Access character at index i
                count++;
                System.out.println(count); // Print the count
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Stop when the end of the string is reached
            System.out.println("End of string reached. Total characters: " + count);
        }
       
       
    }
    
}
