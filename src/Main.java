public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double[] sortArr(double[] arr) {
        double temp;

        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        return arr;
    }
}