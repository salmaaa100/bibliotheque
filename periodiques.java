
package tp6;

public class periodiques extends documents {

    protected String frequence;

    // Constructeur
    public periodiques(String titre, int nbpages, int numid, String frequence) {
        super(titre, nbpages, numid);
        this.frequence = frequence;
    }

    // Getter
    public String getFrequence() {
        return frequence;
    }

    // Setter
    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    // Type
    @Override
    public String getType() {
        return "Periodique";
    }

    // Affichage
    @Override
    public void Edition() {
        super.Edition();
        System.out.println("Frequence : " + frequence);
    }
}

