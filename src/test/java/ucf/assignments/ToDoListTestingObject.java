package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ToDoListTestingObject {

    private String listName;
    private ArrayList<ItemTestingObject> itemArrayList = new ArrayList<>();


    public String getListName() {
        return listName;
    }
    public void setListName(String listName) {
        this.listName = listName;
    }

    public ArrayList<ItemTestingObject> getItemArrayList() {
        return itemArrayList;
    }
    public void setItemArrayList(ArrayList<ItemTestingObject> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    //Converts array list to observable list
    public ObservableList<ItemTestingObject> getItemObservableList(){
        ObservableList<ItemTestingObject> itemObservableList = FXCollections.observableArrayList();
        itemObservableList.addAll(getItemArrayList());
        return itemObservableList;
    }


    public ArrayList<ItemTestingObject> addItem(ItemTestingObject newItem){
        getItemArrayList().add(newItem);
        return itemArrayList;
    }

    public ArrayList<ItemTestingObject> removeItem(ObservableList<ItemTestingObject> oldItems){
        getItemArrayList().removeAll(oldItems);
        return itemArrayList;
    }

    public ArrayList<ItemTestingObject> clearList(ObservableList<ItemTestingObject> allItems){
        getItemArrayList().removeAll(allItems);
        return itemArrayList;
    }
}
