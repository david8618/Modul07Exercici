package com.vehicles.project;

import java.util.Scanner;

import static com.vehicles.project.Nivell01Nivell02.*;

public class Nivell03 {

    public static void main(String[] args) throws Exception {
        System.out.println("NIVEL 03");
        //Variable Scanner
        Scanner sc=new Scanner(System.in);
        int opc;
        do{
            System.out.println("+ + + + + + + + + + + +   INICI NIVEL 03   + + + + + + + + + + + +");
            System.out.println("1- PERSONAS\n2- VEHICLES\n3- SORTIR");
            opc=sc.nextInt();
            switch (opc){
                case 1: //MENU CREAR CONDUCTORS I TITULARS
                    do {
                        menuCrearPersonas();
                        opc = sc.nextInt();
                        switch (opc) {
                            case 1: {
                                crearConductorSenseLlicencia();
                            }
                            break;
                            case 2: {
                                crearTitular();
                            }
                            break;
                            case 3: {
                                mostrarDadesConductors();
                            }
                            break;
                            case 4: {
                                System.out.println("----- SORTIR DEL MENU PERSONAS -----");                        }
                            break;
                            default:
                                System.out.println("Opció invalida.");
                                break;

                        }
                    } while (opc != 4);

                    break;

                case 2:
                    do {
                        menuCrearVehicles();
                        opc = sc.nextInt();
                        switch (opc) {
                            case 1: {
                                crearCar();

                            }
                            break;
                            case 2: {
                                crearBike();

                            }
                            break;
                            case 3: {
                                crearTruck();
                            }
                            break;
                            case 4: {
                                mostrarDadesVehicles();
                            }
                            break;
                            case 5:{
                                System.out.println("----- SORTIR DEL MENU PERSONAS -----");
                            }
                            break;
                            default:
                                String msj = "Opció invalida.";
                                break;

                        }
                    } while (opc != 5);
                    break;

                case 3:
                    System.out.println("Fins la proxima!");
                    break;

                default:
                    System.out.println("Has indicat una opció no valida.");
                    break;
            }
        }while(opc!=3);

    }
}
