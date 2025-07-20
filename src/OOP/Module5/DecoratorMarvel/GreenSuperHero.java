package OOP.Module5.DecoratorMarvel;

class GreenSuperHero extends SuperHero {
    @Override
    public int getChanceToSurvive() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Green super-hero";
    }
}