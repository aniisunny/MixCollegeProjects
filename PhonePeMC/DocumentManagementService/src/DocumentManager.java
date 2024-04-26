import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentManager {

    private Map<String, Document> documents;
    //private Map<String, List<Document>> documents;

    public DocumentManager() {

        this.documents = new HashMap<>();
    }

    public Document createDocument(User author, String title, String content) {

        Document document = new Document(title, content, author);

        documents.put(document.getDocumentID(), document);
        return document;
    }

    public void updateDocument(User editor, Document document, String newContent) {

        if (!editor.getUserID().equals(document.getAuthorID())) {
            System.out.println("You do not have permission to update this document.");
            return;
        }

        document.updateContent(newContent);
    }

    public String getLatestActiveVersion(Document document) {

        List<String> versionHistory = document.getVersionHistory();

        if (versionHistory == null) {
            System.out.println("No Active Version for this document.");
            return "";
        }

        return versionHistory.get(versionHistory.size() - 1);
    }

    public void deleteDocument(User editor, Document document) {

        if (!editor.getUserID().equals(document.getAuthorID())) {
            System.out.println("You do not have permission to delete this document.");
            return;
        }
        else if (document.getVersionHistory().size() == 0) {
            System.out.println("No Document Available");
            return;
        }

        document.deleteDocument();
    }

    public void revertToVersion(User editor, Document document) {

        if (!editor.getUserID().equals(document.getAuthorID())) {
            System.out.println("You do not have permission to delete this document.");
            return;
        }

        document.revertToVersion(document.getVersionHistory().size() - 2);
    }
}