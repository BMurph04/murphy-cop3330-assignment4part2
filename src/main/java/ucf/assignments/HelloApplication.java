/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brendon Murphy
 */

/*
So this entire project should be centered around utilizing an ArrayList of objects,
those objects being the to-do lists. There should be an array of to-do lists made.
Each to-do list has a name field and its own internal ArrayList of objects.
These objects are the items that will be modified throughout the program.
Each item will have a description string, a due date string, and a mark-as-complete boolean.



1. Create ArrayList of objects made from class ToDoList. The objects are separate to-do lists.
2. Within each to-do list, create:
    a) String name field
    b) Object Items (ArrayList of objects made from class ListItems.)
3. Within each item, create:
    a) String name field
    b) String description field
    c) String due date field
    d) Boolean mark completed field

4. When application is launched, the first thing shown should be a button to create new to-do
list.
When create new list button is clicked:
    a) The user is prompted to enter name of new to-do list
    b) The user is taken to the to-do list, where the "Add Item" button is shown
When add item button is clicked:
    a) The user is prompted to enter name of item
    b) The user is prompted to enter description of item
    c) The user is prompted to enter the due date of the item

5. Create functionality to edit name of to-do list
6. Create functionality to edit item description and due date of to-do list
7. Create functionality to remove to-do list
8. Create functionality to remove item
9. Create functionality to mark item as complete
    a) There should be a button that when clicked, changes mark completed boolean to true.
    b) There should be some sort of visual cue that an item has been marked as completed.
10. Create functionality to filter the items in a to-do list
    a) There should be a button that when clicked, displays only items that mark completed = true
    b) There should be a button that when clicked, displays only items that marked completed = false
    c) There should be a button that when clicked, displays items that have marked completed = true or false
11. Create functionality to load and save items and to-do lists
    a) ??? how tf do you do this

Top of the Controller class should hold a class that initializes the array of to-do lists


*/
package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("todo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("To-Do Lists");
        stage.setScene(scene);
        stage.show();
    }

    public static void showNewListStage() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateNewList.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        Stage createListStage = new Stage();
        createListStage.setTitle("Create New List");
        createListStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}