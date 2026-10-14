
package tp6;

public class articles extends documents {

    protected String auteur;

    // Constructeur
    public articles(String titre, int nbpages, int numid, String auteur) {
        super(titre, nbpages, numid);
        this.auteur = auteur;
    }

    // Getter
    public String getAuteur() {
        return auteur;
    }

    // Setter
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    // Type
    @Override
    public String getType() {
        return "Article";
    }

    // Affichage
    @Override
    public void Edition() {
        super.Edition();
        System.out.println("Auteur : " + auteur);
    }
}
