package ucf.assignments;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;

public class HelloController implements Initializable{

    //Initialize an ArrayList of ToDoList objects
    ArrayList<ToDoList> toDoLists = new ArrayList<>();



    //Create new to-do list scene
    @FXML private TextField newListNameField;

    //Create new item scene
    @FXML private TextField newItemNameField;
    @FXML private TextField newItemDescField;
    @FXML private DatePicker newItemDateField;

    //To-do list scene
    @FXML private Label toDoListNameLabel;

    //Updated index of newly added list
    private int newListIndex = 0;

    //Create a private label toDoList that can change based on the current to-do list being displayed

    //When the "Create New To-Do List" button is clicked:
    public void onCreateNewListClick(ActionEvent event) throws IOException{
        //Open new scene that prompts user to enter the title of the new to-do list
        switchToNewListScene(event);
    }
    public void onNewToDoOkClick(ActionEvent event) throws IOException{
        //Add a new ToDoList object to the array of ToDoList objects
        toDoLists.add(new ToDoList());
        //Applies the title to the new ToDoList object
        toDoLists.get(newListIndex).setListName(newListNameField.getText());
        //Display the newly created to-do list in a separate scene using showToDoList in ToDoList
        showToDoList(toDoLists.get(newListIndex));
        //Switches to to-do list scene
        switchToToDoListScene(event);




    }
    public void onNewToDoCancelClick(){
        //Returns user to the list of to-do lists on the previous scene
    }

    public void onRemoveToDoListClick(){
        //Calls removeList in EditToDoList
    }
    public void onBackClick(){
        //Returns user to the list of to-do lists
    }

    public void onAddNewItemClick(){
        //Add a new Item object to the existing object TodoList
        //Open new scene that prompts user to enter the name, description, and due date of the new to-do list
        //Display the newly created item in the same scene
    }
    public void onNewItemOkClick(){
        //Adds the new Item object to the displayed list of items on the to-do list scene
        //Display the updated to-do list using showToDoList in ToDoList
    }
    public void onItemCancelClick(){
        //Returns user to the to-do list in the previous scene
    }

    public void onRemoveItemClick(){
        //Runs removeItem and deletes the items selected in the table
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

    public void switchToNewListScene(ActionEvent event) throws IOException{
        Parent newListParent = FXMLLoader.load(HelloController.class.getResource("CreateNewList.fxml"));
        Scene newListScene = new Scene(newListParent);
        Stage window = new Stage();
        window.setTitle("New To-Do List");
        window.setScene(newListScene);
        window.show();
    }
    public void switchToNewItemScene(ActionEvent event) throws IOException{
        Parent newItemParent = FXMLLoader.load(HelloController.class.getResource("CreateNewItem.fxml"));
        Scene newItemScene = new Scene(newItemParent);
        Stage window = new Stage();
        window.setTitle("New Item");
        window.setScene(newItemScene);
        window.show();
    }
    public void switchToToDoListScene(ActionEvent event) throws IOException{
        Parent toDoListParent = FXMLLoader.load(HelloController.class.getResource("ToDoList.fxml"));
        Scene toDoListScene = new Scene(toDoListParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(toDoListScene);
        window.show();
    }

    public void showToDoList(ToDoList toDoList){
        //Changes top label to name of to-do list
        toDoListNameLabel.setText(toDoList.getListName());
        //Displays items in the to-do list in table format
        //Table has name column, due date column, description column, and mark-as-complete column
        //Table has scrolling functionality
    }

    @FXML
    public void initialize(URL location, ResourceBundle resources)  {
        toDoListNameLabel.setText("");
        //Set up columns in to-do list
        //Update to-do list table to be editable
        //Update to-do list table to select multiple rows at once
    }
}