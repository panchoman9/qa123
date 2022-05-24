import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arr[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        {
            System.out.println(sum);
        }

        int arr1[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};


        {
            //   System.out.println(b);

        }

        int arr2[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        {
            System.out.println(Arrays.stream(arr2).min());
        }

        int arr3[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        {
            System.out.println(Arrays.stream(arr3).average());
        }

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum1 = 0;


        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                sum1 += array[i][j];


        System.out.println(sum1);

        int[][] array22 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        int z = 11;

{
         //   System.out.println(x)

        }

    }
}