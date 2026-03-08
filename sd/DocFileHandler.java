public class DocFileHandler extends Handler {
    @Override
    public void process(File file) {
        if (file.getExtension().equalsIgnoreCase("doc")) {
            System.out.println("Processing document file: " + file.getFileName());
        } else if (nextHandler != null) {
            nextHandler.process(file);
        } else {
            System.out.println("File type not supported: " + file.getFileName());
        }
    }
}