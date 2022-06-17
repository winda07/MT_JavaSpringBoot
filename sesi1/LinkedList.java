import java.io.*;
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        List <String> barang = new java.util.LinkedList<String>();
        barang.add("komputer");
        barang.add("laptop");
        barang.add("radio");

        barang.remove(1);
        
        System.out.println(barang);

        if(barang.isEmpty()){
            System.out.println("data kosong");
        }
        else {
            System.out.println("data penuh");
        }

        if(barang.contains("komputer")){
            System.out.println("data ditemukan");
        }else{
            System.out.println("data tidak ditemukan");
        }
    }
}
