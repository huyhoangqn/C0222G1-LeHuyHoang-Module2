package _04_class.excercise.stop_watch;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }

}
