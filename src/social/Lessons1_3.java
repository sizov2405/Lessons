package social;

public class Lessons1_3 {
    //        int x = 10;
//        int y = 2;
//        int z = 3;
////        x += 10;
//////        x = x + 10;¡
////        System.out.println(x);
////        x /= 2;
////        System.out.println(x);
//        int a = x++;
////        постфиксный инкремент
//        System.out.println("x=" + x + " and a=" + a);
//
//        int b = ++y;
////        префиксный инкремент
//        System.out.println("y=" + y + " and b=" + b);
//        /*Приоритет операций начинается с инкремента и декремента, затем идут операции как в математике:
//         ++, --, *, /, %, +, -. Скобки, так же как и в математике, увеличивают приоритет.Type a message*/
//    }
//}
//        int[] mas = {10, -3, 0, 4, -1, -2, 13, -2, 33, 36, 34, -5};
//        evenBubbleSort(mas);
//        bubbleSort(mas);
//        breakCycle(mas);
//        whileCycle(mas);
//        doWhileCycle(mas);
//        forPractice(mas);
//        ifFirstPractice();
//        ifTernaryPractice();
//        switchPractice();
//    }
//
//    public static void evenBubbleSort(int[] mas) {
//        int[] masCopy = Arrays.copyOf(mas, mas.length);
//        System.out.println("Вывести все четные числа. Результат предварительно отсортировать");
//        for (int i = masCopy.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (masCopy[j] > masCopy[j + 1]) {
//                    int temp = masCopy[j];
//                    masCopy[j] = masCopy[j + 1];
//                    masCopy[j + 1] = temp;
//                }
//            }
//        }
//        for (int a : masCopy) {
//            if (a % 2 == 0) {
//                System.out.println(a);
//            }
//        }
//    }
//
//    public static void bubbleSort(int mas[]) {
//        int[] masCopy = Arrays.copyOf(mas, mas.length);
//        System.out.println("Вывести все числа. Результат предварительно отсортировать в обратном порядке (максимальное значение вначале)");
//        for (int i = masCopy.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (masCopy[j] < masCopy[j + 1]) {
//                    int temp = masCopy[j];
//                    masCopy[j] = masCopy[j + 1];
//                    masCopy[j + 1] = temp;
//                }
//            }
//        }
//        for (int a : masCopy) {
//            System.out.println(a);
//        }
//    }
//
//    public static void breakCycle(int mas[]) {
//        int[] masCopy = Arrays.copyOf(mas, mas.length);
//        System.out.println("Вывести все числа из массива, пока не встретим число 13 с помощью оператора break");
//        for (int i = 0; i < masCopy.length; i++) {
//            if (masCopy[i] == 13) {
//                break;
//            }
//            System.out.println(masCopy[i]);
//        }
//    }
//
//    public static void whileCycle(int[] mas) {
//        int[] masCopy = Arrays.copyOf(mas, mas.length);
//        System.out.println("Вывести все числа из массива, пока не встретим число 13 с помощью while");
//        int i = 0;
//        while (masCopy[i] != 13) {
//            System.out.println(masCopy[i]);
//            i++;
//        }
//    }
//
//    public static void doWhileCycle(int[] mas) {
//        int[] masCopy = Arrays.copyOf(mas, mas.length);
//        System.out.println("Вывести все числа из массива, пока не встретим число 13 с помощью do...while");
//        int i = 0;
//        do {
//            System.out.println(masCopy[i]);
//            i++;
//        } while (masCopy[i] != 13);
//    }
//
//    public static void forPractice(int mas[]) {
//        int[] masCopy = Arrays.copyOf(mas, mas.length);
//        System.out.println("Вывести все числа из массива, пока не встретим число 13 с помощью for (foreach, тот который с двоеточием)");
//        for (int i : masCopy) {
//            if (i == 13){
//                break;
//            }
//            System.out.println(i);
//
////            if (i != 13) {
////                System.out.println(i);
////            } else {
////                break;
////            }
//        }
//    }
//
//    public static void ifFirstPractice() {
//        System.out.println("Взять два числа x=4 и y=5. Если x = y тогда сложить, иначе умножить друг на друга. " +
//                "(обычная условная конструкция)");
//        int x = 4;
//        int y = 5;
//        if (x!=y) {
//            System.out.println(x*y);
//        }
//        System.out.println(x+y);
//
////        if (x == y) {
////            System.out.println(x + y);
////        } else {
////            System.out.println(x * y);
////        }
//    }
//
//    public static void ifTernaryPractice() {
//        System.out.println("Взять два числа x=4 и y=5. Если x = y тогда сложить, иначе умножить друг на друга. " +
//                "(тернарная конструкция)");
//        int x = 4;
//        int y = 5;
//        System.out.println(x == y
//                ? x + y
//                : x * y);
//    }
//
//    public static void switchPractice() {
//        System.out.println("Написать метод в котором поезд будет выбирать себе путь в зависимости от введенной строки (String) " +
//                "с указанием куда ехать (вперед, влево, вправо). В качестве значения по-умолчанию считать остановку поезда. " +
//                "Вывести решение машиниста. Использовать switch");
//        String trainDestination = "forward";
//        switch (trainDestination) {
//            case "right":
//                System.out.println("To the right");
//                break;
//            case "left":
//                System.out.println("To the left");
//                break;
//            case "forward":
//                System.out.println("Straight");
//                break;
//            default:
//                System.out.println("Stop the train");
//        }
//    }
//}


//        int[] mas = {12, 34, 1, 3, -2, 4, 0, 0, 2};
//        int[] mas2 = {12, 34, 1, 3, 4, 0, 2};
////        allNegative(mas);
////        allPositive(mas);
////        allZeros(mas);
////        allNotNegative(mas);
////        allOdd(mas);
////        allMultipliedPositive(mas);
////        sumAll(mas);
////        sumAllPositive(mas);
////        everySecond(mas);
////
////        bubbleSort(mas2);
////        simpleCycle();
////        doWhileCycle();
////        whileCycle();
////        ifElseConditionPractice(mas);
////        elseIfConditionPractice(mas);
////        ternaryConditionPractice(5);
//        switchConditionPractice();
//    }
//
//    public static void allNegative(int[] mas) {
//        System.out.println("Вывести все отрицательные числа");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] < 0) {
//                System.out.println(mas[i]);
//            }
//        }
//    }
//
//    public static void allPositive(int[] mas) {
//        System.out.println("Вывести все положительные числа");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > 0) {
//                System.out.println(mas[i]);
//            }
//        }
//    }
//
//    public static void allZeros(int[] mas) {
//        System.out.println("Вывести все нули");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] == 0) {
//                System.out.println(mas[i]);
//            }
//        }
//    }
//
//    public static void allNotNegative(int[] mas) {
//        System.out.println("Вывести все не отрицательные числа");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] >= 0) {
//                System.out.println(mas[i]);
//            }
//        }
//    }
//
//    public static void allOdd(int[] mas) {
//        System.out.println("Вывести все нечетные числа");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] % 2 != 0) {
//                System.out.println(mas[i]);
//            }
//        }
//    }
//
//    public static void allMultipliedPositive(int[] mas) {
//        System.out.println("Вывести только удвоенные положительные числа");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > 0) {
//                System.out.println(mas[i] * 2);
//            }
//        }
//    }
//
//    public static void sumAll(int[] mas) {
//        System.out.println("Вывести сумму всех чисел");
//        int sum = 0;
//        for (int i = 0; i < mas.length; i++) {
//            sum = sum + mas[i];
//        }
//        System.out.println(sum);
//    }
//
//    public static void sumAllPositive(int[] mas) {
//        System.out.println("Вывести сумму только положительных чисел");
//        int sum = 0;
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > 0) {
//                sum = sum + mas[i];
//            }
//        }
//        System.out.println(sum);
//    }
//
//    public static void everySecond(int[] mas) {
//        System.out.println("Вывести каждое второе число");
//        for (int i = 0; i < mas.length; i += 2) {
//            System.out.println(mas[i]);
//        }
//    }
//
//    public static void bubbleSort(int[] mas) {
//        System.out.println("Отсортировать от наименьшего к большему и вывести на экран по очереди.");
//        for (int i = mas.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (mas[j] > mas[j + 1]) {
//                    int temp = mas[j];
//                    mas[j] = mas[j + 1];
//                    mas[j + 1] = temp;
//                }
//            }
//        }
//        for (int a : mas) {
//            System.out.println(a);
//        }
//    }
//
//    public static void simpleCycle() {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            if (i == 3) {
//                System.out.println("hello");
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//
//    public static void doWhileCycle() {
//        int time = 5;
//        do {
//            System.out.println("rest");
//            time--;
//        } while (time < 0);
//    }
//
//    public static void whileCycle() {
//        int time = 5;
//        while (time > 0) {
//            System.out.println("rest");
//            time--;
//        }
//    }
//
//    public static void ifElseConditionPractice(int mas[]) {
//        for (int number : mas) {
//            if (number < 5) {
//                System.out.println(number);
//            } else {
//                System.out.println("hello!");
//            }
//        }
//    }
//
//    public static void elseIfConditionPractice(int mas[]) {
//        for (int number : mas) {
//            if (number > 20) {
//                System.out.println("a");
//            } else if (number == 12) {
//                System.out.println("b");
//            } else {
//                System.out.println(number);
//            }
//        }
//    }
//
//    public static void ternaryConditionPractice(int number) {
//        String result = number > 4
//                ? a()
//                : "false";
//        System.out.println(result);
//    }
//
//    public static String a() {
//        return "true";
//    }
//
//    public static void switchConditionPractice() {
//        int catDecision = 4;
//        switch (catDecision) {
//            case 1:
//                System.out.println("Normal box");
//                break;
//            case 2:
//                System.out.println("Small box");
//                break;
//            case 3:
//                System.out.println("Large box");
//                break;
//            default:
//                System.out.println("feed me");
//        }
//    }
//}
//        int [] mas = {4,7,23,-76,-198, 45, 0, -36, 23};
//        for (int i=0; i<mas.length; i++){
//            if (mas[i] >10 || mas[i]<=0){
//                System.out.println(mas[i]);
//            }
//        }
//    }
//}
//        int [] mas = {7,34,76,0,-23, -24};
//        for (int i=0; i<mas.length; i++){
//            if (mas[i]%2 !=0 && mas[i]<0){
//                System.out.println(mas[i]);
//            }
//        }
//    }
//}
//       int [] mas = {1,10,34,1,6,1};
//       for (int i=0; i<mas.length; i++){
//           if (mas[i] >3) {
//               System.out.println(mas[i]);
//           }
//       }
//    }
//}
//        int result = 0;
//        int [] mas1 = {1,2,3};
//        int [] mas2 = {3,4,5};
//        for (int i=0; i<mas1.length; i++){
//            for (int j=mas2.length-1; j>-1; j--){
//                result = mas1[i] * mas2[j];
//                System.out.println(result);
//            }
//        }
//    }
//}
//        int result = 0;
//        int [] mas1 = {1,3};
//        int [] mas2 = {2,4};
//        for (int i=0; i< mas1.length; i++){
//            result = result + mas1[i] * mas2[i];
//        }
//        System.out.println(result);
//    }
//}
//        int sum = 0;
//        int [] mas = {1,2,3,4,5,6};
//        for (int i=0; i<mas.length; i++){
//            sum += mas[i];
//        }
//        System.out.println(sum / mas.length);
//
//    }
//}


//        int[] massiv = {1, 2, 3, 4, 5};
//        int[] result = new int[massiv.length];
//        int a = massiv.length -1;
//        for (int i=0; i<massiv.length; i++){
//            result[a] = massiv[i];
//            a = a-1;
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//    }
//}
//       int[] mas = {1, 2, 3, 4, 5, 6, 7, 8};
//       //int[] mas = {2,1,4,3,6,5,8,7}
//       for (int i = 0; i < mas.length; i+=2) {
//           int current = mas[i];
//           int next = mas[i +1];
//           mas[i] = next;
//           mas[i+1] = current;
//       }
//       for (int i=0; i<mas.length; i++){
//           System.out.print(mas[i]);
//       }
//    }
//}
//        int[] massiv = {0, 0, 0, 0, 0};
//        int a = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            massiv[i] = a;
//            a = a + 3;
//            System.out.println(massiv[i]);
//        }
//    }
//}
//        int[] sobaka = {8, -8, 5, -5, 10};
//        int polozitelnie = 0;
//        int otricatelnie = 0;
//        int chetnie = 0;
//        int neChetnie = 0;
//        for (int i = 0; i < sobaka.length; i++) {
//            if(sobaka[i]%2 ==0) {
//                chetnie = chetnie + sobaka[i];
//            }else{
//                neChetnie = neChetnie + sobaka[i];
//
////            if(sobaka[i]>0) {
////                polozitelnie = polozitelnie + sobaka[i];
////            }else{
////                otricatelnie = otricatelnie + sobaka[i];
//            }
////            System.out.println(sobaka[i]);
//        }
////        System.out.println("Summa polozitelnih = " + polozitelnie);
////        System.out.println("Summa otricatelnih = " + otricatelnie);
////        System.out.println("Summa chetnih = " + chetnie);
////        System.out.println("Summa neChetnih = " + neChetnie);
//    }
//
//        String zero = "0";
//        for (int i=0; i < 10; i++) {
//            System.out.println(zero);
//            zero = zero + "0";
//
//        }
//        zero = "a";
//        for (int i=0; i<10; i++) {
//            System.out.println(zero);
//            zero = zero + "$";
//        }
//
//        for(var i = 0; i < 10 ; i++) {
//            console.log(str);
//            str = str + 'a';
//        }
//
//    }
//       String source = "Red";
//
//        String strBlue = "Blue";
//        String strGreen = "Green";
//        String strRed = "Red";
//        String result = null;
//
//        if (source == strBlue || source == strGreen || source == strRed) {
//            result = "The color is " + source;
//        } else {
//            result = "Unsupported color";
//        }
//        System.out.println(result);
//
//    }
//        int number1 = 5;
//        int number2 = 10;
//        int result = 0;
//        String znac = ">";
//        boolean correct = false;
//        if (znac == "+") {
//            result = number1 + number2;
//            correct = true;
//        } else if (znac == "-") {
//            result = number1 - number2;
//            correct = true;
//
//        } else if (znac == "*") {
//            result = number1 * number2;
//            correct = true;
//
//        } else if (znac == "/") {
//            result = number1 / number2;
//            correct = true;
//
//        } else {
//            System.out.println("nope");
//        }
//        if (correct) {
//            System.out.println(result);
//        }
//
//    }



}
