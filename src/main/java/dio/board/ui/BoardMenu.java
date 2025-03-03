package dio.board.ui;

import dio.board.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;
import java.util.Scanner;

@AllArgsConstructor
public class BoardMenu {

    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    private final BoardEntity entity;

    public void execute() {

    }

}

