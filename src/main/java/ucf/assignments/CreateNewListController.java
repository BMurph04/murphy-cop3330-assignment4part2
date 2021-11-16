package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static ucf.assignments.ToDoListsController.toDoLists;

public class CreateNewListController implements Initializable {

    @FXML private TextField newListNameField;


    public void onNewToDoOkClick(ActionEvent event) throws IOException {
        //Add a new ToDoList object to the array of ToDoList objects
        toDoLists.add(new ToDoList());
        //Applies the title to the new ToDoList object
        //Stays 0, operating on one to-do list
        int newListIndex = 0;
        toDoLists.get(newListIndex).setListName(newListNameField.getText());
        //Switches to createNewItem scene
        switchToNewItemScene(event);
        //newListIndex++; (index stays 0, one to-do list)
    }
    //Returns user to the main menu screen on the previous scene
    public void onNewToDoCancelClick(ActionEvent event){

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }

    //Switches user to the create new item scene
    public void switchToNewItemScene(ActionEvent event) throws IOException {
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
        Parent newItemParent = FXMLLoader.load(ToDoListsController.class.getResource("CreateNewItem.fxml"));
        Scene newItemScene = new Scene(newItemParent);
        window = new Stage();
        window.setTitle("New Item");
        window.setScene(newItemScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
