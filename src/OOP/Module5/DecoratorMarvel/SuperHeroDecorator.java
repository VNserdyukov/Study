package OOP.Module5.DecoratorMarvel;

abstract class SuperHeroDecorator extends SuperHero {
    protected SuperHero superHero;

    public SuperHeroDecorator(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public abstract int getChanceToSurvive();

    @Override
    public abstract String getDescription();
}