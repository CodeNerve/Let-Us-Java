/**
 * cool timer
 */
public class Timer {

    public long now;

    public void start() {
        now = System.currentTimeMillis();
    }

    public long end() {
        return System.currentTimeMillis() - now;
    }
}
