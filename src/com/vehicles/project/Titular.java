package com.vehicles.project;

public class Titular extends Conductor{

    //Atributs
    private boolean asegurat, garatgePropi;

    public Titular(String name, String lastnames, int day, int month, int year, int dayLlicencia, int monthLlicencia,
                   int yearLlicencia, String tipusllicencia, boolean asegurat, boolean garatgePropi) throws Exception {

        super(name, lastnames, day, month, year, dayLlicencia, monthLlicencia, yearLlicencia, tipusllicencia);
        this.asegurat = asegurat;
        this.garatgePropi = garatgePropi;
    }



    public String getAsegurat() {
        if(asegurat=false) return "No";
        else return "Si";}

    public String getGaratge(){
        if(garatgePropi=false) return "No";
        else return "Si";
    }

    public boolean getGaratgePropi() {return garatgePropi;}

    public void setAsegurat(boolean asegurat) {this.asegurat = asegurat;}

    public void setGaratgePropi(boolean garatgePropi) {this.garatgePropi = garatgePropi;}


    @Override
    public String toString() {
        return "Titular: "+
                "\n -Name: " + name  +
                "\n -Last Names: " + lastnames  +
                "\n -Date Brith: " + day + " / " + month + " / " + year +
                "\n -Llicencia de Conduir: " + super.getTipusllicencia().toUpperCase() +
                "\n -Te Assegurança: " + this.getAsegurat() +
                "\n -Garatge propi: " + this.getGaratge() ;

    }
}
