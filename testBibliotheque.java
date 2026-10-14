package tp6;

public class testBibliotheque {
    public static void main(String[] args) {
        bibliotheque b = new bibliotheque(10);
        documents d1 = new documents("Document A", 5, 30);
        articles a1 = new articles("Article B", 2, 15, "Ahmed");
        livres l1 = new livres("Livre C", 1, 200, "Ali", "Dar Tunis");
        periodiques p1 = new periodiques("Revue D", 4, 50, "Mensuelle");
        
        b.Ajout_doc(d1);
        b.Ajout_doc(a1);
        b.Ajout_doc(l1);
        b.Ajout_doc(p1);
        
        System.out.println("Tous les documents");
        b.Inventaire_doc();	
        System.out.println("Les livres");
        b.liste_livre().Inventaire_doc();
        System.out.println("Les articles");
        b.liste_article().Inventaire_doc();
        System.out.println("Les documents simples");
        b.liste_docsimples().Inventaire_doc();
        System.out.println("Les periodiques");
        b.liste_periodique().Inventaire_doc();
        System.out.println("Nombre de documents : " + b.getNombre_document());
        System.out.println("=== Suppression du document numero 4 ===");
        b.Supprim_doc(4);
        b.Inventaire_doc();
    }
}