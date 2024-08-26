import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int x : intList) {
            if (x > 0) {
                if (x % 2 == 0) {
                    newList.add(x);

                }
            }
        }
            Collections.sort(newList);
            for (int values : newList)

                System.out.println(values);

        }
    }



