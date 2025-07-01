package OOP.Module4.NestedClass;

public class Dog {
    private String name;
    private String breed;
    private Collar collar;

    public Dog(String name, String breed, String color, double size) {
        this.name = name;
        this.breed = breed;
        this.collar = new Collar(color, size);
    }

    public int compareTo(Dog two) {
        if (collar.getSize() > two.collar.getSize()) return 1;
        if (collar.getSize() < two.collar.getSize()) return -1;
        return 0;
    }

    private class Collar {
        private String color;
        private double size;

        public Collar(String color, double size) {
            this.color = color;
            this.size = size;
        }

        public double getSize() {
            return size;
        }
    }
}
