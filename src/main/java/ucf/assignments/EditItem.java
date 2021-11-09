package ucf.assignments;

import javafx.util.StringConverter;

import java.time.LocalDate;

public class EditItem {
    public Item editItemName(Item item){
        //Saves new name to corresponding item in list
        return item;
    }
    public Item editItemDesc(Item item){
        //Saves new description to corresponding item in list
        return item;
    }
    public Item editItemDate(Item item){
        //Saves new due date to corresponding item in list
        return item;
    }
    public Item editItemComplete(Item item){
        //Saves new itemComplete boolean to corresponding item in list
        return item;
    }

    public static Item applyToItem(String newItemName, String newItemDesc, LocalDate newItemDate){
        //Applies the name, description, due date, and mark-as-complete to the new Item object
        return new Item(newItemName, newItemDesc, newItemDate, false);
    }
    public ToDoList removeItem(ToDoList currentList, Item itemRemoved){
        //Removes the specified item from the to-do list
        return currentList;
    }
}
