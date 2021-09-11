/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscope;
import java.util.Scanner;

/**
 *
 * @author estel
 */
public class Horoscope {

    /**
     * @param args the command line arguments
     */
    static enum colors {
        green, red, yellow, white, black
    }
    
    static enum animals {
        rat, ox, tiger, rabbit, dragon, snake, horse, sheep, monkey, hen, dog, pig
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your year: ");
        int year = scanner.nextInt();
        System.out.println("Your year is "+year);
        int placein_cycle = (year-1984)%60;
        int animal = placein_cycle%12;
        int color = placein_cycle/12;
        System.out.println(year+" is the year of "+colors.values()[color]+" "+animals.values()[animal]);
    }
    
}
