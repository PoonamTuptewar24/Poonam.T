import java.sql.*;
import java.util.Scanner;

public class DynamicCRUD {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "tuptewar@24");
            int ch;
            do {
                System.out.println("\n1.Create");
                System.out.println("2.Retrieve");
                System.out.println("3.Update");
                System.out.println("4.Delete");
                System.out.println("5.Exit");
                System.out.print("Enter Choice : ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();

                        PreparedStatement ps1 = con.prepareStatement("INSERT INTO student VALUES(?,?)");

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.executeUpdate();
                        System.out.println("Record Inserted");
                        break;
                    case 2:
                        PreparedStatement ps2 = con.prepareStatement("SELECT * FROM student");
                        ResultSet rs = ps2.executeQuery();
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                            rs.getString(2));
                        }
                        break;
                    case 3:
                        System.out.print("Enter ID : ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name : ");
                        String newName = sc.nextLine();
                        PreparedStatement ps3 = con.prepareStatement("UPDATE student SET name=? WHERE id=?");
                        ps3.setString(1, newName);
                        ps3.setInt(2, uid);
                        ps3.executeUpdate();
                        System.out.println("Record Updated");
                        break;
                    case 4:
                        System.out.print("Enter ID : ");
                        int did = sc.nextInt();
                        PreparedStatement ps4 = con.prepareStatement("DELETE FROM student WHERE id=?");
                        ps4.setInt(1, did);
                        ps4.executeUpdate();
                        System.out.println("Record Deleted");
                        break;
                    case 5:
                        con.close();
                        System.out.println("Program Ended");
                        break;
                }
            } while (ch != 5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
