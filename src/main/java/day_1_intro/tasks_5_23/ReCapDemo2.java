package day_1_intro.tasks_5_23;

public class ReCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1, 2,6.3, 3, 4, 5, 6};

        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total:" + total);
        System.out.println("Max:" + max);
    }
}
