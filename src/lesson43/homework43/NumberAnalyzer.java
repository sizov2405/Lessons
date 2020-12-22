package lesson43.homework43;

public class NumberAnalyzer {

    public static Numbers returnNumbers(int[] numbers, int index) {
        if (index < 0 || index > numbers.length - 1) {
            Numbers result = new Numbers();
            return result;
        }

        if (index == 0) {
            Numbers result = new Numbers();
            result.setCurrent(numbers[index]);
            if(index + 1 < numbers.length) {
                result.setNext(numbers[index + 1]);
            }
            return result;

        } else if (index == numbers.length - 1) {
            Numbers result = new Numbers();
            if(index -1 >= 0) {
                result.setPrev(numbers[index - 1]);
            }
            result.setCurrent(numbers[index]);
            return result;

        } else {

            Numbers result = new Numbers();
            result.setCurrent(numbers[index]);
            result.setPrev(numbers[index - 1]);
            result.setNext(numbers[index + 1]);
            return result;
        }
    }

}
