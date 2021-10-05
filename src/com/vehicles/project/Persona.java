package com.vehicles.project;

public abstract class Persona {
    //Atributs
    protected String name;
    protected String lastnames;
    protected int day, month,year;


    public Persona(String name, String lastnames, int day, int month, int year) throws Exception {
        if (name.equals(""))
            throw new Exception();
        if(lastnames.equals(""))
            throw new Exception();
        if(day<=0)
            throw new Exception();
        if(month<0 && month>12)
            throw new Exception();
        if(year<=1800)
            throw new Exception();

        this.name = name;
        this.lastnames = lastnames;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {return name;}

    public String getLastnames() {return lastnames;}

    public int getDay() {return day;}

    public int getMonth() {return month;}

    public int getYear() {return year;}

    public void setName(String name) {this.name = name;}

    public void setLastnames(String lastnames) {this.lastnames = lastnames;}

    public void setDay(int day) {this.day = day;}

    public void setMonth(int month) {this.month = month;}

    public void setYear(int year) {this.year = year;}

    @Override
    public String toString() {
        return "Persona{" +
                "\nName:" + name  +
                "\nLastnames:" + lastnames  +
                "\nDate Birth:" + day +" / " + month + " / " + year + "}";
    }
}
