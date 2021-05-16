import java.util.Arrays;

public class ArrayEvenNumbersAverageApp {
    private static final double ZER0 = 0.;

    public static void main(String[] args) {
        int[] array = new int[25];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10000)) / 100;
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        System.out.println("Среднее арифметическое четных чисел массива равно: " + getArrayEvenNumbersAverage(array));

        printArrayEvenNumbersAverageExpression(array);

        ArrayEvenNumbersAverageAppTest.printTestResult();
    }

    private static void printArrayEvenNumbersAverageExpression(int[] array) {
        StringBuilder evenNumbersSumExpression = new StringBuilder();
        int evenNumbersCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSumExpression.append(e).append(" + ");
                evenNumbersCount++;
            }
        }

        evenNumbersSumExpression.setLength(evenNumbersSumExpression.length() - 3);
        evenNumbersSumExpression.insert(0, "(").append(") / ").append(evenNumbersCount).append(" = ").append(getArrayEvenNumbersAverage(array));
        System.out.println(evenNumbersSumExpression);
    }

    protected static double getArrayEvenNumbersAverage(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersCount++;
            }
        }

        return (evenNumbersCount == 0) ? ZER0 : (double) evenNumbersSum / evenNumbersCount;
    }
}