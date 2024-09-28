import java.util.*;
class FusionFlavours 
{
    double totalin=0, totalc=0, totalch=0;

    void order() 
    {
        Scanner sc = new Scanner(System.in);
        FusionFlavours_Indian in = new FusionFlavours_Indian();
        FusionFlavours_Cafe cf = new FusionFlavours_Cafe();
        FusionFlavours_Chinese chi = new FusionFlavours_Chinese();
        
        System.out.println("\n\t\t\t\t\t\t\tWELCOME TO FUSION FLAVOURS MULTICUISINE RESTAURANT\n");
        char n;
        do 
        {
            System.out.println("Choose a Cuisine Type:");
            System.out.println("1. Indian");
            System.out.println("2. Chinese");
            System.out.println("3. Italian");
            
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    in.menu();
                    totalin += in.displayBill();
                    break;
                case 2:
                    chi.menu();
                    totalch += chi.displayBill();
                    break;
                case 3:
                    cf.menu();
                    totalc += cf.displayBill();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println("Would you like to order from another cuisine? (Y/N)");
            n = sc.next().charAt(0);
            n=Character.toUpperCase(n);
        } 
        while (n == 'Y');
    }
    
    void displayBill1() 
    {
        double total = totalin + totalc + totalch;
        System.out.println("\n\t\t\t\tTOTAL BILL incl. of GST : \t₹" + total);
    }

    public static void main(String args[]) 
    {
        FusionFlavours f = new FusionFlavours();
        f.order();
        f.displayBill1();
    }
}

