package strings;

class Temp {
    String val;

    // Constructor to create a new Temp object with a given value
    public Temp(String val) {
        this.val = val;
    }

    // Deep copy method
    public Temp deepCopy() {
        // Since `val` is a String (immutable), you can just assign it directly
        return new Temp(new String(this.val));  // Explicitly creating a new String object
    }

    public static void main(String[] args) {
        Temp a1 = new Temp("Rahul");
        Temp a2 = a1.deepCopy();  // Creating a deep copy of a1

        System.out.println(a2.val == a1.val); // This will now print false
        System.out.println(a2.val.equals(a1.val)); // This will print true
    }
}

