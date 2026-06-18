import java.sql.*;
import java.util.Scanner;
public class fetchdata {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/hey",
                    "postgres",
                    "tuptewar@24");

            System.out.println("Static Query Result:");
            PreparedStatement ps1 = con.prepareStatement("SELECT * FROM student");
            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {
                System.out.println(rs1.getInt(1)+"\t"+ rs1.getString(2));
            }

            System.out.print("\nEnter Student ID : ");
            int id = sc.nextInt();
            PreparedStatement ps2 =con.prepareStatement("SELECT * FROM student WHERE id=?");
            ps2.setInt(1, id);
            ResultSet rs2 = ps2.executeQuery();
            System.out.println("\nDynamic Query Result:");

            while (rs2.next()) {
                System.out.println(
                        rs2.getInt(1)+"\t"+rs2.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
