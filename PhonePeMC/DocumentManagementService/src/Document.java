import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Document {

    private String documentID;
    private String title;
    private String content;
    private String authorID;
    private List<String> versionHistory;

    public Document(String title, String content, User author) {

        this.documentID = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
        this.authorID = author.getUserID();
        this.versionHistory = new ArrayList<String>();
        this.versionHistory.add(content);
    }

    public String getDocumentID() {

        return documentID;
    }

    public String getTitle() {

        return title;
    }

    public String getContent() {

        return content;
    }

    public String getAuthorID() {

        return authorID;
    }

    public List<String> getVersionHistory() {

        return versionHistory;
    }

    public void updateContent(String newContent) {

        this.content = newContent;
        this.versionHistory.add(newContent);
    }

    public void deleteDocument() {

        versionHistory.remove(versionHistory.size() - 1);

        if (versionHistory.size() == 0) {
            this.content = "";
        }
        else {
            this.content = versionHistory.get(versionHistory.size() - 1);
        }
    }

    public void revertToVersion(int versionIndex) {

        if (versionIndex >= 0 && versionIndex < versionHistory.size()) {
            this.content = versionHistory.get(versionIndex);
        }
        else {
            System.out.println("Invalid version index.");
        }
    }
}