package exercise;

/**
 * Created by Yun on 2017/10/31.
 */

public class ProgramTimer {

    public interface Runner {
        void run();
    }

    private static class Point {
        String tag;
        long millis;

        Point(String tag, long millis) {
            this.tag = tag;
            this.millis = millis;
        }
    }

    private static Point mCurrentPoint;

    public static void timing(String tag, Runner runner) {
        System.out.println(tag + " timing start!");
        long start = System.currentTimeMillis();
        runner.run();
        System.out.println(tag + " timing end!");
        System.out.println(tag + " take about " + (System.currentTimeMillis() - start) + "millions");
    }

    public static void markStartPoint(String tag) {
        mCurrentPoint = new Point(tag, System.currentTimeMillis());
    }

    public static void markEndPoint(String tag) {
        if (mCurrentPoint != null) {
            System.out.println(mCurrentPoint.tag + " ----> " + tag + ": " + (System.currentTimeMillis() - mCurrentPoint.millis));
            mCurrentPoint = null;
        }
    }
}
