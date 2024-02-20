package pack;
import java.util.Scanner;
public class Vehicle {
    //properties
    int seatCapacity;
    String fueltype;
    float fuelQuantity;
    boolean isAc;
    Scanner scan=new Scanner(System.in);

    public void start(String c,float q,boolean r){          //method start
        System.out.println("Your car is on its way  ");
        System.out.println("#Current condition of fuel and ac");
        System.out.println("\tFuel Type is : "+c);
        System.out.println("\t  -Capacity  ->50.00 litre");
        System.out.println("\t  -current Quantity  -> "+q);
        System.out.println("\t  -Ac is "+(r?"On":"Off"));
        System.out.println("\n1.Add fuel\n2.Control AC\n3.stop checking");
        //Scanner scan=new Scanner(System.in);
        int w=scan.nextInt();
        if(w==1) addfuel(q);
        else if(w==2) acOnOff();
        else stop();

    }
    public void stop(){                                     //method stop
        System.out.println("Stoped checking further information");
    }
    public void addfuel(float q){                           //method addFuel
        float full=50.00F;
        float capa=full-q;
        System.out.println("How much fuel do you want to add?");
        float f=scan.nextFloat();
        if(f<=capa){
            System.out.println("Fuel added");
        }
        else {
            System.out.println("fuel added "+(capa)+" litre , the remaining fuel could not be added");
        }



    }
    public void acOnOff(){                                  //method acOnOff
        System.out.println("1.Turn On the AC");
        int on=scan.nextInt();
        if(on==1){
            System.out.println("Set temperature : ");
            int temp=scan.nextInt();
            System.out.println("Ac turned On and temperature is "+temp);

        }
    }


}
