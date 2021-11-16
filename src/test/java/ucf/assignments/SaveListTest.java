package ucf.assignments;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class SaveListTest {

    ToDoListTestingObject toDoList = new ToDoListTestingObject();
    ItemTestingObject item1 = new ItemTestingObject("item1", "itemdesc1", "itemdue1", true);
    ItemTestingObject item2 = new ItemTestingObject("item2", "itemdesc2", "itemdue2",  false);
    ItemTestingObject item3 = new ItemTestingObject("item3", "itemdesc3", "itemdue3", false);
    ItemTestingObject item4 = new ItemTestingObject("item4", "itemdesc4", "itemdue4", true);


    @Test
    void saveListToFile() throws IOException {
        toDoList.setListName("listname");
        toDoList.addItem(item1);
        toDoList.addItem(item2);
        toDoList.addItem(item3);
        toDoList.addItem(item4);

        File fileExpected = new File("src/test/java/ucf/assignments/testwrite");
        File fileActual = new File("src/test/java/ucf/assignments/actualtestwrite");

        FileWriter fileWriter = new FileWriter(fileExpected);
        ObservableList<ItemTestingObject> itemList = toDoList.getItemObservableList();
        fileWriter.append(toDoList.getListName());
        fileWriter.append("\n");
        fileWriter.append("itemName,itemDesc,itemDue,itemDone");
        fileWriter.append("\n");
        for (ItemTestingObject item : itemList) {
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

        assertEquals(Files.readAllLines(fileExpected.toPath()), Files.readAllLines(fileActual.toPath()));
    }

}