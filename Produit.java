public class Produit {
    private String nom;
    private double prixUnitaire;

    public Produit(String nom, double prixUnitaire){
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    @Override
    public String toString() {
        return nom + " pour " + String.format("%.2f", prixUnitaire) + " euro(s)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit)) return false;
        Produit p = (Produit) o;
        return nom.equals(p.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
