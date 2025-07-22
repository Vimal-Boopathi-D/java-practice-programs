package InterfaceExamples;

class LibraryMember implements BookOperations, UserInfo, Notification {
    private String name;
    private int userId;

    @Override
    public void setUser(String name, int id) {
        this.name = name;
        this.userId = id;
        System.out.println("User registered: " + name + " (ID: " + id + ")");
    }

    @Override
    public void displayUserInfo() {
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("User ID: " + userId);
    }

    @Override
    public void borrowBook(String bookName) {
        System.out.println(name + " borrowed: " + bookName);
        sendNotification("Reminder: Return '" + bookName + "' within 14 days.");
    }

    @Override
    public void returnBook(String bookName) {
        System.out.println(name + " returned: " + bookName);
        sendNotification("Thank you for returning '" + bookName + "'.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }
}



