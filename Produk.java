package inventory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Produk {
    Scanner input = new Scanner(System.in);
    int alls;

    int numbers[] = new int[100];
    String names[] = new String[100];
    int prices[] = new int[100];
    int stocks[] = new int[100];
    int values[] = new int[100];

    public Produk() {

    }

    public void inputData() {
        try {
            for (int i = 0; i < alls; i++) {
                System.out.println("Nomor barang -" + (i + 1));
                System.out.print("Masukkan nama barang, tekan 0 untuk membatalkan : ");

                input.nextLine();
                numbers[i] = i + 1;
                names[i] = input.nextLine();

                if (names[i].equals("0")) {
                    break;
                }

                System.out.print("Masukkan harga barang : ");
                prices[i] = input.nextInt();
                System.out.print("Masukkan jumlah barang : ");
                stocks[i] = input.nextInt();
                values[i] = stocks[i] * prices[i];
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Anda salah inputkan ");
            input.nextLine();
            menu();
        }
    }

    public void menu() {
        do {
            System.out.print("Masukkan nomor barang : ");
            alls = input.nextInt();

            if(alls <= 0) {
                System.out.println("Input harus lebih dari 0");
            } else {
                inputData();
            }
        } while(alls <= 0);
    }

    public void getDataValue() {
        for (int i = 0; i < alls; i++) {
            System.out.println("Nomor barang : " + numbers[i]);
            System.out.println("Nama barang : " + names[i]);
            System.out.println("Harga barang : " + prices[i]);
            System.out.println("Jumlah barang : " + stocks[i]);
            System.out.println("Total harga : " + values[i]);
        }
    }
}