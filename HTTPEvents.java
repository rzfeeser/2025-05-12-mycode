// HTTPEvents class demonstrating static and instance methods
public class HTTPEvents {
    
    // Static Method 1 - Can be called without creating an object
    // static methods belong to the class in which they live
    public static void connect() {
        System.out.println("🔗 Establishing HTTP connection...");
    }

    // Static Method 2 - Can be called without creating an object
    public static void disconnect() {
        System.out.println("❌ Closing HTTP connection...");
    }

    // Instance Method 1 - Requires an object
    public void sendRequest() {
        System.out.println("📤 Sending HTTP request...");
    }

    // Instance Method 2 - Requires an object
    public void receiveResponse() {
        System.out.println("📥 Receiving HTTP response...");
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        // Calling static methods without creating an object
        HTTPEvents.connect();  // this is best practice-- always cite the class
        connect(); // java looks for a local method (not this example)
                   // a method in the class <--- this line does this
                   // a method in the parent class (not this example)
        
        // Creating an object of HTTPEvents to call instance methods
        HTTPEvents http = new HTTPEvents();
        http.sendRequest();
        http.receiveResponse();
        
        // Calling the static method again without an object
        HTTPEvents.disconnect();
    }
}

