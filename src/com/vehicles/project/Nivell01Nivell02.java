package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nivell01Nivell02 {

    private static List<Vehicle> vehiclesList = new ArrayList<>();

    private static List<Persona> personaList = new ArrayList<>();



    public static void main(String[] args) throws Exception {

        System.out.println("M07.01 Vehicles");

        Scanner sc = new Scanner(System.in);

        int opc;
        String resp, llicencia;
        //Crear Titular
        Titular myTitular= new Titular("David", "Díaz Zamarreño",
                18,06,1986, 20,01,2001,
                "car",true,true);
        System.out.println("TITULAR CREAT");
        System.out.println("+ + + + + + + + + + + + + + + + + + + +\n");
        System.out.println(myTitular.toString());
        System.out.println("+ + + + + + + + + + + + + + + + + + + +\n");

        do {
            menuCrearVehicles();
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    if(myTitular.getTipusllicencia().equalsIgnoreCase("CAR")){
                        crearCar();
                        do{
                            System.out.println("¿El titular sera el mateix que conductor?Si/No");
                            resp=sc.next();
                            if(resp.equalsIgnoreCase("NO")){
                                llicencia=myTitular.getTipusllicencia();
                                crearConductor(llicencia);
                            }
                        }while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));

                    }else{
                        System.out.println("No pots crear un NEW CAR amb una llicencia diferent.");
                    }
                }
                break;
                case 2: {
                    if(myTitular.getTipusllicencia().equalsIgnoreCase("BIKE")){
                        crearBike();
                        do{
                            System.out.println("¿El titular sera el mateix que conductor?Si/No");
                            resp=sc.next();
                            if(resp.equalsIgnoreCase("NO")){
                                llicencia=myTitular.getTipusllicencia();
                                crearConductor(llicencia);
                            }
                        }while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));

                    }else{
                        System.out.println("No pots crear un NEW BIKE amb una llicencia diferent.");
                    }
                }
                break;
                case 3: {
                    if(myTitular.getTipusllicencia().equalsIgnoreCase("BIKE")){
                        crearTruck();
                        do{
                            System.out.println("¿El titular sera el mateix que conductor?Si/No");
                            resp=sc.next();
                            if(resp.equalsIgnoreCase("NO")){
                                llicencia=myTitular.getTipusllicencia();
                                crearConductor(llicencia);
                            }
                        }while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));

                    }else{
                        System.out.println("No pots crear un NEW TRUCK amb una llicencia diferent.");
                    }

                }
                break;
                case 4: {
                    mostrarDadesVehicles();
                }
                break;
                case 5:{
                    System.out.println("----- PROGRAMA TANCAT. FINS LA PROPERA. -----");
                }
                break;
                default:
                    String msj = "Opció invalida.";
                    break;

            }
        } while (opc != 5);


    }
    /*
     * Funció que s'encarrega de crear coches
     */
    public static void crearCar() throws Exception {

        //Variables per introduir dades
        String plate, brand, color;
        int opc;
        //Scanner per agafar dades
        Scanner sc = new Scanner(System.in);
        //Agafem les dades
        System.out.println("* * * * * * * *  CREATE NEW CAR  * * * * * * * *");

        do {
            System.out.println("1. Indica la matricula del coche: ");
            plate = sc.next();
            if (revisarMatriculaVehicle(plate)) System.out.println("Matricula correcta!");
            else System.out.println("Torna a introduir la matricula. Ha de tenir 4 números i 2 o 3 lletres");

        } while (revisarMatriculaVehicle(plate) == false);

        System.out.println("2. Indica la marca del coche: ");
        brand = sc.next();
        System.out.println("3. Indica el color del coche:");
        color = sc.next();
        //Creem el nou cotxe i l'afeguim a l'Arraylist
        Car myCar = new Car(plate, brand, color);
        vehiclesList.add(myCar);
        System.out.println("* * * * * * * *  COCHE CREAT I AFEGIT A LA LLISTA DE VEHICLES  * * * * * * * *");
        System.out.println();
        System.out.println("* * * * * * * *  INTRODUIR MARCA I DIÀMETRE RODES DEL COCHE * * * * * * * *");
        crearRodesCar(myCar);

    }

    /*
    Funció que s'encarrega de crear rodes de coche.
     */
    public static void crearRodesCar(Car c) throws Exception {
        //Variables
        String brandRodaD1, brandRodaT2;
        double d1 = 0.0, d2 = 0.0;
        List<Wheel> wheelFrontWheels = new ArrayList<Wheel>();
        List<Wheel> wheelBackWheels = new ArrayList<Wheel>();
        //Recollir dades
        Scanner sc = new Scanner(System.in);
        //Creem les rodes
        System.out.println("1. Indica la marca de la rodes davanteras:");
        brandRodaD1 = sc.next();
        do {
            System.out.println("2. Indica el diàmetre de la rodes davanteras:");
            d1 = Double.parseDouble(sc.next());
            if (revisarDiametreRoda(d1) == true) {
                System.out.println("Diàmetre correcta!");
                //Creem la nova roda i passem el parametres
                Wheel rodaNovaFront = new Wheel(brandRodaD1, d1);
                //Afegim la roda a la llista de rodes creadas dues vegadas.
                wheelFrontWheels.add(rodaNovaFront);
                wheelFrontWheels.add(rodaNovaFront);

            } else {
                System.out.println("El diàmetre ha de ser superior a 0.4 o inferior a 4.\nTorna a indicar el diàmetre.");
            }
        } while (revisarDiametreRoda(d1) == false);
        //Afegim les rodes al cotxe
        System.out.println("3. Indica la marca de la rodes traseras:");
        brandRodaT2 = sc.next();
        do {
            System.out.println("4. Indica el diàmetre de la rodes traseras:");
            d2 = Double.parseDouble(sc.next());
            if (revisarDiametreRoda(d2) == true) {
                System.out.println("Diàmetre correcta!");
                //Creem la nova roda i passem el parametres
                Wheel rodaNovaBack = new Wheel(brandRodaT2, d2);
                //Afegim la roda a la llista de rodes creadas
                wheelBackWheels.add(rodaNovaBack);
                wheelBackWheels.add(rodaNovaBack);
            } else {
                System.out.println("El diàmetre ha de ser superior a 0.4 o inferior a 4.\nTorna a indicar el diàmetre.");
            }
        } while (revisarDiametreRoda(d2) == false);
        c.addWheels(wheelFrontWheels,wheelBackWheels);
        System.out.println("* * * * * * * *  RODES AFEGIDES AL COCHE CREAT * * * * * * * *");
    }

    public static void afegirTitular(Vehicle v) throws Exception{
        Scanner sc = new Scanner(System.in);
        int opc=sc.nextInt();

        menuAfegirPersonas();

        switch (opc){
            case 1:{
                System.out.println("1- Indica el nom del titular:");
                String nomTitular=sc.next();

                for (int i = 0; i < personaList.size(); i++) {
                    if(personaList.get(i).getName()==nomTitular){
                        v.addTitular((Titular) personaList.get(i));
                    }
                }
                System.out.println("Titular afegit al vehicle");


            }
            break;
            case 2:{

                //v.addTitular(crearTitular());
            }
        }
    }

    /*
    Funció que s'encarrega de crea motos
     */
    public static void crearBike() throws Exception {

        //Variables per introduir dades
        String plate, brand, color;
        int opc;
        //Scanner per agafar dades
        Scanner sc = new Scanner(System.in);
        //Agafem les dades
        System.out.println("* * * * * * * *  CREATE NEW BIKE  * * * * * * * *");

        do {
            System.out.println("1. Indica la matricula: ");
            plate = sc.next();
            if (revisarMatriculaVehicle(plate) == true) System.out.println("Matricula correcta!");
            else System.out.println("Torna a introduir la matricula. Ha de tenir 4 números i 2 o 3 lletres");

        } while (revisarMatriculaVehicle(plate) == false);

        System.out.println("2. Indica la marca: ");
        brand = sc.next();
        System.out.println("3. Indica el color:");
        color = sc.next();
        //Creem el nou cotxe i l'afeguim a l'Arraylist
        Bike myBike = new Bike(plate, brand, color);
        vehiclesList.add(myBike);
        System.out.println("* * * * * * * *  MOTO CREADA I AFEGIDA A LA LLISTA DE VEHICLES  * * * * * * * *");
        System.out.println();
        System.out.println("* * * * * * * *  INTRODUIR MARCA I DIÀMETRE RODES DE LA MOTO * * * * * * * *");
        crearRodesBike(myBike);
    }


    /*
    Funció que s'encarrega de crea rodes de motos
     */
    public static void crearRodesBike(Bike b) throws Exception {
        //Variables
        String brandRodaD1, brandRodaT2;
        double d1 = 0.0, d2 = 0.0;
        List<Wheel>wheelFront=new ArrayList<Wheel>();
        List<Wheel>wheelBack=new ArrayList<Wheel>();
        //Recollir dades
        Scanner sc = new Scanner(System.in);
        //Creem les rodes
        System.out.println("1. Indica la marca de la roda davantera:");
        brandRodaD1 = sc.next();
        do {
            System.out.println("2. Indica el diàmetre de la roda davantera:");
            d1 = Double.parseDouble(sc.next());
            if (revisarDiametreRoda(d1) == true) {
                System.out.println("Diàmetre correcta!");
                //Creem la nova roda i passem el parametres
                Wheel rodaBikeFront = new Wheel(brandRodaD1, d1);
                //Afegim la roda a la llista de rodes creadas dues vegadas.
                wheelFront.add(rodaBikeFront);
            } else {
                System.out.println("El diàmetre ha de ser superior a 0.4 o inferior a 4.\nTorna a indicar el diàmetre.");
            }
        } while (revisarDiametreRoda(d1) == false);
        //Afegim les rodes al cotxe
        System.out.println("3. Indica la marca de la roda trasera:");
        brandRodaT2 = sc.next();
        do {
            System.out.println("4. Indica el diàmetre de la roda trasera:");
            d2 = Double.parseDouble(sc.next());
            if (revisarDiametreRoda(d2) == true) {
                System.out.println("Diàmetre correcta!");
                //Creem la nova roda i passem el parametres
                Wheel rodaBikeBack = new Wheel(brandRodaT2, d2);
                //Afegim la roda a la llista de rodes creadas
                wheelBack.add(rodaBikeBack);
            } else {
                System.out.println("El diàmetre ha de ser superior a 0.4 o inferior a 4.\nTorna a indicar el diàmetre.");
            }
        } while (revisarDiametreRoda(d2) == false);
        b.addWheelsBike(wheelFront, wheelBack);
        System.out.println("* * * * * * * *  RODES AFEGIDES A LA MOTO CREADA * * * * * * * *");

    }

    /*
    Funció que s'encarrega de verificar la matricula dels vehicles
     */
    public static boolean revisarMatriculaVehicle(String plate) {
        int contadorNum = 0, contadorLletres = 0;
        for (int i = 0; i < plate.length(); i++) {
            if (plate.charAt(i) >= 48 && plate.charAt(i) <= 57) contadorNum++; //NUM
            if (plate.charAt(i) >= 65 && plate.charAt(i) <= 90) contadorLletres++; //MAYUS
            if (plate.charAt(i) >= 97 && plate.charAt(i) <= 122) contadorLletres++; //MINUSCULAS
        }
        if (contadorNum == 4 && (contadorLletres == 2 || contadorLletres == 3)) return true;
        else return false;
    }

    /*
    Funció que s'encarrega de verificar el diamatre de les rodes
     */
    public static boolean revisarDiametreRoda(double diametre) {
        if (diametre >= 0.4 && diametre < 4.0) return true;
        else return false;
    }

    /*
    Funció que s'encarrega de crea camions
     */
    public static void crearTruck() throws Exception {
        //Variables per introduir dades
        String plate, brand, color;
        int opc;
        //Scanner per agafar dades
        Scanner sc = new Scanner(System.in);
        //Agafem les dades
        System.out.println("* * * * * * * *  CREATE NEW TRUCK  * * * * * * * *");

        do {
            System.out.println("1. Indica la matricula del camió: ");
            plate = sc.next();
            if (revisarMatriculaVehicle(plate) == true) System.out.println("Matricula correcta!");
            else System.out.println("Torna a introduir la matricula. Ha de tenir 4 números i 2 o 3 lletres");

        } while (revisarMatriculaVehicle(plate) == false);

        System.out.println("2. Indica la marca del camió: ");
        brand = sc.next();
        System.out.println("3. Indica el color del camió:");
        color = sc.next();
        //Creem el nou cotxe i l'afeguim a l'Arraylist
        Truck myTruck = new Truck(plate, brand, color);
        vehiclesList.add(myTruck);
        System.out.println("* * * * * * * *  CAMIÓ CREAT I AFEGIT A LA LLISTA DE VEHICLES  * * * * * * * *");
        System.out.println();
        System.out.println("* * * * * * * *  INTRODUIR MARCA I DIÀMETRE RODES DEL CAMIÓ * * * * * * * *");
        crearRodesTruck(myTruck);
    }

    /*
    Funció que s'encarrega de crear les rodes de camions.
     */
    public static void crearRodesTruck(Truck t) throws Exception{

        //Variables
        String brandRodaD1, brandRodaT2;
        double d1 = 0.0, d2 = 0.0;
        List<Wheel> wheelFrontWheels = new ArrayList<Wheel>();
        List<Wheel> wheelBackWheels = new ArrayList<Wheel>();
        //Recollir dades
        Scanner sc = new Scanner(System.in);
        //Creem les rodes
        System.out.println("1. Indica la marca de la rodas davantera:");
        brandRodaD1 = sc.next();
        do {
            System.out.println("2. Indica el diàmetre de la rodas davantera:");
            d1 = Double.parseDouble(sc.next());
            if (revisarDiametreRodaTruck(d1) == true) {
                System.out.println("Diàmetre correcta!");
                //Creem la nova roda i passem el parametres
                Wheel rodaNovaFront = new Wheel(brandRodaD1, d1);
                //Afegim la roda a la llista de rodes creadas dues vegadas.
                wheelFrontWheels.add(rodaNovaFront);
                wheelFrontWheels.add(rodaNovaFront);

            } else {
                System.out.println("El diàmetre ha de ser superior a 0.4 o inferior a 4.\nTorna a indicar el diàmetre.");
            }
        } while (revisarDiametreRodaTruck(d1) == false);
        //Afegim les rodes al cotxe
        System.out.println("3. Indica la marca de la rodas traseras:");
        brandRodaT2 = sc.next();
        do {
            System.out.println("4. Indica el diàmetre de la rodas traseras:");
            d2 = Double.parseDouble(sc.next());
            if (revisarDiametreRoda(d2) == true) {
                System.out.println("Diàmetre correcta!");
                //Creem la nova roda i passem el parametres
                Wheel rodaNovaBack = new Wheel(brandRodaT2, d2);
                //Afegim la roda a la llista de rodes creadas
                wheelBackWheels.add(rodaNovaBack);
                wheelBackWheels.add(rodaNovaBack);
            } else {
                System.out.println("El diàmetre ha de ser superior a 0.4 o inferior a 4.\nTorna a indicar el diàmetre.");
            }
        } while (revisarDiametreRoda(d2) == false);
        t.addWheelsTruck(wheelFrontWheels,wheelBackWheels);
        System.out.println("* * * * * * * *  RODES AFEGIDES AL CAMIÓ CREAT * * * * * * * *");

    }

    /*
   Funció que s'encarrega de verficiar les rodes de camions.
    */
    public static boolean revisarDiametreRodaTruck(double diametre) {
        if (diametre >= 1.5 && diametre < 6.0) return true;
        else return false;
    }

    /*
   Funció que s'encarrega de crear conductors si no son de tipus llicencia
    */
    public static void crearConductor(String llicencia) throws Exception {
        //Variables per crear un conductor
        String name, lastnames, tipusllicencia;
        int day, month, year, dayLlicencia, monthLlicencia, yearLlicencia;
        Scanner sc=new Scanner(System.in);

        System.out.println("* * * * * * NEW CONDUCTOR * * * * * *");
        System.out.println("1- Indica el Nom:");
        name = sc.next();
        System.out.println("2- Indica els Cognoms:");
        lastnames = sc.next();
        System.out.println("3- Día de naixement:");
        day = sc.nextInt();
        System.out.println("4- Mes de naixement (indica el més amb un número):");
        month = sc.nextInt();
        System.out.println("5- Any de naixement:");
        year = sc.nextInt();

        do{

            System.out.println("6- Tipus de Llicencia:");
            tipusllicencia = sc.next();
            if(!llicencia.equals(tipusllicencia)) {
                System.out.println("No pots crear un conductor amb diferent llicencia que un titular.\n" +
                        "Recorda que pot ser CAR-BIKE-TRUCK");
            }else{
                System.out.println("7- Dia que vas obtenir la llicencia:");
                dayLlicencia = sc.nextInt();
                System.out.println("8- Mes que vas obtenir la llicencia:");
                monthLlicencia = sc.nextInt();
                System.out.println("9- Any que vas obtenir la llicencia:");
                yearLlicencia = sc.nextInt();

                //Creem el conductor amb les dades de l'usuari
                Conductor cond01 = new Conductor(name, lastnames, day, month, year, dayLlicencia, monthLlicencia, yearLlicencia, tipusllicencia);
            }
        }while(!llicencia.equals(tipusllicencia));

        System.out.println("CONDUCTOR CREAR");

    }

    public static void crearConductorSenseLlicencia() throws Exception {
        //Variables per crear un conductor
        String name, lastnames, tipusllicencia;
        int day, month, year, dayLlicencia, monthLlicencia, yearLlicencia;
        Scanner sc=new Scanner(System.in);

        System.out.println("* * * * * * NEW CONDUCTOR * * * * * *");
        System.out.println("1- Indica el Nom:");
        name = sc.next();
        System.out.println("2- Indica els Cognoms:");
        lastnames = sc.next();
        System.out.println("3- Día de naixement:");
        day = sc.nextInt();
        System.out.println("4- Mes de naixement (indica el més amb un número):");
        month = sc.nextInt();
        System.out.println("5- Any de naixement:");
        year = sc.nextInt();
        System.out.println("6- Tipus de Llicencia:");
        tipusllicencia = sc.next();
        System.out.println("7- Dia que vas obtenir la llicencia:");
        dayLlicencia = sc.nextInt();
        System.out.println("8- Mes que vas obtenir la llicencia:");
        monthLlicencia = sc.nextInt();
        System.out.println("9- Any que vas obtenir la llicencia:");
        yearLlicencia = sc.nextInt();

        //Creem el conductor amb les dades de l'usuari
        Conductor cond01 = new Conductor(name, lastnames, day, month, year, dayLlicencia, monthLlicencia, yearLlicencia, tipusllicencia);
        personaList.add(cond01);


        System.out.println("CONDUCTOR CREAR");

    }

    public static void crearTitular() throws Exception {
        //Variables per crear un conductor
        String name, lastnames, tipusllicencia;
        int day, month, year, dayLlicencia, monthLlicencia, yearLlicencia, resp;
        boolean asegurat, garatagePropi;
        Scanner sc=new Scanner(System.in);

        System.out.println("* * * * * * NEW TITULAR * * * * * *");
        System.out.println("1- Indica el Nom:");
        name = sc.next();
        System.out.println("2- Indica els Cognoms:");
        lastnames = sc.next();
        sc.nextLine();
        System.out.println("3- Día de naixement:");
        day = sc.nextInt();
        System.out.println("4- Mes de naixement (indica el més amb un número):");
        month = sc.nextInt();
        System.out.println("5- Any de naixement:");
        year = sc.nextInt();
        System.out.println("6- Tipus de Llicencia:");
        tipusllicencia = sc.next();
        System.out.println("7- Dia que vas obtenir la llicencia:");
        dayLlicencia = sc.nextInt();
        System.out.println("8- Mes que vas obtenir la llicencia:");
        monthLlicencia = sc.nextInt();
        System.out.println("9- Any que vas obtenir la llicencia:");
        yearLlicencia = sc.nextInt();
        do{
            System.out.println("10- Esta assegurat. Si-1 / No-2.\nMarca 1 o 2");
            resp=sc.nextInt();
            if(resp==1){
                asegurat=true;
            }else{
                asegurat=false;
            }
            System.out.println("11- Te garatge propi. Si-1 / No-2.\nMarca 1 o 2");
            resp=sc.nextInt();
            if(resp==1){
                garatagePropi=true;
            }else{
                garatagePropi=false;
            }

        }while (resp!=1 && resp!=2);

        //Creem el titular amb les dades de l'usuari
        Titular titularNou = new Titular(name,lastnames,day,month,year,dayLlicencia,monthLlicencia,
                yearLlicencia,tipusllicencia,asegurat,garatagePropi);
        personaList.add(titularNou);

        System.out.println("TITULAR CREAT");

    }


    /*
    funció que mostra les dades
     */
    public static void mostrarDadesVehicles() {
        String allVehicles = vehiclesList.toString();
        System.out.println("Vehicles Taller Manolo: \n" + allVehicles);
    }

    public static void mostrarDadesConductors() {
        String allPersonas = personaList.toString();
        System.out.println("+ + + + + + + + + + PERSONAS + + + + + + + + + + +\n" +
                allPersonas+
                "\n+ + + + + + + + + + + + + + + + + + + + + + + + +");
    }

    /*
    funció que mostra el menu dels vehicels
     */
    public static void menuCrearVehicles() {
        System.out.println("* * * * * * * *  TALLER ITACADEMY CARS, BIKES AND TRUCKS  * * * * * * * *");
        System.out.println("* * * * * * * *  MENU VEHICLES  * * * * * * * *");
        System.out.println("1. NEW CAR");
        System.out.println("2. NEW BIKE");
        System.out.println("3. NEW TRUCK");
        System.out.println("4. MOSTRAR DADES");
        System.out.println("5. TORNA AL MENU INICIAL =>");
    }

    /*
    funció que mostra el menu per crear personas
     */
    public static void menuCrearPersonas() {
        System.out.println("* * * * * * * *  MENU PERSONAS  * * * * * * * *");
        System.out.println("1. NEW CONDUCTOR");
        System.out.println("2. NEW TITULAR");
        System.out.println("3. MOSTRAR DADES CONDUCTORS");
        System.out.println("4. TORNA AL MENU INICIAL =>");
        //System.out.println("4. EXIT =>");

    }

    /*
    funció menu afegir titular o conductor
     */
    public static void menuAfegirPersonas(){
        System.out.println("* * * * * ASIGNAR TITULAR * * * * *" +
                "\n1- AFEGIR TITULAR EXISTEN\n2- AFEGIR TITULAR NOU" +
                "\n3- AFEGIR CONDUCTORS \n4- EXIT");
    }


}
