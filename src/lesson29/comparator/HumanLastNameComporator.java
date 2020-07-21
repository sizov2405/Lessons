package lesson29.comparator;

import java.util.Comparator;

public class HumanLastNameComporator implements Comparator<Human> {

//    @Override
//    public int compare(Human o1, Human o2) {
//        return o1.getLastName().compareTo(o2.getLastName());
//    }

    @Override
    public int compare(Human o1, Human o2) {
        int lastNameComparationResult = o1.getLastName().compareTo(o2.getLastName());

        return lastNameComparationResult == 0
                ? 1
                : lastNameComparationResult;
    }
}
