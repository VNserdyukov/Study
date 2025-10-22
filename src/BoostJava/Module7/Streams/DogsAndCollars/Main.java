package BoostJava.Module7.Streams.DogsAndCollars;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(" +");
            if (parts.length > 2) {
                Dog dog = new Dog(parts[0], parts[1], new Collar(parts[2], Integer.parseInt(parts[3])));
                dogs.add(dog);
            } else {
                Dog dog = new Dog(parts[0], parts[1]);
                dogs.add(dog);
            }
        }

        Optional<Dog> collars = dogs.stream().filter(dog -> dog.getCollar() != null)
                .min(Comparator.comparingInt(d-> d.getCollar().getSize()));

        System.out.println(collars.map(Dog::toString).orElse("Empty data"));
    }
}
