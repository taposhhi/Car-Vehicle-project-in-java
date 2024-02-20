package pack;
import java.util.Scanner;
public class Car {
    public static void main(String[] args) {

        //creating vehicle class object
        Vehicle skoda = new Vehicle();
        Vehicle volkswagen = new Vehicle();
        Vehicle porsche = new Vehicle();

        //initialized skoda's features
        skoda.seatCapacity = 4;
        skoda.fueltype="diesel";
        skoda.fuelQuantity=40.00F;
        skoda.isAc=false;

        //initialized volkswagen's features
        volkswagen.seatCapacity = 4;
        volkswagen.fueltype="petrol";
        volkswagen.fuelQuantity=38.00F;
        volkswagen.isAc=false;

        //initialized porsches features
        porsche.seatCapacity = 4;
        porsche.fueltype="petrol";
        porsche.fuelQuantity=40.00F;
        porsche.isAc=false;

        System.out.println("Which car you want to drive ?\n1.Skoda\n2.Volkswagen\n3.Porsche");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        switch(n) {
            case 2 :{
                volkswagen.start(volkswagen.fueltype, volkswagen.fuelQuantity, volkswagen.isAc);
                break;
            }
            case 1 :{
                skoda.start(skoda.fueltype, skoda.fuelQuantity, skoda.isAc);
                break;
            }
            case 3 :{
                porsche.start(porsche.fueltype,porsche.fuelQuantity, porsche.isAc);
                break;
            }

        }

    }

}
