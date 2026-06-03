import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class StudentDAO {
    private Connection conn;

    StudentDAO(Connection conn) {
        this.conn = conn;
    }

    void insertStudent(String name, int age) throws Exception {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.executeUpdate();
        System.out.println("Inserted: " + name + ", Age: " + age);
        ps.close();
    }

    void updateStudent(int id, String newName, int newAge) throws Exception {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, newName);
        ps.setInt(2, newAge);
        ps.setInt(3, id);
        int rows = ps.executeUpdate();
        System.out.println("Updated " + rows + " record(s) for ID: " + id);
        ps.close();
    }

    void printAll() throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        System.out.println("\nID | Name      | Age");
        System.out.println("---|-----------|----");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "  | " +
                               rs.getString("name") + "  | " +
                               rs.getInt("age"));
        }
        rs.close();
        stmt.close();
    }
}

public class task32 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:school.db";

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);

            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, age INTEGER NOT NULL)");

            StudentDAO dao = new StudentDAO(conn);

            dao.insertStudent("Diana", 21);
            dao.insertStudent("Eve", 23);

            dao.updateStudent(1, "Alice Updated", 25);

            System.out.println("\nAll students after insert and update:");
            dao.printAll();

            conn.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
