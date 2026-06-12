package com.downloader;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {
    private String fileUrl;
    private String destination;

    public DownloadTask(String fileUrl, String destination) {
        this.fileUrl = fileUrl;
        this.destination = destination;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Starting download from: " + fileUrl);
        try {
            if (!DownloadUtils.isValidUrl(fileUrl)) {
                return "Failed: Invalid URL for " + fileUrl;
            }
            
            // Extract the directory path from the destination
            java.io.File destFile = new java.io.File(destination);
            String dirPath = destFile.getParent();
            if (dirPath != null) {
                DownloadUtils.verifyDirectory(dirPath);
            }

            DownloadUtils.downloadFile(fileUrl, destination);
            System.out.println("Download completed for: " + fileUrl);
            return "Download successful for " + fileUrl;
        } catch (Exception e) {
            return "Download failed for " + fileUrl + ": " + e.getMessage();
        }
    }
}