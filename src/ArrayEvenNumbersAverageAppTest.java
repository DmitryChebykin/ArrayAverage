import java.util.ArrayList;

public class ArrayEvenNumbersAverageAppTest {
    public static void printTestResult() {
        ArrayList<TestData> checkingList = getCheckedEvenNumbersAverageResultsList();
        int i = 1;

        for (TestData e : checkingList) {
            if (ArrayEvenNumbersAverageApp.getArrayEvenNumbersAverage(e.array) == e.average) {
                System.out.println("Тест " + i + " пройден.");
            } else {
                System.out.println("Тест " + i + " не пройден.");
            }

            i++;
        }
    }

    private static ArrayList<TestData> getCheckedEvenNumbersAverageResultsList() {
        return new ArrayList<TestData>() {{
            add(new TestData(2., new int[]{2, 2, 2, 2}));
            add(new TestData(0., new int[]{1, 1, 1}));
            add(new TestData(0., new int[]{0, 0, 0}));
            add(new TestData(40.0, new int[]{20, 40, 60}));
            add(new TestData(616.0, new int[]{-2, -4, 114, 2356}));
            add(new TestData(616.0, new int[]{-2, -4, 114, 2356, 1, 1, 3}));
            add(new TestData(50.0, new int[]{85, 92, 39, 72, 4, 32, 75}));
        }};
    }

    static class TestData {
        Double average;
        int[] array;

        public TestData(Double average, int[] array) {
            this.average = average;
            this.array = array;
        }
    }
}