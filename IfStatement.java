import java.util.Scanner;
public class IfStatement
{
    public static void main(String []  args)
    {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.print("Enter age:");
        age=input.nextInt();
        if (age>=18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not Adult");
        } 
    }
}
//this program briefly illustrates how to use if...else statements for selection
//Any input that is greater or equal to 18 will have an output of "Adult" 