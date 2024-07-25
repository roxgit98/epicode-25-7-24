package es1;

import enums.Dipartimento;

public class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaMatricola() {
        System.out.println("ciao, questa è la mia matricola: " + matricola);
    }
}

