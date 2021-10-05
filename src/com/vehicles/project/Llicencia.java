package com.vehicles.project;

public class Llicencia {

    //Atributs
    protected int id; //variable per identificar les llicencies
    protected static int COUNTER_LLICENCIAS = 1;
    private int dayFinal, monthFinal, yearFinal;
    private String tipusDeLlicencia; // pot ser de CAR, BIKE OR TRUCK
    private String completName;

    public Llicencia(String completName, int dayFinal, int monthFinal, int yearFinal, String tipusDeLlicencia) {
        this.completName=completName;
        this.dayFinal = dayFinal;
        this.monthFinal = monthFinal;
        this.yearFinal = yearFinal;
        this.tipusDeLlicencia = tipusDeLlicencia;
        id=COUNTER_LLICENCIAS;
        COUNTER_LLICENCIAS++;
    }

    public int getDayFinal() {return dayFinal;}

    public int getMonthFinal() {return monthFinal;}

    public int getYearFinal() {return yearFinal;}

    public String getTipusDeLlicencia() {return tipusDeLlicencia;}

    public String getCompletName() {return completName;}


    public void setDayFinal(int dayFinal) {this.dayFinal = dayFinal;}

    public void setMonthFinal(int monthFinal) {this.monthFinal = monthFinal;}

    public void setYearFinal(int yearFinal) {this.yearFinal = yearFinal;}

    public void setTipusDeLlicencia(String tipusDeLlicencia) {this.tipusDeLlicencia = tipusDeLlicencia;}

    public void setCompletName(String completName) {this.completName = completName;}

    @Override
    public String toString() {
        return "\n  ->Id:" + id +
                "\n  ->Tipus de Llicencia:'" + tipusDeLlicencia +
                "\n  ->Data de Caducitat: " + dayFinal + " / " +monthFinal + " / " +yearFinal;
    }
}
