package cours;

public class Client {

    public static void main(String[] args){

        System.out.println("bonjour le monde");

        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        //affiche un produit de type A
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();

        //affiche un produit de type B
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();

        //affiche un produit de type C
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();

        //produit inexistant
        String d= "D";
        //affiche un produit de type D
        produit = fabriqueproduit.createProduit(d);
        produit.methodeproduit();
    }
}
