package ucf.assignments;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ToDoList {

    private SimpleStringProperty listName;
    private ObservableList<Item> itemObservableList;

    public ToDoList(String listName, ObservableList<Item> itemObservableList) {
        this.listName = new SimpleStringProperty(listName);
        this.itemObservableList = itemObservableList;
    }

    public String getListName() {
        return listName.get();
    }

    public void setListName(String listName) {
        this.listName = new SimpleStringProperty(listName);
    }

    public ObservableList<Item> getItemObservableList() {
        return itemObservableList;
    }

    public void setItemArrayList(ObservableList<Item> itemObservableList) {
        this.itemObservableList = itemObservableList;
    }

    public void addItem(Item newItem){
        getItemObservableList().add(newItem);
    }

    public void showToDoList(ToDoList toDoList){
        //Changes top label to name of to-do list
        //Displays items in the to-do list in table format
        //Table has name column, due date column, description column, and mark-as-complete column
        //Table has scrolling functionality
    }
}
