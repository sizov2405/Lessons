package lesson29.comparator;

import java.util.Comparator;

public class HumanComporator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        int lastNameComparationResult = o1.getLastName().compareTo(o2.getLastName());

        if (lastNameComparationResult != 0){
            return lastNameComparationResult;
        }
        int nameComparationResult = o1.getName().compareTo(o2.getName());

        return nameComparationResult == 0
                ? o1.getAge() - o2.getAge()
                : nameComparationResult;
    }
}
