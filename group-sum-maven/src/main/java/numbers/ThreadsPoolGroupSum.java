package numbers;

import java.util.concurrent.FutureTask;

public class ThreadsPoolGroupSum extends ThreadsGroupSum{

    public ThreadsPoolGroupSum(int[][]groups) {
        super(groups);
    }
    @Override
   protected void startTasks(FutureTask<Long>[] tasks) {
       //TODO
       //write this method by using threads pool
    }


}
