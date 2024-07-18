class Person {
    // Properties
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        // Instantiate an object of the Person class
        Person person = new Person("John Doe", 30);
        
        // Call the displayDetails method
        person.displayDetails();
    }
}
