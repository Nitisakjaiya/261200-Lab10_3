public class TextFileHandler extends Handler {
    @Override
    public void process(File file) {
        if (file.getExtension().equalsIgnoreCase("txt")) {
            System.out.println("Processing text file: " + file.getFileName());
        } else if (nextHandler != null) {
            nextHandler.process(file);
        } else {
            System.out.println("File type not supported: " + file.getFileName());
        }
    }
}