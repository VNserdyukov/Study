package OOP.Module5.DecoratorMarvel;

class RedSuperHero extends SuperHero {
    @Override
    public int getChanceToSurvive() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "Red super-hero";
    }
}