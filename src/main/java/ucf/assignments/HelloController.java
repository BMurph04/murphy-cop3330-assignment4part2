package ucf.assignments;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController{
    //Initialize an ArrayList of ToDoList objects
    @FXML

    //Create a private label toDoList that can change based on the current to-do list being displayed


    //When the "Create New To-Do List" button is clicked:
    public void onCreateNewListClick() {
        //Add a new ToDoList object to the array of ToDoList objects
        //Open new scene that prompts user to enter the title of the new to-do list

    }
    public void onAddNewItemClick(){
        //Add a new Item object to the existing object TodoList
        //Open new scene that prompts user to enter the name, description, and due date of the new to-do list
        //Display the newly created item in the same scene
    }
    public void onBackClick(){
        //Returns user to the list of to-do lists
    }
    public void onNewToDoOkClick(){
        //Applies the title to the new ToDoList object
        //Adds the new ToDoList object to the displayed list of to-do lists on first scene
        //Display the newly created to-do list in a separate scene using showToDoList
    }
    public void onToDoCancelClick(){
        //Returns user to the list of to-do lists on the previous scene
    }
    public void onNewItemOkClick(){
        //Applies the name, description, and due date to the new Item object
        //Adds the new Item object to the displayed list of items on the to-do list scene
        //Display the updated to-do list using showToDoList
    }
    public void onItemCancelClick(){
        //Returns user to the to-do list in the previous scene
    }

    public void showToDoList(ToDoList toDoList){
        //Changes top label to name of to-do list
        //Displays items in the to-do list
            //Includes drop-down displaying description and due date
    }
}