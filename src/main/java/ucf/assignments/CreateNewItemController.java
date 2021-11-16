package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;


import static ucf.assignments.ToDoListsController.toDoLists;
import static ucf.assignments.ToDoListsController.toDoListsWindow;

public class CreateNewItemController{

    @FXML
    private TextField newItemNameField;
    @FXML
    private TextField newItemDescField;
    @FXML
    private DatePicker newItemDateField;

    //Creates new Item object
    public void onNewItemOkClick(ActionEvent event)throws IOException{
        //Opens error dialog if name is empty
        if(newItemNameField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Name Entered");
            alert.setContentText("Please enter the name of the item.");
            alert.showAndWait();
        }
        //Opens error dialog if date is empty
        else if(newItemDateField.getValue() == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Date Entered");
            alert.setContentText("Please enter the due date of the item.");
            alert.showAndWait();
        }
        else if(newItemDescField.getText().length() < 1 || newItemDescField.getText().length() > 256){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Description");
            alert.setContentText("Please enter a description between 1 and 256 characters..");
            alert.showAndWait();
        }
        else {
            Item newItem = new Item(newItemNameField.getText(), newItemDescField.getText(), newItemDateField.getValue().toString(), false);
            //Adds the new Item object to the displayed list of items on the to-do list scene
            toDoLists.get(0).addItem(newItem);
            //Display the updated to-do list using updateToDoList in ToDoList
            switchToToDoListScene(event);
        }

    }

    //Returns user to the to-do list in the previous scene
    public void onItemCancelClick(ActionEvent event){
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }

    //Switches user to the to-do list scene
    public void switchToToDoListScene(ActionEvent event) throws IOException {

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
        Parent toDoListParent = FXMLLoader.load(ToDoListsController.class.getResource("ToDoList.fxml"));
        Scene toDoListScene = new Scene(toDoListParent);
        toDoListsWindow.setScene(toDoListScene);
        toDoListsWindow.show();
    }
}
