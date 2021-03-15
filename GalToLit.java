package StudyPage;

import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {
        double gallon;
        double litter;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inputkan Gallon :");
        gallon = input.nextDouble();
        
        litter = gallon * 3785;
        
        System.out.println(gallon + " Gallon ke litter adalah " + litter + " litter");
        
    }
    
}
