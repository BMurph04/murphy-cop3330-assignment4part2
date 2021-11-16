package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoadListTest {

    ToDoListTestingObject toDoList = new ToDoListTestingObject();
    ItemTestingObject item1 = new ItemTestingObject("item1", "itemdesc1", "itemdue1", true);
    ItemTestingObject item2 = new ItemTestingObject("item2", "itemdesc2", "itemdue2",  false);
    ItemTestingObject item3 = new ItemTestingObject("item3", "itemdesc3", "itemdue3", false);
    ItemTestingObject item4 = new ItemTestingObject("item4", "itemdesc4", "itemdue4", true);

    @Test
    void loadListFromFile() throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader("src/test/java/ucf/assignments/actualtestwrite"));
        String line;
        toDoList.setListName(fileReader.readLine());
        ArrayList<ItemTestingObject> itemList = new ArrayList<>();
        fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String[] tokens = line.split(",");
            if (tokens.length > 0) {
                ItemTestingObject item = new ItemTestingObject(tokens[0], tokens[1], tokens[2], Boolean.parseBoolean(tokens[3]));
                itemList.add(item);
            }
        }
        toDoList.setItemArrayList(itemList);
        fileReader.close();

        ToDoListTestingObject actualToDoList = new ToDoListTestingObject();
        actualToDoList.addItem(item1);
        actualToDoList.addItem(item2);
        actualToDoList.addItem(item3);
        actualToDoList.addItem(item4);

        for(int i = 0; i < actualToDoList.getItemObservableList().size(); i++){
            assertEquals(toDoList.getItemObservableList().get(i).getItemName(), actualToDoList.getItemObservableList().get(i).getItemName());
            assertEquals(toDoList.getItemObservableList().get(i).getItemDesc(), actualToDoList.getItemObservableList().get(i).getItemDesc());
            assertEquals(toDoList.getItemObservableList().get(i).getItemDue(), actualToDoList.getItemObservableList().get(i).getItemDue());
            assertEquals(toDoList.getItemObservableList().get(i).getItemDone(), actualToDoList.getItemObservableList().get(i).getItemDone());
        }

    }
}