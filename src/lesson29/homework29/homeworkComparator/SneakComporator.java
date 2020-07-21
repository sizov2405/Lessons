package lesson29.homework29.homeworkComparator;

import lesson29.homework29.SneakUtils;

import java.util.Comparator;

public class SneakComporator implements Comparator <SneakForComparator> {

    @Override
    public int compare(SneakForComparator sneak1, SneakForComparator sneak2) {
        int thisSneakNameSize = SneakUtils.getSneakSNumberInName(sneak1.getName());
        int thatSneakNameSize = SneakUtils.getSneakSNumberInName(sneak2.getName());
        if(thisSneakNameSize == 0){
            return 0;
        }
        int sneakNameComparision = thatSneakNameSize - thisSneakNameSize;

        if (sneakNameComparision != 0){
            return sneakNameComparision;
        }
        int sizeComparationResult = sneak2.getSize().compareTo(sneak1.getSize());

        return sizeComparationResult == 0
                ? 1
                : sizeComparationResult;
    }


}
