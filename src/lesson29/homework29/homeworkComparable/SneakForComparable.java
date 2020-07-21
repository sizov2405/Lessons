package lesson29.homework29.homeworkComparable;

import lesson29.homework29.SneakUtils;

public class SneakForComparable implements Comparable<SneakForComparable>{
    private String name;
    private String size;

    public SneakForComparable(String name, String size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public int compareTo(SneakForComparable sneak) {
        int thisSneakNameSize = SneakUtils.getSneakSNumberInName(this.name);
        int thatSneakNameSize = SneakUtils.getSneakSNumberInName(sneak.getName());
        if(thisSneakNameSize == 0){
            return 0;
        }
        int sneakNameComparision = thatSneakNameSize - thisSneakNameSize;

        if (sneakNameComparision != 0){
            return sneakNameComparision;
        }
        int sneakSizeComparision = sneak.getSize().compareTo(this.size);

//        if(sneakSizeComparision == 0){
//           return  1;
//        } else {
//            return sneakSizeComparision;
//        }

        return sneakSizeComparision == 0
                ? 1
                : sneakSizeComparision;
    }

    @Override
    public String toString() {
        return "Sneak{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
