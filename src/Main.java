import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListHelper = new ArrayList<>();
        for (int i = 0; i < intList.size() - 1; i++) {
            if (intList.get(i) >= 0 && intList.get(i) % 2 == 0) {
                intListHelper.add(intList.get(i));
            }
        }

        intList = intListHelper;

        for (int i = intList.size() - 1; i > 0; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (intList.get(i) < intList.get(j)) {
                    int m = intList.get(i);
                    intList.set(i, intList.get(j));
                    intList.set(j, m);
                }
            }
        }
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n------------");
        StreamMain streamMain = new StreamMain();
        streamMain.printIntList(intList);
    }
}