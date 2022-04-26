package Services;

import java.io.IOException;

public interface IPersonServices {
    void displayList();

    void edit() throws IOException;

    void add() throws IOException;
}
