package Module02.DSA.Geekster;

import java.util.*;

public class Sort_Characters_By_Frequency_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String sortedString = frequencySort(s);
        System.out.println(sortedString);
    }

    private static String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        List<Character> charList = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            charList.add(c);
        }
        Comparator<Character> customComparator = new Comparator<>() {
            @Override
            public int compare(Character a, Character b) {
                int freqA = frequencyMap.get(a);
                int freqB = frequencyMap.get(b);
                if (freqA == freqB) {
                    return a - b;
                }
                return freqB - freqA;
            }
        };
        Collections.sort(charList, customComparator);

        StringBuilder result = new StringBuilder(s.length());
        for (char c : charList) {
            result.append(c);
        }
        return result.toString();
    }
}
