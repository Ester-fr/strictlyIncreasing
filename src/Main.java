import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > current.get(current.size() - 1)) {
                    current.add(arr[j]);
                } else {
                    break;
                }
            }

            if (current.size() > 1) {
                result.add(current);
            }
        }

        for (List<Integer> seq : result) {
            System.out.println(seq);
        }
    }
}
