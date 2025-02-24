import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class QuickSortMain {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Rазмер на масива: ");
            int N = Integer.parseInt(reader.readLine());

            int[] array = new int[N];
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                 array[i] = random.nextInt(100);
            }

            System.out.println("Не сортиран масив: " + Arrays.toString(array));
            QuickSortMethods.quickSort(array, 0, array.length - 1);
            System.out.println("Сортиран масив: " + Arrays.toString(array));
        }
    }
