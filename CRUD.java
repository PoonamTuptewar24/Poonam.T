import java.sql.*;
import java.util.Scanner;
public class CRUD {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "tuptewar@24");
            Statement st = con.createStatement();

            int ch;
            do {
                System.out.println("\n----- CRUD Operations -----");
                System.out.println("1. Create");
                System.out.println("2. Retrieve");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Enter Choice : ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();
                        String q1 = "INSERT INTO student VALUES(" + id + ",'" + name + "')";
                        st.executeUpdate(q1);
                        System.out.println("Record Inserted Successfully");
                        break;
                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM student");

                        System.out.println("\nID\tNAME");
                        while (rs.next()) {
                            System.out.println(
                             rs.getInt("id") + "\t" +
                             rs.getString("name"));
                        }
                        break;
                    case 3:
                        System.out.print("Enter ID to Update : ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name : ");
                        String newName = sc.nextLine();
                        String q2 = "UPDATE student SET name='" + newName + "' WHERE id=" + uid;
                        st.executeUpdate(q2);
                        System.out.println("Record Updated Successfully");
                        break;
                    case 4:
                        System.out.print("Enter ID to Delete : ");
                        int did = sc.nextInt();
                        String q3 = "DELETE FROM student WHERE id=" + did;
                        st.executeUpdate(q3);
                        System.out.println("Record Deleted Successfully");
                        break;
                    case 5:
                        System.out.println("Program Ended");
                        con.close();
                        break;
                       default:System.out.println("Invalid Choice");
                }
            } while (ch != 5);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
