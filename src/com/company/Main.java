package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        //задание 1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составляет " + sum + " рублей");
        //задание 2
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } if (max < arr[i])
                max = arr[i];

        System.out.println("Минимальная сумма трат за месяц состовляет "+min+" Максимальная сумма трат за месяц состовляет "+ max);
        // заданиу 3

            float avg = (float)sum/ arr.length;
            avg = sum / (arr.length * 1.0f);
            System.out.println("Средняя сумма трат за месяц составила " + avg +" рублей");
        }
        // задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1 ; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        return arr;
    }
}
