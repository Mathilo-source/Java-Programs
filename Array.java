import java.util.Scanner;
public class Array
{
    public static void main(String [] args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter number of temp values:");
        int size=keyboard.nextInt();
        double []temp=new double[size];
        System.out.println("Enter the temperature values:");
        for (int i=0;i<temp.length;i++)
        {
            temp[i]=keyboard.nextDouble();
        }
        for (int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    
    }
}