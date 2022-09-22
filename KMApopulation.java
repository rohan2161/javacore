public class KMApopulation {
    public static void main(String args[])
    {
        double initial = 175000;
       double current = 262500;
        double time = 10;
        double diff = current-initial;
        double PG = diff/initial*100;
         double PGR = PG/time;
        System.out.println("The Population Growth Rate in KMA is "+PGR+"% per year");
    }
}