
package tp6;

public class documents {

    protected String titre;
    protected int numid;
    protected int nbpages;

    // Constructeur avec parametres
    public documents(String titre, int nbpages, int numid) {
        this.titre = titre;
        this.numid = numid;
        this.nbpages = nbpages;
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public int numid() {
        return numid;
    }

    public int nbpages() {
        return nbpages;
    }

    public int getNumero() {
        return numid;
    }

    // Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNumero(int numero) {
        this.numid = numero;
    }

    public void setNombrePages(int nombrePages) {
        this.nbpages = nombrePages;
    }

    // Retourne le type du document
    public String getType() {
        return "Document";
    }

    // Affichage des caracteristiques
    public void Edition() {
        System.out.println("Type : " + getType());
        System.out.println("Titre : " + titre);
        System.out.println("Numero d'identification : " + numid);
        System.out.println("Nombre de pages : " + nbpages);
    }
}


