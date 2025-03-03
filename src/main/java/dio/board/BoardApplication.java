package dio.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

import dio.board.persistence.migration.MigrationStrategy;
import static dio.board.persistence.config.ConnectionConfig.getConnection;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(BoardApplication.class, args);

		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}

	}
}
