import java.util.*;

class FusionFlavours_Cafe extends FusionFlavours {
    double bill, gst, totalpi=0, totalpa=0, totalmi=0, totalc=0;
    public double menu()
    {
        totalpi = 0;totalpa=0;totalmi=0;
        Scanner sc = new Scanner(System.in);
        int n;
        char v;
        System.out.println("WELCOME TO FUSHION FLAVOURS CAFE");
        System.out.println("Enter\t1 for Pizzas\t2 for Pastas\t3 for Milkshakes");
        n = sc.nextInt();
        switch (n) 
        {
            case 1: 
            {
                System.out.println("Enter V for Veg Pizza or N for Non Veg Pizza");
                v = sc.next().charAt(0);
                v = Character.toLowerCase(v);
                if (v == 'v') 
                {
                    System.out.println("Veg Pizzas(8')          \t\t\t\tPrice(Rs.)\n");
                    System.out.println("1.Margherita Pizza      \t\t\t\t  129");
                    System.out.println("2.Farmhouse Pizza       \t\t\t\t  259");
                    System.out.println("3.Peri Peri Paneer Pizza\t\t\t\t  259");
                    while (true) 
                    {
                        System.out.println("Enter your Order nos : ");
                        int c = sc.nextInt();
                        System.out.println("Enter Quantity : ");
                        int q = sc.nextInt();
                        if (c == 1)
                        {
                            bill = (q * 129);
                            gst = (0.18 * bill);
                            totalpi+= bill + gst;
                        }
                        else if (c > 1 && c <= 3) 
                        {
                            bill = (q * 259);
                            gst = (0.18 * bill);
                            totalpi+= bill + gst;
                        } 
                        else
                            System.out.println("Invalid Choice");
                        System.out.println("Any more Orders Y or N : ");
                        char y = sc.next().charAt(0);
                        y = Character.toUpperCase(y);
                        if (y == 'Y')
                            continue;
                        else if (y == 'N')
                            break;
                        else
                            System.out.println("Invalid Choice");
                    }
                    System.out.println("\n\tTotal Pizza Bill : " + totalpi);
                } 
                else if (v == 'n') 
                {
                    System.out.println("Non Veg Pizzas(8')           \t\t\t\tPrice(Rs.)\n");
                    System.out.println("1.Chicken Sausage Pizza      \t\t\t\t  199");
                    System.out.println("2.Spiced Double Chicken Pizza\t\t\t\t  359");
                    System.out.println("3.Chicken Dominator Pizza    \t\t\t\t  359");
                    while (true) 
                    {
                        System.out.println("Enter your Order nos : ");
                        int c = sc.nextInt();
                        System.out.println("Enter Quantity : ");
                        int q = sc.nextInt();
                        if (c == 1) 
                        {
                            bill = (q * 199);
                            gst = (0.18 * bill);
                            totalpi+= bill + gst;
                        } else if (c > 1 && c <= 3) 
                        {
                            bill = (q * 359);
                            gst = (0.18 * bill);
                            totalpi+= bill + gst;
                        } 
                        else
                            System.out.println("Invalid Choice");
                        System.out.println("Any more Orders Y or N : ");
                        char y = sc.next().charAt(0);
                        y = Character.toUpperCase(y);
                        if (y == 'Y')
                            continue;
                        else if (y == 'N')
                            break;
                        else
                            System.out.println("Invalid Choice");
                    }
                    System.out.println("\n\tTotal Pizza Bill : " + totalpi);
                } 
                else
                    System.out.println("Invalid Choice");
                break;
            }
            case 2: 
            {
                System.out.println("Pastas             \t\t\t\tPrice(Rs.)\n");
                System.out.println("1.Red Sauce Pasta  \t\t\t\t  320");
                System.out.println("2.White Sauce Pasta\t\t\t\t  320");
                System.out.println("3.Pink Sauce Pasta \t\t\t\t  320");
                while (true)
                {
                    System.out.println("Enter your Order nos : ");
                    int c = sc.nextInt();
                    System.out.println("Enter Quantity : ");
                    int q = sc.nextInt();
                    if (c >=1 && c <= 3) 
                    {
                        bill = (q * 320);
                        gst = (0.18 * bill);
                        totalpa+= bill + gst;
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
                System.out.println("\n\tTotal Pasta Bill : " + totalpa);
                break;
            }
            case 3:
            {
                System.out.println("COFFEE      \t\t\t\tPrice(Rs.)  \t\t\t\tTEA        \t\t\t\tPrice(Rs.)\n");
                System.out.println("1.Americano \t\t\t\t  150       \t\t\t\t5.Green Tea\t\t\t\t  120");
                System.out.println("2.Cappucino \t\t\t\t  150       \t\t\t\t6.Honey Tea\t\t\t\t  120");
                System.out.println("3.Cafe Latte\t\t\t\t  150       \t\t\t\t7.Black Tea\t\t\t\t  120");
                System.out.println("4.Macchiato \t\t\t\t  150       \t\t\t\t8.Milk  Tea\t\t\t\t  120\n");
                System.out.println("SNACKS        \t\t\t\tPrice(Rs.)  \t\t\t\tMILKSHAKES             \t\t\t\tPrice(Rs.)\n");
                System.out.println("9.Muffin      \t\t\t\t  250       \t\t\t\t13.Oreo Milkshake      \t\t\t\t  120");
                System.out.println("10.Pasteries  \t\t\t\t  250       \t\t\t\t14.Chocolate Shake     \t\t\t\t  120");
                System.out.println("11.Choco Fudge\t\t\t\t  300       \t\t\t\t15.Strawberry Milkshake\t\t\t\t  120");
                System.out.println("12.Cheesecake \t\t\t\t  300       \t\t\t\t16.Mango Milkshake     \t\t\t\t  120");
                while (true) 
                {
                    System.out.println("Enter your Order nos : ");
                    int c = sc.nextInt();
                    System.out.println("Enter Quantity : ");
                    int q = sc.nextInt();
                    if (c >= 1 && c <= 4) 
                    {
                        bill = (q * 150);
                        gst = (0.18 * bill);
                        totalmi+= bill + gst;
                    } else if (c > 4 && c <= 8)
                    {
                        bill = (q * 120);
                        gst = (0.18 * bill);
                        totalmi+= bill + gst;
                    } else if (c > 8 && c <= 10)
                    {
                        bill = (q * 250);
                        gst = (0.18 * bill);
                        totalmi+= bill + gst;
                    } else if (c > 10 && c <= 12) 
                    {
                        bill = (q * 300);
                        gst = (0.18 * bill);
                        totalmi += bill + gst;
                    } else if (c > 12 && c <= 16) 
                    {
                        bill = (q * 120);
                        gst = (0.18 * bill);
                        totalmi += bill + gst;
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
                System.out.println("\n\tTotal Milkshakes Bill : " + totalmi);
                break;
            }
        }
        return totalc;
    }
    double displayBill() 
    {
        totalc = (totalpi + totalpa + totalmi);
        System.out.println("\n\tTotal Italian Cuisine Bill incl. GST is : " + totalc);
        return totalc;
    }
}
