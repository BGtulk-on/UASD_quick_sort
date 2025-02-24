import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Rазмер на масива: ");
            int N = Integer.parseInt(reader.readLine());

            int[] array = new int[N];

            System.out.println("Въведете " + N + " числа :");
            for (int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println("Не сортиран масив: " + Arrays.toString(array));
            QuickSortMethods.quickSort(array, 0, array.length - 1);
            System.out.println("Сортиран масив: " + Arrays.toString(array));
        }
    }
