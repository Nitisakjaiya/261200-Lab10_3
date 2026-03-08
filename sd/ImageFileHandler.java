public class ImageFileHandler extends Handler {
    @Override
    public void process(File file) {
        if (file.getExtension().equalsIgnoreCase("jpg") || 
            file.getExtension().equalsIgnoreCase("png")) {
            System.out.println("Processing image file: " + file.getFileName());
        } else if (nextHandler != null) {
            nextHandler.process(file);
        } else {
            System.out.println("File type not supported: " + file.getFileName());
        }
    }
}