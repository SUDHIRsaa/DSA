public class Main {
    public static void main(String[] args) {
    
        Singledimen s=new Singledimen(5);
        s.insert(0, 10);
        s.insert(1, 20);
        s.insert(2, 30);
        s.insert(3, 40);
        s.insert(4, 50);
        s.insert(5, 60);
        s.insert(10,22);
        s.insert(2, 33);
        System.out.println(s.array[10]);
        
    
    }
}
