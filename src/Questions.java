public class Questions {
    public static void main(String[] args) {
        char d ;

        // for (d = 'a'; d <= 'z'; d++) {
        //     System.out.print(d + " ");
        // }
        char ch1 = 'S';  
        char ch2 = 'U';
        char ch3 = 'M';
        char ch4 = 'A';  
        int asciivalue1 = ch1;  
        int asciivalue2 = ch2;  
        int asciivalue3 = ch3;
        int asciivalue4 = ch4;
        System.out.println("ASCII values of all characters are: "+ asciivalue1 + " " + asciivalue2 + " " + asciivalue3 + " " + asciivalue4);
        for(int i = 0; i <= 255; i++)  
{  
System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
}  


    }
    
}
