package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        phone phone = new phone(1,"Sansuang","note777","2016","$824");
        phone phone1 = new phone(2,"Apples","JphoneX","2011","$1005");
        phone phone2 = new phone(3,"Yeskia","3310","2000","$250");
        phone phone3 = new phone(4,"Huaway","P64pro","1989","$604");
        phone phone4 = new phone(5,"Popo","Renoooo","2019","$2004");
        phone.alldetailedprint();
        phone1.alldetailedprint();
        phone2.alldetailedprint();
        phone3.alldetailedprint();
        phone4.alldetailedprint();
    }
}