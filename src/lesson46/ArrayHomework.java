package lesson46;

public class ArrayHomework {

    public String centerArray (String[] array){
        int centerElementIndex = (array.length-1) / 2;
        if(centerElementIndex % 2 == 0){
            return array [centerElementIndex];
        }
            String element = array [centerElementIndex];
            String nextElement = array [centerElementIndex +1];
            int compareResults = element.compareTo(nextElement);
            if(compareResults > 0){
                return nextElement;
            }
                return element;
    }

    public String[] centerArrayChange (String[] array, String elementToChange){
        int centerElementIndex = (array.length-1) / 2;
        if(centerElementIndex % 2 == 0){
            array [centerElementIndex] = elementToChange;
            return array;
        }
            String element = array [centerElementIndex];
            String nextElement = array [centerElementIndex +1];
            int compareResults = element.compareTo(nextElement);
            if(compareResults > 0){
                array [centerElementIndex +1] = elementToChange;
                return array;
            }
                array [centerElementIndex] = elementToChange;
                return array;
    }

    public String[] changeElementsByPlaces(String[] array, String elementToChange) {
        int centerElementIndex = (array.length - 1) / 2;

        if (centerElementIndex % 2 == 0) {
            array[centerElementIndex] = elementToChange;
        } else {
            String element = array[centerElementIndex];
            String nextElement = array[centerElementIndex + 1];
            int compareResults = element.compareTo(nextElement);

            if (compareResults > 0) {
                array[centerElementIndex + 1] = elementToChange;
            } else {
                array[centerElementIndex] = elementToChange;
            }
        }

        int j = array.length - 1;
        for (int i = 0; i < array.length/2; i++, j--) {
            String temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }

        return array;
    }


}
