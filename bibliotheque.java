
package tp6;

public class bibliotheque {

    protected documents[] Listdoc;
    protected int nbdocs;
    protected int capacite;

    // Constructeur
    public bibliotheque(int capacite) {
        this.nbdocs = 0;
        this.capacite = capacite;
        this.Listdoc = new documents[capacite];
    }

    // Retourne la capacite maximale
    public int getCapacite() {
        return capacite;
    }

    // Retourne le nombre de documents
    public int getNombre_document() {
        return nbdocs;
    }

    // Ajout d'un document selon son numero
    public void Ajout_doc(documents d) {
        if (nbdocs >= capacite) {
            System.out.println("Bibliotheque pleine");
            return;
        }

        if (d == null) {
            System.out.println("Document invalide");
            return;
        }

        int i = 0;

        while (i < nbdocs && Listdoc[i].numid() < d.numid()) {
            i++;
        }

        if (i < nbdocs && Listdoc[i].numid() == d.numid()) {
            System.out.println("Numero deja existant");
            return;
        }

        for (int j = nbdocs; j > i; j--) {
            Listdoc[j] = Listdoc[j - 1];
        }

        Listdoc[i] = d;
        nbdocs++;
    }

    // Suppression d'un document
    public void Supprim_doc(int num) {
        int i = 0;

        while (i < nbdocs && Listdoc[i].numid() != num) {
            i++;
        }

        if (i == nbdocs) {
            System.out.println("Document introuvable");
            return;
        }

        for (int j = i; j < nbdocs - 1; j++) {
            Listdoc[j] = Listdoc[j + 1];
        }

        Listdoc[nbdocs - 1] = null;
        nbdocs--;
    }

    // Affichage de tous les documents
    public void Inventaire_doc() {
        for (int i = 0; i < nbdocs; i++) {
            Listdoc[i].Edition();
            System.out.println("--------------------");
        }
    }

    // Bibliotheque contenant seulement les livres
    public bibliotheque liste_livre() {
        bibliotheque b = new bibliotheque(capacite);

        for (int i = 0; i < nbdocs; i++) {
            if (Listdoc[i] instanceof livres) {
                b.Ajout_doc(Listdoc[i]);
            }
        }

        return b;
    }

    // Bibliotheque contenant les articles sauf les livres
    public bibliotheque liste_article() {
        bibliotheque b = new bibliotheque(capacite);

        for (int i = 0; i < nbdocs; i++) {
            if (Listdoc[i] instanceof articles
                    && !(Listdoc[i] instanceof livres)) {
                b.Ajout_doc(Listdoc[i]);
            }
        }

        return b;
    }

    // Bibliotheque contenant les documents simples
    public bibliotheque liste_docsimples() {
        bibliotheque b = new bibliotheque(capacite);

        for (int i = 0; i < nbdocs; i++) {
            if (Listdoc[i].getClass() == documents.class) {
                b.Ajout_doc(Listdoc[i]);
            }
        }

        return b;
    }

    // Bibliotheque contenant seulement les periodiques
    public bibliotheque liste_periodique() {
        bibliotheque b = new bibliotheque(capacite);

        for (int i = 0; i < nbdocs; i++) {
            if (Listdoc[i] instanceof periodiques) {
                b.Ajout_doc(Listdoc[i]);
            }
        }

        return b;
    }
}


