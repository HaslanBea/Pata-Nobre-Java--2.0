import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pata_nobre",
                "root",
                "43370717"
            );

            System.out.println("Conectado ao banco!");

            return conn;

        } catch (Exception e) {

            System.out.println("Erro na conexão");
            System.out.println(e);

            return null;
        }
    }
}