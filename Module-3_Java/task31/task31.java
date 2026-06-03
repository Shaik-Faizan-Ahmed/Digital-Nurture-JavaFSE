import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class task31 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:school.db";

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connected to database successfully.");

            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE IF NOT EXISTS students (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "name TEXT NOT NULL, " +
                         "age INTEGER NOT NULL)");

            stmt.execute("INSERT OR IGNORE INTO students (id, name, age) VALUES (1, 'Alice', 20)");
            stmt.execute("INSERT OR IGNORE INTO students (id, name, age) VALUES (2, 'Bob', 22)");
            stmt.execute("INSERT OR IGNORE INTO students (id, name, age) VALUES (3, 'Charlie', 19)");

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("\nStudents Table:");
            System.out.println("ID | Name    | Age");
            System.out.println("---|---------|----");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  | " +
                                   rs.getString("name") + "   | " +
                                   rs.getInt("age"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
