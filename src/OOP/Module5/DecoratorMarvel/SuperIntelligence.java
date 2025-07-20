package OOP.Module5.DecoratorMarvel;

class SuperIntelligence extends SuperHeroDecorator {
    public SuperIntelligence(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public int getChanceToSurvive() {
        return superHero.getChanceToSurvive() + 7;
    }

    @Override
    public String getDescription() {
        return superHero.getDescription() + ", super Intelligence";
    }
}