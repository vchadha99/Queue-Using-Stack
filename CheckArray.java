import java.util.Arrays;

public class CheckArray
{
    int CountArray(int arr[] , int k)
    {
        int base = arr.length +1 - k;
        if(k > arr.length || k <= 0)
        {
            return 0;
        }
        else
        {
            int res = (base *(base + 1))/2;
            return res;
        }  
    }
    public static void main(String args[])
    {
        int arr [] = new int[]{10,20,45,43,45,65,75,74};
        CheckArray obj = new CheckArray();
        System.out.println(obj.CountArray(arr, 5));
        System.out.println(obj.CountArray(arr, 0));
        System.out.println(obj.CountArray(arr, 15));
        System.out.println(obj.CountArray(arr, 1));
    }
}