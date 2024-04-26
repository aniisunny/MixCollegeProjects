public class DocumentManagementService {

    public static void main(String[] args) {

        Authenticator authenticator = new UserAuthenticator();
        User user1 = authenticator.createUser("user1", "password1");
        User user2 = authenticator.createUser("user2", "password2");

        DocumentManager documentManager = new DocumentManager();
        Document document1 = documentManager.createDocument(user1, "Document 1", "Content of Document 1");
        Document document2 = documentManager.createDocument(user2, "Document 2", "Content of Document 2");

        documentManager.updateDocument(user1, document2, "New Content of Document 2");
        documentManager.updateDocument(user1, document1, "New Content of Document 1");

        System.out.println("Document 1 Content: " + document1.getContent());
        System.out.println("Document 2 Content: " + document2.getContent());
    }
}