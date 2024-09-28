import java.util.*;

class FusionFlavours_Chinese extends FusionFlavours 
{
    double bill, gst, totalv = 0, totalnv = 0, totalch=0;
    public double menu() 
    {
        totalv= 0;totalnv=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fushion Flavour's Chinese Corner");
        System.out.println("Enter V for Veg Chinese Dishes & N for Non Veg Chinese Dishes");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        switch (ch) 
        {
            case 'V': 
            {
                System.out.println("VEG CHINESE DISHES        \t\t\t\tPrice(Rs.)");
                System.out.println("1.Veg Manchurian Dry      \t\t\t\t  65");
                System.out.println("2.Veg Manchurian Gravy    \t\t\t\t  65");
                System.out.println("3.Paneer chilli           \t\t\t\t  65");
                System.out.println("4.Chilli Potato           \t\t\t\t  65");
                System.out.println("5.Veg Fried Rice          \t\t\t\t  80");
                System.out.println("6.Schezwan Fried rice     \t\t\t\t  80");
                System.out.println("7.Chowmin                 \t\t\t\t  80");
                System.out.println("8.Haaka noodles           \t\t\t\t  80");
                System.out.println("9.Triple Fried rice       \t\t\t\t  120");
                System.out.println("10.Triple Schezwan noodles\t\t\t\t  120");
                while (true) 
                {
                    System.out.println("Enter your Order nos : ");
                    int c = sc.nextInt();
                    System.out.println("Enter Quantity : ");
                    int q = sc.nextInt();
                    if (c >= 1 && c <= 4) 
                    {
                        bill = (q * 65);
                        gst = (0.18 * bill) + bill;
                        totalv = totalv + gst;
                    } 
                    else if (c > 4 && c <= 8) 
                    {
                        bill = (q * 80);
                        gst = (0.18 * bill) + bill;
                        totalv = totalv + gst;
                    } 
                    else if (c > 8 && c <= 10) 
                    {
                        bill = (q * 120);
                        gst = (0.18 * bill) + bill;
                        totalv = totalv + gst;
                    } 
                    else
                        System.out.println("Invalid Choice");
                    System.out.println("Any more Orders (Y/N) : ");
                    char y = sc.next().charAt(0);
                    y = Character.toUpperCase(y);
                    if (y == 'Y')
                        continue;
                    else if (y == 'N')
                        break;
                    else
                        System.out.println("Invalid Choice");
                }
                //System.out.println("Total Veg Chinese Bill : " + totalv);
                break;
            }
            
            case 'N': 
            {
                System.out.println("NON-VEG CHINESE DISHES        \t\t\t\tPrice(Rs.)");
                System.out.println("1.Chilli Chicken Dry          \t\t\t\t  80");
                System.out.println("2.Chilli Chicken Gravy        \t\t\t\t  80");
                System.out.println("3.Egg Fried Rice              \t\t\t\t  90");
                System.out.println("4.Egg schezwan Fried Rice     \t\t\t\t  90");
                System.out.println("5.Chicken haaka noodles       \t\t\t\t  100");
                System.out.println("6.Chicken Chowmin             \t\t\t\t  100");
                System.out.println("7.Chicken 65                  \t\t\t\t  120");
                System.out.println("8.Chicken Lolly Pop           \t\t\t\t  120");
                System.out.println("9.Chicken triple Schezwan Rice\t\t\t\t  150");
                while (true) 
                {
                    System.out.println("Enter your Order nos : ");
                    int c = sc.nextInt();
                    System.out.println("Enter Quantity : ");
                    int q = sc.nextInt();
                    if (c >= 1 && c <= 2) 
                    {
                        bill = (q * 80);
                        gst = (0.18 * bill) + bill;
                        totalnv = totalnv + gst;
                    } 
                    else if (c > 2 && c <= 4) 
                    {
                        bill = (q * 90);
                        gst = (0.18 * bill) + bill;
                        totalnv = totalnv + gst;
                    } 
                    else if (c > 4 && c <= 6) 
                    {
                        bill = (q * 100);
                        gst = (0.18 * bill) + bill;
                        totalnv = totalnv + gst;
                    } 
                    else if (c > 6 && c <= 8) 
                    {
                        bill = (q * 120);
                        gst = (0.18 * bill) + bill;
                        totalnv = totalnv + gst;
                    } 
                    else if (c == 9) 
                    {
                        bill = (q * 150);
                        gst = (0.18 * bill) + bill;
                        totalnv = totalnv + gst;
                    } 
                    else
                        System.out.println("Invalid Choice");
                    System.out.println("Any more Orders (Y/N) : ");
                    char y = sc.next().charAt(0);
                    y = Character.toUpperCase(y);
                    if (y == 'Y')
                        continue;
                    else if (y == 'N')
                        break;
                    else
                        System.out.println("Invalid Choice");
                }
                //System.out.println("\n\t\tTotal Non-Veg Chinese Bill : " + totalnv);
                break;
            }
            default:
                System.out.println("Invalid Choice");
        }
        return totalch;
    }
    
    double displayBill() 
    {
        totalch = totalv + totalnv;
        System.out.println("\n\tTotal Chinese Cuisine Bill incl. GST is : " + totalch);
        return totalch;
    }
}
