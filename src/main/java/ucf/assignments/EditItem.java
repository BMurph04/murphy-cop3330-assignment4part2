package ucf.assignments;

public class EditItem {
    void editItemName(Item item){
        //Saves new name to corresponding item in list
    }
    void editItemDesc(Item item){
        //Saves new description to corresponding item in list
    }
    void edititemDate(Item item){
        //Saves new due date to corresponding item in list
    }
    void editItemComplete(Item item){
        //Saves new itemComplete boolean to corresponding item in list
    }

    public Item applyToItem(Item item){
        //Applies the name, description, due date, and mark-as-complete to the new Item object
        return item;
    }
    public void removeItem(ToDoList currentList, Item itemRemoved){
        //Removes the specified item from the to-do list
    }
}
