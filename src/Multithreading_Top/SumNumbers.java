package Multithreading_Top;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = value / 10 ;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i+1);
            PartialSum task = new PartialSum(from,to);
            Future<Long>futurePartSum = executorService.submit(task);
            futureResults.add(futurePartSum);
        }
        for (Future<Long> longFuture : futureResults) {
            sum += longFuture.get();
        }
        executorService.shutdown();
        System.out.println(sum);
    }
}


class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
