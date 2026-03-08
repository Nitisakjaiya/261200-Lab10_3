public class File {
    private String fileName;
    private String extension;

    public File(String fileName) {
        this.fileName = fileName;
        this.extension = fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public String getFileName() {
        return fileName;
    }

    public String getExtension() {
        return extension;
    }
}