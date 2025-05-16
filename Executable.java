public class Executable {
    public static void main(String[] args) {
        Produit salade = new Produit("Salade", 1.5);
        Produit brocolis = new Produit("Brocolis", 2.75);
        Produit baguette = new Produit("Baguette", 1.0);

        System.out.println(salade);   // Affiche : Salade pour 1.50 euro(s)
        System.out.println(brocolis); // Affiche : Brocolis pour 2.75 euro(s)

        Achats achats = new Achats();
        achats.ajouterProduit(salade, 2);
        achats.ajouterProduit(baguette, 1);

        System.out.println("\nContenu du panier :");
        System.out.println(achats);
    }
}