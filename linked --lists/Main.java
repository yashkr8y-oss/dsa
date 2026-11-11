
class Person1 {

    // Private variables to store each person's information
    private String lastName;
    private String firstName;
    private int age;

    // Constructor: called when a new Person object is created
    public Person(String last, String first, int age) {
        firstName = first;
        lastName = last;
        this.age = age;
    }

    // Displays the details of a person
    public void displayPerson() {
        System.out.print(" Last Name of the person: " + lastName);
        System.out.print(", First Name of the person: " + firstName);
        System.out.println(", Age of the Given Person: " + age);
    }

    // Returns the person's last name
    // We use this method to compare last names during sorting
    public String getLast() {
        return lastName;
    }
}

class ArrayIn0b {

    // Array to store Person objects
    private Person[] a;

    // Keeps track of how many people are stored in the array
    private int nElems;

    // Constructor: creates an array with the given maximum capacity
    public ArrayIn0b(int max) {
        a = new Person[max];
        nElems = 0; // Initially, the array contains no people
    }

    // Adds a new Person object to the next available position
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++; // Increase the number of stored people
    }

    // Displays all the people currently stored in the array
    public void display() {
        for (int j = 0; j < nElems; j++) {
            a[j].displayPerson();
        }
    }

    // Sorts people alphabetically by their last names
    public void insertionSort() {

        int in, out;

        // Start at index 1 because the first element
        // (index 0) is considered sorted initially
        for (out = 1; out < nElems; out++) {

            // Save the person at the current out position
            // We must save this object before shifting elements
            Person temp = a[out];

            // Start comparing from the current out position
            in = out;

            // Continue while:
            // 1. in > 0 means there is an element to the left
            // 2. The previous person's last name comes after
            //    temp's last name alphabetically
            while (in > 0 &&
                   a[in - 1].getLast()
                       .compareTo(temp.getLast()) > 0) {

                // Shift the previous person one position right
                a[in] = a[in - 1];

                // Move one position to the left
                // to compare with the next previous person
                in--;
            }

            // Put the saved person into the correct position
            a[in] = temp;
        }
    }
}

// Main class: program execution starts here
public class Main {

    public static void main(String[] args) {

        // Create an array that can hold up to 10 people
        ArrayIn0b arr = new ArrayIn0b(10);

        // Insert four people into the array
        arr.insert("Smith", "John", 25);
        arr.insert("Brown", "Alice", 30);
        arr.insert("Wilson", "David", 22);
        arr.insert("Adams", "Mary", 28);

        // Display the original order
        System.out.println("Before sorting:"); 
        arr.display();

        // Sort the array by last name
        arr.insertionSort();

        // Display the sorted order
        System.out.println("\nAfter sorting:");
        arr.display();
    }
}
