package kk_repo.designpattern.solid;

// Implementation of JuiceMaker for premium juice making
class PremiumJuiceMaker implements JuiceMaker {
    private StringBuilder juice = new StringBuilder();
    @Override
    public void addIngredient(String ingredient) {
        juice.append(ingredient).append(" ");
    }
    @Override
    public String makeJuice() {
        String result = juice.toString().trim();
        juice.setLength(0); // Reset the juice for next use
        return "Premium Juice: " + result;
    }
}
