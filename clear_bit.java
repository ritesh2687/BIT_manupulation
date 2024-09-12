
public class clear_bit {
    public static void main(String[] args) {
        System.out.println(clear(15,2));
    }    
    static int clear(int n,int p)
    {
        return (n^(1<<p));
    }
}
