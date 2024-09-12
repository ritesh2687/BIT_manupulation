

public class update_bit {
    public static void main(String[] args) {
       System.out.println( update(31, 3));
    }
    static int update(int n,int p)
    {
        return (n^(1<<p));
    }
}
