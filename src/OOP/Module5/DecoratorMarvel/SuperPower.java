package OOP.Module5.DecoratorMarvel;

class SuperPower extends SuperHeroDecorator {
    public SuperPower(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public int getChanceToSurvive() {
        return superHero.getChanceToSurvive() + 4;
    }

    @Override
    public String getDescription() {
        return superHero.getDescription() + ", super Power";
    }
}