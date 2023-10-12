import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeStringArray {

    public static void main(String[] args) {

        String[] testArray1 = {"coffee", "tea", "water"};
        String[] testArray2 = {"lemonade", "tea", "water"};
        System.out.println(String.join(", ", MergeStringArray.mergeUniqueValues(testArray1, testArray2))); // should print Ava, Emma, Olivia, Sophia

//        mergeUniqueValues(testArray1, testArray2);
    }

    public static String[] mergeUniqueValues(String[] arr1, String[] arr2) {
        Set noDuplicateSet = new HashSet();
        noDuplicateSet.addAll(Arrays.asList(arr1));
        noDuplicateSet.addAll(Arrays.asList(arr2));

        String[] noDuplicateArray = new String[noDuplicateSet.size()];
        noDuplicateSet.toArray(noDuplicateArray);

        Arrays.sort(noDuplicateArray);

        return noDuplicateArray;
    }

}
