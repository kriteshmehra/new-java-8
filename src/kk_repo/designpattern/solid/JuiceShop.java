package kk_repo.designpattern.solid;

// Class responsible for operating the juice maker
class JuiceShop {
    private final JuiceMaker juiceMaker;
    public JuiceShop(JuiceMaker juiceMaker) {
        this.juiceMaker = juiceMaker;
    }
    public void addIngredient(String ingredient) {
        juiceMaker.addIngredient(ingredient);
    }
    public String makeJuice() {
        return juiceMaker.makeJuice();
    }
}