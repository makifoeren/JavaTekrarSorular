package JavaProject.Ucus_projesi02;

import java.util.Scanner;

public class JavaAirlines {
    public static void main(String[] args) {

        Yolcu ayhan=new Yolcu("B","tek",33);
        Scanner scan = new Scanner(System.in);

        System.out.print("Firmamiza hosgeldiniz \n B C D rotasindan birini seciniz :");
        String city=scan.next().toUpperCase();

        System.out.print("Ucusunuz icin \n tek yön icin 1 \n cift yön icin 2 yi giriniz : ");
        int flytype=scan.nextInt();

        System.out.print("Lütfen yasinizi giriniz : ");
        int age=scan.nextInt();

        double priceC=0.1*700;
        double priceB=0.1*500;
        double priceD=0.1*900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {

            if (age > 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceB * 0.70 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceB * 0.70 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceC * 0.70 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceC * 0.70 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceD * 0.70 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceD * 0.70 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");
                }
            }
            if (age > 12 && age < 24) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceB * 0.90 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceB * 0.90 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceC * 0.90 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceC * 0.90 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceD * 0.90 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceD * 0.90 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");
                }
            }
            if (age < 12) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceB * 0.50 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceB * 0.50 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceC * 0.50 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceC * 0.50 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceD * 0.50 + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceD * 0.50 * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");
                }

            }
            if (age >= 24 && age <= 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceB + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceB * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceC + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceC * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");

                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + priceD + " $ ");

                    } else if (flytype == 2) {
                        System.out.println(" ***** ");
                        System.out.println("Ucucsunuz icin bilet ödemniz : " + (priceD * 0.80) * 2 + " $ ");

                    } else System.out.println("Hatali veri girdiniz ");
                }
            }else System.out.println("Hatali yas girdiniz ");
            }else System.out.println("Yanlis ucus yeri sectiniz");
        }
    }