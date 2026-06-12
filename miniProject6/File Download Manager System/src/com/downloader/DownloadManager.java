package com.downloader;

import java.util.concurrent.*;
import java.util.*;

public class DownloadManager {

    private ExecutorService executorService;

    public DownloadManager(int numThreads) {
        executorService = Executors.newFixedThreadPool(numThreads);
    }

    public Future<String> downloadAsync(String fileUrl, String destination) {
        return executorService.submit(new DownloadTask(fileUrl, destination));
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

