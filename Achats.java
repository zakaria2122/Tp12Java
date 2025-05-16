import java.util.HashMap;
import java.util.Map;

public class Achats {
    private HashMap<Produit, Integer> panier;

    public Achats(){
        this.panier = new HashMap<>();
    }

    public void ajouterProduit(Produit prod, int quantite){
        panier.put(prod, panier.getOrDefault(prod, 0) + quantite);
    }

    public double prixTotal(Produit prod){
        int quantite = panier.getOrDefault(prod, 0);
        return prod.getPrixUnitaire() * quantite;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Produit, Integer> entry : panier.entrySet()) {
            Produit p = entry.getKey();
            int qte = entry.getValue();
            double total = prixTotal(p);
            sb.append(qte).append(" ").append(p.getNom()).append(qte > 1 ? "s" : "")
              .append(" pour ").append(String.format("%.2f", total)).append(" euro(s)\n");
        }
        return sb.toString();
    }
}
