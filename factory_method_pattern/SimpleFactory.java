package factory_method_pattern;

public class SimpleFactory {
    DocumentParser parser;
    public static DocumentParser createDocumentParser(String fileExtension) {
        if (fileExtension == null) {
            throw new IllegalArgumentException("fileExtension must not be null");
        }

        switch (fileExtension.toLowerCase()) {
            case "xls":
            case "xlsx":
                return new ExcellParser();
            case "doc":
            case "docx":
                return new WordParser();
            default:
                throw new IllegalArgumentException("Unknown file extension: " + fileExtension);
        }
    }
}
