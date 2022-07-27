package bootcamp;

import java.util.*;

public class MediaPonderada {
	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int sPesos = 2 + 3 + 5;
     int casos = input.nextInt();
     int cont = 0;
     while (cont < casos) {

         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();

   
         double mediaPonderada = ((a * 2) + (b * 3) + (c * 5)) / sPesos;
         System.out.printf("%.1f\n", mediaPonderada);
         
         cont++;
     	}
         
	}

}
