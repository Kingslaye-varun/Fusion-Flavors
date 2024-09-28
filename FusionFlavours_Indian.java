import java.util.*;
class FusionFlavours_Indian extends FusionFlavours 
{
    String inch;
    int vnv;
    double bill, gst, totals = 0, totalm = 0, totald = 0, totalin=0;
    public double menu() 
    {
        totals = 0;totalm=0;totald=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO FUSION FLAVOURS INDIAN CORNER");
        System.out.println("Enter for Starter\nEnter for Main Course\nEnter for Desserts");
        inch = sc.nextLine();
        inch = inch.toLowerCase();
        switch (inch) 
        {
            case "main course": 
            {
                System.out.println("Enter 1 for Veg\t2 for Non Veg");
                vnv = sc.nextInt();
                if (vnv == 1) 
                {
                    System.out.println("Veg Sabzi             \t\t\t\tPrice(Rs.)        \t\t\t\tIndian Breads   \t\t\t\tPrice(Rs.)");
                    System.out.println("1.Paneer Butter Masala\t\t\t\t   250            \t\t\t\t08.Chapati      \t\t\t\t  20");
                    System.out.println("2.Paneer Tikka Masala \t\t\t\t   250            \t\t\t\t09.Tawa Roti    \t\t\t\t  20");
                    System.out.println("3.Paneer Makhanwala   \t\t\t\t   250            \t\t\t\t10.Tandori Roti \t\t\t\t  30");
                    System.out.println("4.Paneer Lababdaar    \t\t\t\t   270            \t\t\t\t11.Butter Roti  \t\t\t\t  30");
                    System.out.println("5.Palak  Paneer       \t\t\t\t   270            \t\t\t\t12.Plain Naan   \t\t\t\t  30");
                    System.out.println("6.Veg Kolhapuri       \t\t\t\t   300            \t\t\t\t13.Butter Naan  \t\t\t\t  40");
                    System.out.println("7.Kadhai Paneer       \t\t\t\t   300            \t\t\t\t14.Tandoor Naan \t\t\t\t  40");
                    while (true) 
                    {
                        System.out.println("Enter your Order nos : ");
                        int c = sc.nextInt();
                        System.out.println("Enter Quantity : ");
                        int q = sc.nextInt();
                        if (c >= 1 && c <= 3) 
                        {
                            bill = (q * 250);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c > 3 && c <= 5) 
                        {
                            bill = (q * 270);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c >= 6 && c <= 7)
                        {
                            bill = (q * 300);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c >= 8 && c <= 9)
                        {
                            bill = (q * 20);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } else if (c >= 10 && c <= 12) 
                        {
                            bill = (q * 30);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        }
                        else if (c >= 13 && c <= 14) 
                        {
                            bill = (q * 40);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
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
                } 
                else if (vnv == 2) 
                {
                    System.out.println("NON-VEG Sabzi         \t\t\t\tPrice(Rs.)        \t\t\t\tIndian Breads  \t\t\t\tPrice(Rs.)");
                    System.out.println("1.Butter Chicken      \t\t\t\t   250            \t\t\t\t8.Chapati      \t\t\t\t  20");
                    System.out.println("2.Chicken Handi       \t\t\t\t   250            \t\t\t\t9.Tawa Roti    \t\t\t\t  20");
                    System.out.println("3.Chicken Biryani     \t\t\t\t   250            \t\t\t\t10.Tandori Roti\t\t\t\t  30");
                    System.out.println("4.Mutton Biryani      \t\t\t\t   300            \t\t\t\t11.Butter Roti \t\t\t\t  30");
                    System.out.println("5.Mutton Handi        \t\t\t\t   300            \t\t\t\t12.Plain Naan  \t\t\t\t  30");
                    System.out.println("6.Murg Masallam       \t\t\t\t   250            \t\t\t\t13.Butter Naan \t\t\t\t  40");
                    System.out.println("7.Masala Prawns       \t\t\t\t   350            \t\t\t\t14.Tandoor Naan\t\t\t\t  40");
                    while (true) 
                    {
                        System.out.println("Enter your Order nos : ");
                        int c = sc.nextInt();
                        System.out.println("Enter Quantity : ");
                        int q = sc.nextInt();
                        if (c >= 1 && c <= 3) 
                        {
                            bill = (q * 250);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c > 3 && c <= 5)
                        {
                            bill = (q * 300);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c >= 6 && c <= 7) 
                        {
                            bill = (q * 350);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c >= 8 && c <= 9)
                        {
                            bill = (q * 20);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c >= 10 && c <= 12)
                        {
                            bill = (q * 30);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
                        } 
                        else if (c >= 13 && c <= 14) 
                        {
                            bill = (q * 40);
                            gst = (0.18 * bill) + bill;
                            totalm = totalm + gst;
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
                } 
                else 
                {
                    System.out.println("Invalid Choice");
                }
                break;
            }
            case "starter":
            {
                System.out.println("Enter 1 for Veg\t2 for Non Veg");
                vnv = sc.nextInt();
                if (vnv == 1) 
                {
                    System.out.println("Item               \t\t\t\tPrice(Rs.)");
                    System.out.println("1.Masala Papad     \t\t\t\t 25");
                    System.out.println("2.Masala Pav       \t\t\t\t 25");
                    System.out.println("3.Paneer Tikka     \t\t\t\t 150");
                    System.out.println("4.Paneer Crispy    \t\t\t\t 150");
                    System.out.println("5.Mushroom Chilli  \t\t\t\t 200");
                    System.out.println("6.Veg Lollipop     \t\t\t\t 200");
                    System.out.println("7.Cheese Corn Balls\t\t\t\t 250");
                    while (true)
                    {
                        System.out.println("Enter your Order nos : ");
                        int c = sc.nextInt();
                        System.out.println("Enter Quantity : ");
                        int q = sc.nextInt();
                        if (c >= 1 && c <= 2)
                        {
                            bill = (q * 25);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
                        }
                        else if (c > 2 && c <= 4)
                        {
                            bill = (q * 150);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
                        }
                        else if (c > 4 && c <= 6) 
                        {
                            bill = (q * 200);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
                        }
                        else if (c == 7)
                        {
                            bill = (q * 250);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
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
                } 
                else if (vnv == 2) 
                {
                    System.out.println("Item                    \t\t\t\tPrice(Rs.)");
                    System.out.println("1.Chicken Crispy        \t\t\t\t 200");
                    System.out.println("2.Tandoori Chicken Wings\t\t\t\t 200");
                    System.out.println("3.Fish Amritsari        \t\t\t\t 220");
                    System.out.println("4.Mutton Seekh Kebab    \t\t\t\t 220");
                    System.out.println("5.Prawn Pakora          \t\t\t\t 250");
                    System.out.println("6.Chilli Chicken        \t\t\t\t 250");
                    System.out.println("7.Chicken Tikka         \t\t\t\t 300");
                    while (true)
                    {
                        System.out.println("Enter your Order nos : ");  
                        int c = sc.nextInt();
                        System.out.println("Enter Quantity : ");
                        int q = sc.nextInt();
                        if (c >= 1 && c <= 2) 
                        {
                            bill = (q * 200);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
                        } else if (c > 2 && c <= 4) 
                        {
                            bill = (q * 220);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
                        } 
                        else if (c > 4 && c <= 6) 
                        {
                            bill = (q * 250);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst;
                        } 
                        else if (c == 7) 
                        {
                            bill = (q * 300);
                            gst = (0.18 * bill) + bill;
                            totals = totals + gst; 
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
                } 
                else 
                {
                    System.out.println("Invalid Choice");
                }
                break;
            }
            case "dessert": 
            {
                System.out.println("Indian Desserts    \t\t\t\tPrice(Rs.)\n");
                System.out.println("1.Gulabjamun       \t\t\t\t  75");
                System.out.println("2.Ice Cream        \t\t\t\t  75");
                System.out.println("3.Chocolate Brownie\t\t\t\t  75");
                System.out.println("4.Fruit Salad      \t\t\t\t  150");
                System.out.println("5.Gajar Halwa      \t\t\t\t  150");
                System.out.println("6.Moong Halwa      \t\t\t\t  150");
                System.out.println("7.Matka Rabdi      \t\t\t\t  150");
                while (true) 
                {
                    System.out.println("Enter your Order nos : ");
                    int c = sc.nextInt();
                    System.out.println("Enter Quantity : ");
                    int q = sc.nextInt();
                    if (c >= 1 && c <= 3) 
                    {
                        bill = (q * 75);
                        gst = (0.18 * bill) + bill;
                        totald = totald + gst;
                    } else if (c > 3 && c <= 7)
                    {
                        bill = (q * 150);
                        gst = (0.18 * bill) + bill;
                        totald = totald + gst;
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
                break;
            }
            default: 
            {
                System.out.println("Invalid Choice");
            }
        }
        return totalin;
    }
    double displayBill() 
    {
        totalin = totals + totalm + totald;
        System.out.println("\n\tTotal Indian Cuisine Bill incl. of GST : " + totalin);
        return totalin;
    }
}
