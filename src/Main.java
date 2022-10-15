public class Main {

    public static void main(String[] args) {

        //Задача 1
        int totalOfAllPayments = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            totalOfAllPayments += value;
            System.out.println("Сумма трат за месяц составила " + totalOfAllPayments + " рублей.");
        }

        //Задача 2
        int min = arr[0];
        int max = arr[0];
        for (int element : arr){
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная затрата за день " + min + ", а максимальная " + max);

        //Задача 3
        for (int b = 0; b < arr.length; b++) {
            b = totalOfAllPayments / arr.length;
            System.out.println(b);
        }

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length; c > 0; c--){
            System.out.print(reverseFullName[c - 1]);
        }
    }
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}