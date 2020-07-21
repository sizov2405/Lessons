public class Notes {

    /**
     * разделение положительных и отрицательных элементов массива без лишних нулей
     */
    public static void pozitiveNegativeWithout0() {
        int[] mas = {8, -3, 56, -100, 1, -1, -98}; // обьявление массива
        int polozitelnie = 0; //обьвление переменной типа int  со значением 0
        int otricatelnie = 0;
        for (int i = 0; i < mas.length; i++) {
            int entry = mas[i];
            if (entry >= 0) {
                polozitelnie++;// увеличить переменную массива на один (операция инкремент)
                // то же самое что и  polozitelnie = polozitelnie + 1;
            } else {
                otricatelnie++;
            }
        }
        int[] plus = new int[polozitelnie]; // обьявление массива чисел типа int длинны polozitelnie с значениями 0
        int[] minus = new int[otricatelnie];
        int plusCounter = 0;
        int minusCounter = 0; //переменная - счетчик
        for (int i = 0 ; i < mas.length; i++) { //цикл для обхода всех элементов массива
            int entry = mas[i]; // получение элемента массива в цикле
            if (entry >= 0) {
                plus[plusCounter] = entry; // присвоение значения элементу массива
                plusCounter++; // увеличить переменную на 1
            } else {
                minus[minusCounter] = entry;
                minusCounter++;
            }
        }
        //распечатка всех элементов массива в консоль
        for (int i = 0; i < plus.length; i++) {
            System.out.println(plus[i]); //напечатать элемент массива
        }
        System.out.println("************");
        for (int i = 0; i < minus.length; i++) {
            System.out.println(minus[i]);
        }
    }
}
