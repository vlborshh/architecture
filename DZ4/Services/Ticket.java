package DZ4.Services;

import java.time.LocalDate;

public class Ticket {
    private long rootNumber;
    private double price;
    private int place;
    private LocalDate date;
    private boolean isValid;

    public Ticket(long roomNumber, double price, int place, LocalDate date) {
        this.rootNumber = roomNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = true;
    }

    public long getRootNumber() {
        return this.rootNumber;
    }

    public void setRootNumber(long roomNumber) {
        this.rootNumber = roomNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlace() {
        return this.place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isIsValid() {
        return this.isValid;
    }

    public boolean getIsValid() {
        return this.isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

}
