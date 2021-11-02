package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    //Initialize an ArrayList of ToDoList objects
    @FXML

    //Create a private label toDoList that can change based on the current to-do list being displayed


    //When the "Create New To-Do List" button is clicked:
    public void onCreateNewListClick() {
        //Add a new ToDoList object to the array of ToDoList objects
        //Open new scene that prompts user to enter the title of the new to-do list

    }
    public void onRemoveToDoListClick(){
        //Calls removeList in EditToDoList
    }
    public void onAddNewItemClick(){
        //Add a new Item object to the existing object TodoList
        //Open new scene that prompts user to enter the name, description, and due date of the new to-do list
        //Display the newly created item in the same scene
    }
    public void onRemoveItemClick(){
        //Runs removeItem and deletes the items selected in the table
    }
    public void onBackClick(){
        //Returns user to the list of to-do lists
    }
    public void onNewToDoOkClick(){
        //Applies the title to the new ToDoList object
        //Adds the new ToDoList object to the displayed list of to-do lists on first scene
        //Display the newly created to-do list in a separate scene using showToDoList in ToDoList
    }
    public void onToDoCancelClick(){
        //Returns user to the list of to-do lists on the previous scene
    }
    public void onNewItemOkClick(){
        //Does method applyToItem
        //Adds the new Item object to the displayed list of items on the to-do list scene
        //Display the updated to-do list using showToDoList in ToDoList
    }
    public void onItemCancelClick(){
        //Returns user to the to-do list in the previous scene
    }

    public void changeNameCellEvent(TableColumn.CellEditEvent editedCell){
        //Gives user ability to edit name
        //Save new name to corresponding item using editItemName in EditItem
    }
    public void changeDueDateCellEvent(TableColumn.CellEditEvent editedCell){
        //Gives user ability to edit due date
        //Save new date to corresponding item using editItemDate in EditItem
    }
    public void changeDescriptionCellEvent(TableColumn.CellEditEvent editedCell){
        //Gives user ability to edit description
        //Save new description to corresponding item using editItemDesc in EditItem
    }
    public void onMarkCompleteClick(Item item){
        //Marks current item as completed
        //Calls editItemComplete in EditItem to change itemComplete boolean
    }
    public void onChangeTitleClick(){
        //Calls editListTitle in EditToDoList
    }
    public void onShowAllClick(){
        //Calls showAllItems in FilterList
    }
    public void onShowCompleteClick(){
        //Removes all items displayed in scene
        //Calls showCompleteItems method in FilterList
    }
    public void onShowIncompleteClick(){
        //Removes all items displayed in scene
        //Calls showIncompleteItems in FilterList
    }
    public void onSaveToDoListClick(){
        //Runs method handleSave in SaveList to save the current to-do list
    }


    public void onLoadToDoListClick() {
        //Runs loadList in LoadList to load a to-do list
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Set up columns in to-do list
        //Update to-do list table to be editable
        //Update to-do list table to select multiple rows at once
    }
}