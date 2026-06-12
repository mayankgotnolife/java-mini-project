# Java Multi-threaded File Download Manager

A robust, multi-threaded Java application for concurrently downloading files from the internet. It uses Java's `ExecutorService` to manage download tasks efficiently.

## Features
- **Multi-threaded Downloads:** Downloads multiple files at the same time using a thread pool.
- **URL Validation:** Verifies the accessibility and correctness of URLs using HTTP `HEAD` requests before attempting a full download.
- **Auto Directory Creation:** Automatically verifies and creates the destination folder if it doesn't exist.
- **Spoofed User-Agent:** Prevents basic server blocking by including standard browser `User-Agent` headers.

## Limitation Note
This manager is designed to pull files via **Direct Download Links**. If you provide a link to a proprietary viewer or a standard webpage (like a Scribd document page or a YouTube video), the program will download the HTML source code of the web page, not the media/document itself. Ensure your URL ends in a true file extension (e.g., `.pdf`, `.zip`, `.png`).

## How to Configure
1. Open `src/Main.java`.
2. Locate the `downloadUrls` array in the `main` method.
3. Replace the placeholder URLs with the actual direct links to the files you want to download.
4. Modify the `destination` variable and the `fileName` extension dynamically if necessary. By default, files are saved to your system's `Downloads` folder.

## How to Run

### Using an IDE (IntelliJ / Eclipse / VS Code / Cursor)
Simply open the project, navigate to `src/Main.java`, and click the "Run" button.

### Using the Command Line
Navigate to the root directory of this project (`File Download Manager System`) and compile/run the application:

```bash
# Compile the Java classes
javac -d bin src/Main.java src/com/downloader/*.java

# Run the compiled Main class
java -cp bin Main
```

## Folder Structure
- `src/` - Contains the raw java files (`Main.java`, `DownloadManager.java`, `DownloadTask.java`, `DownloadUtils.java`)
- `bin/` - Contains the compiled `.class` bytecode files
