package lesson29.homework29.homeworkComparator;

import java.util.Comparator;

public class SneakSizeComparator implements Comparator <SneakForComparator> {
    @Override
    public int compare(SneakForComparator sneak1, SneakForComparator sneak2) {
        int sizeComparationResult = sneak2.getSize().compareTo(sneak1.getSize());

        return sizeComparationResult == 0
                ? 1
                : sizeComparationResult;
    }
}
