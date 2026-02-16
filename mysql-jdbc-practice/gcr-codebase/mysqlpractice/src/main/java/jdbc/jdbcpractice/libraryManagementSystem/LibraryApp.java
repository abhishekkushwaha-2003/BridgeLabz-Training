package jdbc.jdbcpractice.libraryManagementSystem;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        BorrowDAO borrowDAO = new BorrowDAO();

        while (true) {

            System.out.println(
                    "1. Search by Book Name\n" +
                    "2. Search by Category\n" +
                    "3. Issue Book\n" +
                    "4. Return Book\n" +
                    "5. Exit"
            );

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Book Name: ");
                    bookDAO.searchByName(sc.nextLine());
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Category: ");
                    bookDAO.searchByCategory(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    borrowDAO.issueBook(sid, bid);
                    break;

                case 4:
                    System.out.print("Issue ID: ");
                    borrowDAO.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
