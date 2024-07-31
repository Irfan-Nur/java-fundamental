package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {

        if(false){
            System.out.println("Statment");
        }

        System.out.println("Next Statment");

        // program ganjil genap (if else)
        int platNomor = 1234;
        if(platNomor % 2 == 0){ // 1 == 0 (false)
            System.out.println("Plat Nomor Genap");
        } else {
            System.out.println("Plat Nomor Ganjil");
        }

        //if majemuk
        String size = "L";
        int harga = 0;
        if (size == "M"){
            harga = 40000;
        } else if (size == "L") {
            harga = 50000;

        } else if (size == "XL") {
            harga = 60000;

        }else if (size == "XXL") {
            harga = 80000;

        }
        System.out.println("Size : " + size+  "\nPrice : "+ harga);
        // login username password, menggunakan String Object
        String username = "Admin";
        String password = "p4ssw0rd";
        if(username.equalsIgnoreCase("admin") && password.equals("p4ssw0rd")){//login true
            System.out.println("Login Berhasil");
        } else {
            System.out.println("login Gagal");
        }

    }
}
