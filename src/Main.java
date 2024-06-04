public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int sumArray = 0;
        int[] array = new int[]{2, 4, 3, 6, 8};
        for (int index = 0; index < array.length; index++) {
            sumArray += array[index];
        }
        System.out.println("Сумма трат за месяц составила " + sumArray + " рублей");

        System.out.println("Задание 2");
        int[] wasteWeek = new int[]{5, 1, 8, 3, 6};
        int counterMax = wasteWeek[0];
        int counterMin = wasteWeek[0];
        for (int index = 0; index < wasteWeek.length; index++) {
            if (counterMax < wasteWeek[index]) {
                counterMax = wasteWeek[index];
            }
        }

        for (int index = 0; index < wasteWeek.length; index++) {
            if (counterMin > wasteWeek[index]) {
                counterMax = wasteWeek[index];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + counterMin + " рублей. Максимальная сумма трат за неделю составила " + counterMax + " рублей");

        System.out.println("Задание 3");
        int[] wasteWeek3 = new int[]{6, 2, 3, 8, 5};
        int sumElements = 0;
        for (int index = 0; index < wasteWeek3.length; index++) {
            sumElements += wasteWeek3[index];
        }
        double srZnach = sumElements / wasteWeek3.length;
        System.out.println("Средняя сумма трат за месяц составила " + srZnach + " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index= reverseFullName.length-1;index>-1;index--){
            System.out.print(reverseFullName[index]);
        }

    }
}