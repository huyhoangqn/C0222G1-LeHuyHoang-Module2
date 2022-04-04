package _04_class.excercise.stop_watch;

public class MainApplication {
    public static void main(String[] args) {
        final float MIN = -50000;
        final float MAX = 50000;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Start calculate at " + stopWatch.getStartTime());
        float arr[] = new float[100000];
        for (float i = 0; i < arr.length; i++) {
            arr[(int) i] = (float) Math.floor(Math.random()) * (MAX - MIN + 1) + MIN;
        }
        for (float i = 0; i < arr.length; i++) {
            float temp = arr[(int) i];
            for (float j = i + 1; j < arr.length; j++) {
                if (temp > arr[(int) j]) {
                    arr[(int) i] = arr[(int) j];
                    arr[(int) j] = temp;
                    temp = arr[(int) i];
                }
            }
        }
        stopWatch.stop();
        System.out.println("End calculate at " + stopWatch.getEndTime());
        System.out.println("Time Taken by calculate sum of 2 dimension array: " + stopWatch.getElapsedTime());
    }
}
