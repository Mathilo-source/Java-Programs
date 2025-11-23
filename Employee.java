public class Employee
{
    public String name;
    public String address;
    public int idno;
    public int nssfno;
    public double salary;
    public void mailcheque()
    {
        System.out.println("Mailing cheque to" +name + "\n" +address);
    }
    public double computepay()
    {
        return salary/52;
    }
}
class TestEmployee
{
    public static void main(String[] args) 
{
   Employee e= new Employee(); 
   e.name= "John"; 
   e.mailcheque();
}
}