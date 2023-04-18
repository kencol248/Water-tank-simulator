// Kenyah Collins, 2/19/2023, The purpose of this program is to simulate a water tank that holds gallons of water from 0 to a max, excess water gets "dumped". This program makes use of classes and objects.

public class Main {
    public static void main (String[] args) {

        //title
        System.out.println();
        System.out.println("\tWater Tank Simulator");
        System.out.println();

        //created an object of WaterTank
        WaterTank tank = new WaterTank(350,300);

        tank.print();
        System.out.println();
        tank.add(100);
        tank.drain(180);

        tank.print();
        System.out.println();
        tank.add(60);
        tank.drain(200);

        tank.print();
        System.out.println();
        tank.drain(50);
        tank.add(375);
        tank.drain(142);

        tank.print();
        System.out.println();
    }
}
