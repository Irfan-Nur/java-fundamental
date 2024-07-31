package com.juaracoding;

public class Variable {
    public static void main(String[] args) {

        // tipe data number
        byte age = 127;
        short stock = 9999;
        float price = 1000.55f;
        double totalPrice = 300000000.99d;
        long total = 4000000000L;
        int cartProduct = 1000;

        // char
        char gender = 'L';
        char predikat = 'A';

        // escape character
        System.out.printf("\"JuaraCoding\nIndonesia");

        // boolean
        boolean isResult = true;
        boolean isLogin = false;

        // String
        String productName = "Headset";
        System.out.println("Product Name : " +productName);

        // buatkan output menampilkan profile user
        String nama = "Budi";
        System.out.println("Nama: "+nama);
        String alamat = "JL. Shapire Bumi Mutiara, Kecamatan Gunung Putri";
        System.out.println("Alamat: "+alamat);
        double nomorTelfon = 0812245443665d;
        System.out.println("Nomor Telfon: "+nomorTelfon);
        String jabatan = "Human Resources";
        System.out.println("Jabatan: "+ jabatan);
        byte umur = 25;
        System.out.println("Umur: "+ umur);
        char jenisKelamin = 'L';
        System.out.println("Jenis Kelamin: "+jenisKelamin);
        boolean hadir = true;
        System.out.println("Kehadiran: " + hadir);

        //menampilkan output file
        String pathImage = "C:\\Users\\irfan\\Pictures";
        System.out.println(pathImage);
        //Implicit Casting / Autpmatic Casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);

        char data2 ='Z';
        long dataLong = data2;
        System.out.println(dataLong);

        // Explicit Casting / Manual Casting
        char data3 = '+';
        byte dataByte = (byte) data3;
        System.out.println(dataByte);

        int stok = 9999; // android
        short dataShort = (short) stok; // java backend
        System.out.println(dataShort);

        //Passing by Value
        String address = "Jakarta";
        String duplcatAddress = address;
        duplcatAddress = "Bandung";
        System.out.println(duplcatAddress);


    }
}
