package kk_repo.designpattern.solid;

public class Main {
    public static void main(String[] args) {
        // Create a juice maker instance
        JuiceMaker juiceMaker = new SimpleJuiceMaker();

        // Create a juice shop instance with the juice maker
        JuiceShop juiceShop = new JuiceShop(juiceMaker);

        // Make juice
        juiceShop.addIngredient("Apple");
        juiceShop.addIngredient("Orange");
        System.out.println(juiceShop.makeJuice());

        // Change the juice maker to premium
        juiceMaker = new PremiumJuiceMaker();
        juiceShop = new JuiceShop(juiceMaker);

        // Make premium juice
        juiceShop.addIngredient("Strawberry");
        juiceShop.addIngredient("Mango");
        System.out.println(juiceShop.makeJuice());
    }
}
