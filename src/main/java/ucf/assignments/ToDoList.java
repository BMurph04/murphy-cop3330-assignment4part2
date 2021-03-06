package ucf.assignments;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

//Creates to-do list object containing name and list of items in to-do list
public class ToDoList {

    private String listName;
    private ArrayList<Item> itemArrayList = new ArrayList<>();


    public String getListName() {
        return listName;
    }
    public void setListName(String listName) {
        this.listName = listName;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }
    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    //Converts array list to observable list
    public ObservableList<Item> getItemObservableList(){
        ObservableList<Item> itemObservableList = FXCollections.observableArrayList();
        itemObservableList.addAll(getItemArrayList());
        return itemObservableList;
    }


    public ArrayList<Item> addItem(Item newItem){
        getItemArrayList().add(newItem);
        return itemArrayList;
    }

    public ArrayList<Item> removeItem(ObservableList<Item> oldItems){
        getItemArrayList().removeAll(oldItems);
        return itemArrayList;
    }

    public ArrayList<Item> clearList(ObservableList<Item> allItems){
        getItemArrayList().removeAll(allItems);
        return itemArrayList;
    }

}
