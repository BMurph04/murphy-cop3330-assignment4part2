package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.*;

public class ToDoListsController implements Initializable{

    //Initialize an ArrayList of ToDoList objects
    public static ArrayList<ToDoList> toDoLists = new ArrayList<>();

    //Save the toDoLists window
    public static Stage toDoListsWindow;

    //Initializes fileChooser
    FileChooser fileChooser = new FileChooser();




    //When the "Create New To-Do List" button is clicked:
    public void onCreateNewListClick(ActionEvent event) throws IOException{
        //Open new scene that prompts user to enter the title of the new to-do list
        switchToNewListScene(event);
    }


    /* Method not needed
    public void onRemoveToDoListClick(){
        //Removes list from list of to-do lists
    }     */

    //Enables user to choose file from computer
    public void onLoadToDoListClick(ActionEvent event) throws IOException{
        File file = fileChooser.showOpenDialog(new Stage());
        LoadList loadList = new LoadList();
        if(file != null) {
            toDoLists.add(new ToDoList());
            loadList.loadListFromFile(toDoLists.get(0), file);
            switchToToDoListScene(event);
        }

    }

    //Switches user to the create new list scene
    public void switchToNewListScene(ActionEvent event) throws IOException{
        toDoListsWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent newListParent = FXMLLoader.load(ToDoListsController.class.getResource("CreateNewList.fxml"));
        Scene newListScene = new Scene(newListParent);
        Stage window = new Stage();
        window.setTitle("New To-Do List");
        window.setScene(newListScene);
        window.show();
    }

    //Switches user to the to-do list scene
    public void switchToToDoListScene(ActionEvent event) throws IOException {

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent toDoListParent = FXMLLoader.load(ToDoListsController.class.getResource("ToDoList.fxml"));
        Scene toDoListScene = new Scene(toDoListParent);
        window.setScene(toDoListScene);
        window.show();
    }





    @FXML
    public void initialize(URL location, ResourceBundle resources)  {
        //Set initial directory for fileChooser
        fileChooser.setInitialDirectory(new File("src/main/java/ucf/assignments"));
    }

}