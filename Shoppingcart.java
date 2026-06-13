import java.util.*;
public class Shoppingcart {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<String>();

        int ch;
        do
        {
            System.out.println("1.Add Product");
            System.out.println("2.View Cart");
            System.out.println("3.Remove Product");
            System.out.println("4.Total Products");
            System.out.println("5.Exit");
            System.out.print("Enter Choice : ");
            ch = sc.nextInt();
            sc.nextLine();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter Product Name : ");
                    String p = sc.nextLine();
                    cart.add(p);
                    System.out.println("Product Added");
                    break;
                case 2:
                    System.out.println("Products in Cart");
                    for(String item : cart)
                    {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    System.out.print("Enter Product Name to Remove : ");
                    String r = sc.nextLine();
                    cart.remove(r);
                    System.out.println("Product Removed");
                    break;
                case 4:
                    System.out.println("Total Products = " + cart.size());
                    break;
                case 5:
                    System.out.println("Thank You");
                    break;
                default:System.out.println("Invalid Choice");
            }

        }while(ch != 3);
    }
}
