/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traffic.light;
import java.util.Scanner;
/**
 *
 * @author onurs
 */
public class TrafficLight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner UserInput = new Scanner(System.in);
        String input;
                try{
                    System.out.println("Enter the color of the traffic light");
                    input = UserInput.nextLine();
                    switch (input) {
                        case "red":
                            System.out.println("STOP");
                            break;
                        case "orange":
                            System.out.println("SLOW DOWN");
                            break;
                        case "green":
                            System.out.println("KEEP GOING");
                            break;
                    
                    }
                }
    catch (Exception e){
        System.out.println("only enter a color");
    }
    }
    
    
}
