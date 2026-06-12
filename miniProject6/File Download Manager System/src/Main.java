//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.downloader.DownloadManager;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        System.out.println("File Download Manager System");
        System.out.println("============================\n");

        DownloadManager manager = new DownloadManager(3);

        // Example download URLs (replace with actual URLs)
        String[] downloadUrls = {
            "https://www.scribd.com/document/774411965/The-Psychology-of-Money"
        };

        String destination = System.getProperty("user.home") + "/Downloads/";

        try {
            // Submit download tasks
            Future<String>[] futures = new Future[downloadUrls.length];
            for (int i = 0; i < downloadUrls.length; i++) {
                String url = downloadUrls[i];
                // Saving as an HTML file because Scribd direct links return the web page, not the PDF
                String fileName = destination + "The_Psychology_of_Money_" + (i + 1) + ".html";
                futures[i] = manager.downloadAsync(url, fileName);
                System.out.println("Submitted: " + url);
            }

            // Wait for all downloads to complete
            System.out.println("\nWaiting for downloads to complete...\n");
            for (int i = 0; i < futures.length; i++) {
                try {
                    String result = futures[i].get();
                    System.out.println("Result " + (i + 1) + ": " + result);
                } catch (Exception e) {
                    System.out.println("Error " + (i + 1) + ": " + e.getMessage());
                }
            }

        } finally {
            manager.shutdown();
            System.out.println("\nDownload Manager shut down successfully.");
        }
    }
}
