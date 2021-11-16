package ucf.assignments;

import javafx.scene.control.CheckBox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadList {
    //Method that reads to-do list data from file
    public void loadListFromFile(ToDoList toDoList, File file) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        String line;
        toDoList.setListName(fileReader.readLine());
        ArrayList<Item> itemList = new ArrayList<>();
        fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String[] tokens = line.split(",");
            if (tokens.length > 0) {
                Item item = new Item(tokens[0], tokens[1], tokens[2], Boolean.parseBoolean(tokens[3]));
                itemList.add(item);
            }
        }
        toDoList.setItemArrayList(itemList);
        fileReader.close();
    }
}


