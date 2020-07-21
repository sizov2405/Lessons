package lesson29.homework29.homeworkComparator;

import lesson29.homework29.SneakUtils;

import java.util.Comparator;

public class SneakNameComparator implements Comparator<SneakForComparator> {

    @Override
    public int compare(SneakForComparator sneak1, SneakForComparator sneak2) {
        int thisSneakNameSize = SneakUtils.getSneakSNumberInName(sneak1.getName());
        int thatSneakNameSize = SneakUtils.getSneakSNumberInName(sneak2.getName());
        if(thisSneakNameSize == 0){
            return 0;
        }
        int sneakNameComparision = thatSneakNameSize - thisSneakNameSize;

        return sneakNameComparision == 0
                ? 1
                : sneakNameComparision;
    }
}
