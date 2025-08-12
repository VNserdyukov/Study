package BoostJava.Module2.Set.Count;

import java.util.Objects;

public class Surname {
    private String surname;
    private String name;

    public Surname(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Surname surname1)) return false;
        return Objects.equals(surname, surname1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(surname);
    }
}
