package soalarray;
import java.util.Scanner;

public class soalarray1 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //Deklarasi array
    String[] murid = {"Dewabrata", "Ahmad Aqil", "Hanif", "Koswara", "Paulus", "Yudha", "Dewi", "Desi"};
    String arrayKeBerapa;
    System.out.print("Masukkan Array Berapa : ");
    arrayKeBerapa = scan.next();
    Integer result = Integer.parseInt(arrayKeBerapa);
    for(int i = 0; i < murid.length; i++) {
    	if( result == i ) {
    		System.out.println("Jumlah murid :"+murid.length);
    		System.out.print("Dan yang dipanggil :"+murid[i]);
    	}
    }

    //Menampilkan isi array pada indeks ke-2
//    System.out.println("Jumlah murid :"+murid.length+" Dan yang dipanggil :"+murid[3]);
    }
        
}

//package soalarray;
//import java.util.Scanner;
//
//public class soalarray4 {

//	public static void main(String[] args) {
//
//        String[] input = new String[8];
//
//        // membuat scanner
//        Scanner scan = new Scanner(System.in);
//
//        // mengisi data ke array
//        for( int i = 0; i < input.length; i++ ){
//            System.out.print("Input ke-" + i + ": ");
//            input[i] = scan.nextLine();
//        }
//
//        System.out.println("---------------------------");
//
//        // menampilkan semua isi array
//        System.out.println(input[2]);

//    }
//}