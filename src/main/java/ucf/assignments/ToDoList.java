package ucf.assignments;
import java.util.ArrayList;

public class ToDoList {

    private String listName;
    private ArrayList<Item> itemArrayList;

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

    public void addItem(Item newItem){
        getItemArrayList().add(newItem);
    }
}
