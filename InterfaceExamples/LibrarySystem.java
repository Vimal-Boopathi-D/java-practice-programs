package InterfaceExamples;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryMember member = new LibraryMember();

        member.setUser("Alice", 101);
        member.displayUserInfo();

        member.borrowBook("Java Programming");
        member.returnBook("Java Programming");
    }
}
