package BoostJava.Module7.StreamOperations.DogsAndCollars;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(" ");
            if (parts.length > 2) {
                Dog dog = new Dog(parts[0], parts[1], new Collar(parts[2], Integer.parseInt(parts[3])));
                dogs.add(dog);
            } else {
                Dog dog = new Dog(parts[0], parts[1]);
                dogs.add(dog);
            }
        }

        List<Collar> collars = dogs.stream().map(Dog::getCollar).filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(Collar::getSize)).toList();
        System.out.println(collars);
    }
}
