/**
 * Created by emma on 7/11/17.
 */

import java.util.Random;

public class Job {

    private static Random rngenerator = new Random(12);
    private int jobNumber;
    private int printTime;

    public Job(int number) {
        setJobNumber(number);
        setRandomTime();
    }

    public void setRandomTime() {
        int time = rngenerator.nextInt(1000) + 10;
        setPrintTime(time);
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public int getPrintTime() {
        return printTime;
    }

    public void setPrintTime(int printTime) {
        this.printTime = printTime;
    }
}
