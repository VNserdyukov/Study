package OOP.Module5.DecoratorMarvel;

class SuperAgility extends SuperHeroDecorator {
    public SuperAgility(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public int getChanceToSurvive() {
        return superHero.getChanceToSurvive() + 3;
    }

    @Override
    public String getDescription() {
        return superHero.getDescription() + ", super Agility";
    }
}