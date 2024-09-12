
//int this program we check bit at index positon
public class get_bit {
    public static void main(String[] args) {
        System.out.println("1 for == true \n0 for == false");
        System.out.println(getbit(5,2));

        
    }
    static boolean getbit(int n,int i)
    {
        return ((n & (1<<i))!= 0);
    }
}
