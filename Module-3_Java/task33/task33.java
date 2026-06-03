import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class task33 {

    static void printAccounts(Connection conn) throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");
        System.out.println("ID | Owner   | Balance");
        System.out.println("---|---------|--------");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "  | " +
                               rs.getString("owner") + "  | " +
                               rs.getDouble("balance"));
        }
        rs.close();
        stmt.close();
    }

    static void transfer(Connection conn, int fromId, int toId, double amount) throws Exception {
        conn.setAutoCommit(false);
        try {
            PreparedStatement debit = conn.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromId);
            debit.executeUpdate();

            PreparedStatement credit = conn.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toId);
            credit.executeUpdate();

            conn.commit();
            System.out.println("Transfer of " + amount + " from account " + fromId + " to account " + toId + " successful.");

            debit.close();
            credit.close();
        } catch (Exception e) {
            conn.rollback();
            System.out.println("Transaction failed. Rolled back. Reason: " + e.getMessage());
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);

            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS accounts (" +
                         "id INTEGER PRIMARY KEY, owner TEXT NOT NULL, balance REAL NOT NULL)");
            stmt.execute("INSERT OR IGNORE INTO accounts VALUES (1, 'Alice', 5000.00)");
            stmt.execute("INSERT OR IGNORE INTO accounts VALUES (2, 'Bob', 3000.00)");
            stmt.close();

            System.out.println("Before Transfer:");
            printAccounts(conn);

            transfer(conn, 1, 2, 1000.00);

            System.out.println("\nAfter Transfer:");
            printAccounts(conn);

            conn.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
