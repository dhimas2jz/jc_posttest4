package soalarray;
import java.util.Scanner;

public class soalarray4 {

	public static void main(String[] args) {

        String[] input = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < input.length; i++ ){
            System.out.print("Input ke-" + i + ": ");
            input[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        System.out.println(input[2]);

    }
}