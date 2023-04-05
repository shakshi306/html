 interface vehicle
          {void wheel();}
    interface fueltype extends vehicle
          {void fuel();}
    class Bike implements fueltype
    {
        public void wheel()
        {System.out.println("A bike has 2 wheels");}
        public void fuel()
        {System.out.println("Petrol");}
        public static void main(String args[])
        {Bike B1=new Bike();
         B1.wheel();
         B1.fuel();
         }
}

 
