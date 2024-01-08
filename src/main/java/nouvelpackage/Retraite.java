package nouvelpackage;

import java.util.Scanner;

public class Retraite {
    public static void main(String[] args) {

         /*
        Örnek 1: Kullanicidan 0'dan kucuk deger giremiyecek sekilde verileri aldiktan sonra;

        Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin


        //Eger calisan erkek ise;
        //65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */

        //erkekler için 16 yaş altı çalışmayacak
        //kadınlar için 18 yaş altı çalışmamalı
        //çalışmamalı, çalışmalı, emekli olmalı 3 koşul bakacağız
        //iç içe if lerde if, else if, else kullanacağız



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz: ");
        String gender = scan.next();

        System.out.println("Lutfen yasinizi giriniz: ");
        int age = scan.nextInt();


        if (gender.equalsIgnoreCase("erkek") || gender.equalsIgnoreCase("kadin")){


            if (age < 0){
                System.out.println("DIKKAT"+"\nLutfen 0'dan kucuk bir sayi girmeyiniz !");


            } else if (gender.equals("erkek")) {
                if (age < 16){
                    System.out.println("Calisamaz !");
                } else if (age < 65) {
                    System.out.println("Calismali !");
                }else {
                    System.out.println("Emekli olabilir");
                }



            } else if (gender.equals("kadin")) {
                if (age < 18){
                    System.out.println("Calisamaz !");
                } else if (age < 60) {
                    System.out.println("Calisabilir !");
                }else {
                    System.out.println("Emekli olabilir");
                }


            }else {
                System.out.println("Uzgunuz sizin icin farkli bir tanimlama yapilmadi");
            }


        }else {
            System.out.println("Geçerli bir cinsiyet giriniz (erkek veya kadın).");
        }
        scan.close();






    }
}
