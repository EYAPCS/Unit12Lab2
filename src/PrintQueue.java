import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by emma on 7/11/17.
 */

/**
 * Asks the user to add print jobs, then displays the print jobs when the user is finished
 * adding prints.
 */

public class PrintQueue {

    private LinkedList<Job> queue;
    private Scanner input;

    public PrintQueue() {

        queue = new LinkedList<Job>();
        input = new Scanner(System.in);


    }

    public void start() {

        boolean running = true;
        int jobNum = 1;

        while(running) {

            System.out.print("1 to add job to queue, 0 to quit: ");
            int decision = input.nextInt();

            switch (decision) {
                case 1:
                    queue.add(new Job(jobNum));
                    jobNum++;
                    break;
                case 0:
                    running = false;
                    for(Job job : queue) {
                        System.out.println("Job " + job.getJobNumber() + " : " + job.getPrintTime() + " seconds");
                    }
            }

        }

    }

}
