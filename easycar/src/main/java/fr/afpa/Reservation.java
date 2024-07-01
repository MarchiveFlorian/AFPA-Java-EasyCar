package fr.afpa;

import java.time.LocalDate;

public class Reservation {

    // Attributs
    private LocalDate starDate;
    private LocalDate endDate;
    private boolean paid;

    // Constructors
    public Reservation(LocalDate starDate, LocalDate endDate, boolean paid) {
        this.starDate = starDate;
        this.endDate = endDate;
        this.paid = paid;
    }

    // Getters & Setters
    public LocalDate getStarDate() {
        return starDate;
    }

    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    // Méthodes
    @Override
    public String toString() {
        return "Reservation [starDate=" + starDate + ", endDate=" + endDate + ", paid=" + paid + "]";
    }

}
