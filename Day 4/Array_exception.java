public class Array_exception {
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6, 7};
        try {
            for (int i = 0; i <= 6; i++) {
                System.out.println(a[i]);
            }

        }
        catch(Exception e)
        {
            System.out.println("Exception :"+e.getMessage());
        }
    }
}