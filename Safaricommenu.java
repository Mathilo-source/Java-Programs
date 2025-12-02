import java.util.Scanner;
public class Safaricommenu
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("1.Buy airtime");
        System.out.println("2.Data B-live");
        System.out.println("3.MakeUrHook");
        System.out.println("4.My Dealz");
        System.out.println("5.Social Bundles");
        System.out.println("Enter a choice between 1 and 5:");
        int i=input.nextInt();
        switch(i)
        {
            case 1:
                System.out.println("Buy airtime selected");
                break;
            case 2:
                System.out.println("Data B-live selected");
                break;
            case 3:
                System.out.println("MakeUrHook selected");
                break;
            case 4:
                System.out.println("My Dealz selected");
                break;
            case 5:
                System.out.println("Social Bundles selected");
                break;
            default:
                System.out.println("Invalid selection");
        }

    }
}