package ucf.assignments;

import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveList {
    //Method that writes to-do list data to a file
    public void saveListToFile(ToDoList toDoList, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        ObservableList<Item> itemList = toDoList.getItemObservableList();
        fileWriter.append(toDoList.getListName());
        fileWriter.append("\n");
        fileWriter.append("itemName,itemDesc,itemDue,itemDone");
        fileWriter.append("\n");
        for (Item item : itemList) {
            fileWriter.append(item.getItemName());
            fileWriter.append(",");
            fileWriter.append(item.getItemDesc());
            fileWriter.append(",");
            fileWriter.append(item.getItemDue());
            fileWriter.append(",");
            fileWriter.append(String.valueOf(item.getItemDone()));
            fileWriter.append("\n");
        }
        fileWriter.close();
    }
}
