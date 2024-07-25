package es1;

import enums.Dipartimento;

public class DipendeteFullTime extends Dipendente {
    public DipendeteFullTime(int matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
    
    }
}
