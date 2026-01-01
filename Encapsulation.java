class Student {
    // Private fields (encapsulated data)
    private int id;
    private String name;

    // Setter methods 
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s= new Student();
        
        // Using setters
        s.setId(101);
        s.setName("Debra");

        // Using getters
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}