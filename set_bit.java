//in this,we set bit at index position like
// 5=101 we change bit at 1 index so ,
//now 101==>111  ||5==>7 
public class set_bit {
    public static void main(String[] args) {
        System.out.println(setbit(5,1));
    }
    static int  setbit(int n,int p)
    {
        return (n |(1<<p));
    }
}
