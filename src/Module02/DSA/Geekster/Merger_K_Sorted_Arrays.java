package Module02.DSA.Geekster;

import java.util.*;


class Element {
    int value;
    int arrayIndex;
    int indexInArray;

    public Element(int value, int arrayIndex, int indexInArray) {
        this.value = value;
        this.arrayIndex = arrayIndex;
        this.indexInArray = indexInArray;
    }
}
public class Merger_K_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        List<List<Integer>> arrays = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int size = scanner.nextInt();
            List<Integer> array = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                array.add(scanner.nextInt());
            }
            arrays.add(array);
        }
        List<Integer> mergedArray = mergeKSortedArrays(arrays);
        for (Integer ele : mergedArray){
            System.out.print(ele+" ");
        }
    }

    private static List<Integer> mergeKSortedArrays(List<List<Integer>> arrays) {
        List<Integer> result = new ArrayList<>();

        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.value));

        // Add the first element from each array to the min-heap
        for (int i = 0; i < arrays.size(); i++) {
            if (!arrays.get(i).isEmpty()) {
                minHeap.offer(new Element(arrays.get(i).get(0), i, 0));
            }
        }
        while (!minHeap.isEmpty()) {
            Element current = minHeap.poll();
            result.add(current.value);

            // Move to the next element in the same array
            if (current.indexInArray + 1 < arrays.get(current.arrayIndex).size()) {
                int newIndex = current.indexInArray + 1;
                int newValue = arrays.get(current.arrayIndex).get(newIndex);
                minHeap.offer(new Element(newValue, current.arrayIndex, newIndex));
            }
        }
        return result;
    }
}
