package OOP.Module1.Trip;

import java.util.Objects;

public class BusinessTrip {
    private static final int DAILY = 25;
    private String name;
    private int days;
    private int expenses;


    public int getTotal() {
        return expenses + days * DAILY;
    }

    public BusinessTrip(String name) {
        this.name = name;
    }

    public BusinessTrip(String name, int days) {
        this.name = name;
        this.expenses = days;
    }

    public BusinessTrip(String name, int days, int expenses) {
        this.name = name;
        this.days = days;
        this.expenses = expenses;
    }

    public BusinessTrip(BusinessTrip trip) {
        this.name = trip.name;
        this.expenses = trip.expenses;
        this.days = trip.days;
    }

    public BusinessTrip() {
        super();
    }

    @Override
    public String toString() {
        return name + ';' + days + ';' + expenses + ';' + getTotal();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BusinessTrip that = (BusinessTrip) o;
        return this.getTotal() == that.getTotal();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getTotal());
    }

    public void setName(String name) {
        this.name = name;
    }

}
