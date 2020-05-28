package HomeWork5.Task1;

public class Timer {
    ITimerEvent timer;

    public Timer(ITimerEvent timer) {
        this.timer = timer;
    }

    public void timer() throws InterruptedException {
        while (true) {
            Thread.sleep(10 * 1000);
            timer.printMessage();
        }
    }
}
