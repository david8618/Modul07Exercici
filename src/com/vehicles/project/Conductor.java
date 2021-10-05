package com.vehicles.project;

public class Conductor extends Persona{

    //Atributs
    private int dayLlicencia, monthLlicencia,yearLlicencia;
    private String tipusllicencia; // pot ser de CAR, BIKE, TRUCK
    //private Llicencia llicencia;


    public Conductor(String name, String lastnames, int day, int month, int year, int dayLlicencia, int monthLlicencia, int yearLlicencia, String tipusllicencia) throws Exception {
        super(name, lastnames, day, month, year);
        this.dayLlicencia = dayLlicencia;
        this.monthLlicencia = monthLlicencia;
        this.yearLlicencia = yearLlicencia;
        this.tipusllicencia = tipusllicencia;
        //String completName=name + " " + lastnames;
        //llicencia =new Llicencia(completName,dayLlicencia,monthLlicencia,yearLlicencia,tipusllicencia);

    }


    public int getDayLlicencia() {return dayLlicencia;}

    public int getMonthLlicencia() {return monthLlicencia;}

    public int getYearLlicencia() {return yearLlicencia;}

    public String getTipusllicencia() {return tipusllicencia;}

    public void setDayLlicencia(int dayLlicencia) {this.dayLlicencia = dayLlicencia;}

    public void setMonthLlicencia(int monthLlicencia) {this.monthLlicencia = monthLlicencia;}

    public void setYearLlicencia(int yearLlicencia) {this.yearLlicencia = yearLlicencia;}

    public void setTipusllicencia(String tipusllicencia) {this.tipusllicencia = tipusllicencia;}


    @Override
    public String toString() {
        return "Conductor" +
                "\nName:" + name  +
                "\nLast Names:" + lastnames  +
                "\nDate Brith:" + day + " / " + month + " / " + year +
                "\nLlicencia de Conduir:" + tipusllicencia;
    }
}
