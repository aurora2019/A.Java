package com.aurora.learning.future;

import java.util.concurrent.CompletableFuture;

public class FutureExample {

    public static void test() {

        // 模拟耗时任务
        CompletableFuture<String> futureTask = simulateLongRunningTask();

        // 处理未来任务的结果
        handleFutureResult(futureTask);
        System.out.println(234);
    }

    public static CompletableFuture<String> simulateLongRunningTask() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // 模拟耗时操作，例如网络请求或复杂计算
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "未来的结果";
        });
    }

    public static void handleFutureResult(CompletableFuture<String> futureTask) {
        futureTask.thenAccept(result -> {
            System.out.println("任务完成，结果: " + result);
        }).exceptionally(throwable -> {
            System.out.println("任务出错: " + throwable.getMessage());
            return null;
        });
    }
}
