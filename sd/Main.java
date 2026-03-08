public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler textHandler = new TextFileHandler();
        Handler docHandler = new DocFileHandler();
        Handler imageHandler = new ImageFileHandler();

        // Set up the chain: Text -> Doc -> Image
        textHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(imageHandler);

        // Test files
        File[] files = {
            new File("document.txt"),
            new File("report.doc"),
            new File("photo.jpg"),
            new File("video.mp4")
        };

        // Process each file
        for (File file : files) {
            textHandler.process(file);
        }
    }
}