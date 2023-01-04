public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = -1;
        int min = 200_000;
        for (int money : arr) {
            if (money > max) {
                max = money;
            }
            if (money < min) {
                min = money;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила "+min+" рублей. Макксимальная сумма трат за месяц составила "+max+" рублей");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float sum = 0f;
        float month = 30f;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        float mid = sum/month;
        System.out.println("Средняя сумма трат за месяц составила "+mid+" рублей");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length-1); i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}