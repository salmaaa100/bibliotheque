
package tp6;

public class livres extends articles {

    private String editeur;

    // Constructeur
    public livres(String titre, int nbpages, int numid, String editeur, String auteur) {
        super(titre, nbpages, numid, auteur);
        this.editeur = editeur;
    }

    // Getter
    public String getEditeur() {
        return editeur;
    }

    // Setter
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    // Type
    @Override
    public String getType() {
        return "Livre";
    }

    // Affichage
    @Override
    public void Edition() {
        super.Edition();
        System.out.println("Editeur : " + editeur);
    }
}
