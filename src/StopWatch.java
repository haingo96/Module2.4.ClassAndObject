import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        double[] arr = new double[100_000];
        for (int i = 0; i < 100_000; i++) {
            arr[i] = Math.random() * 100_000;
        }
        System.out.println(Arrays.toString(arr));

        stopWatch.start();
        Main.sortArr(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

        System.out.println(stopWatch.startTime.toString());
        System.out.println(stopWatch.endTime.getSecond());
    }
    LocalTime startTime = LocalTime.now();
    LocalTime endTime;

//    public void initialStartTime() {
//        startTime = LocalTime.now();
//    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public double getElapsedTime() {
//        return Duration.between(this.startTime, this.endTime).toSeconds() * 1000;
        double startMinute = Double.parseDouble(this.startTime.toString().substring(3, 5));
        double endMinute = Double.parseDouble(this.endTime.toString().substring(3, 5));

        double millisecondStartTime = Double.parseDouble(this.startTime.toString().substring(6)) * 1000;
        double millisecondEndTime = Double.parseDouble(this.endTime.toString().substring(6)) * 1000;

        if (startMinute == endMinute) {
            return millisecondEndTime - millisecondStartTime;
        } else {
            return 60_000 - millisecondStartTime + millisecondEndTime;
        }
    }
}
