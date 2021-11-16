package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import static ucf.assignments.ToDoListsController.toDoLists;

public class ToDoListController implements Initializable {

    @FXML private Label toDoListNameLabel;
    @FXML private TableView<Item> toDoListTableView;
    @FXML private TableColumn<Item, String> itemNameColumn;
    @FXML private TableColumn<Item, String> itemDescColumn;
    @FXML private TableColumn<Item, String> itemDueColumn;
    @FXML private TableColumn<Item, CheckBox> itemDoneColumn;

    private final FilterList filterList = new FilterList();

    FileChooser fileChooser = new FileChooser();

    //Open new scene that prompts user to enter the name, description, and due date of the new to-do list
    public void onAddNewItemClick() throws IOException{
        switchToNewItemScene();
    }

    //Deletes the items selected in the table
    public void onRemoveItemClick(){
        ObservableList<Item> allItems = toDoListTableView.getItems();
        ObservableList<Item> selectedItems = toDoListTableView.getSelectionModel().getSelectedItems();
        //Deletes items from ArrayList
        toDoLists.get(0).removeItem(selectedItems);
        //Deletes items from scene
        allItems.removeAll(selectedItems);
    }

    //Clears the to-do list of items
    public void onClearListClick(){
        ObservableList<Item> allItems = toDoListTableView.getItems();
        toDoLists.get(0).clearList(allItems);
        allItems.removeAll(allItems);
    }

    //Gives user ability to edit name
    public void changeNameCellEvent(TableColumn.CellEditEvent editedCell){

        Item itemSelected = toDoListTableView.getSelectionModel().getSelectedItem();
        itemSelected.setItemName(editedCell.getNewValue().toString());
    }

    //Gives user ability to edit due date
    public void changeDueDateCellEvent(TableColumn.CellEditEvent editedCell){
        Item itemSelected = toDoListTableView.getSelectionModel().getSelectedItem();
        if(isValid(editedCell.getNewValue().toString())) {
            itemSelected.setItemDue(editedCell.getNewValue().toString());
        }
        //If incorrect format is entered, open an error dialog
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incorrect Date Format");
            alert.setContentText("Please enter the due date in acceptable YYYY-MM-DD format.");
            alert.showAndWait();
        }
    }

    //Gives user ability to edit description
    public void changeDescriptionCellEvent(TableColumn.CellEditEvent editedCell){

        Item itemSelected = toDoListTableView.getSelectionModel().getSelectedItem();
        itemSelected.setItemDesc(editedCell.getNewValue().toString());
    }

    //Shows all items in the to-do list
    public void onShowAllClick(){

        toDoListTableView.setItems(toDoLists.get(0).getItemObservableList());
    }

    //Show completed items in the to-do list
    public void onShowCompleteClick(){
        //Calls getCompleteItems method in FilterList
        ObservableList<Item> completeItems = filterList.getCompleteItems(toDoLists.get(0).getItemObservableList());
        //Sets table to completed items only
        toDoListTableView.setItems(completeItems);
    }

    //Show incomplete items in the to-do list
    public void onShowIncompleteClick(){
        //Calls showIncompleteItems in FilterList
        ObservableList<Item> incompleteItems = filterList.getIncompleteItems(toDoLists.get(0).getItemObservableList());
        //Sets table to incomplete items only
        toDoListTableView.setItems(incompleteItems);
    }

    //Saves the to-do list to computer
    public void onSaveToDoListClick() throws IOException{
        //Runs method handleSave in SaveList to save the current to-do list
        File file = fileChooser.showSaveDialog(new Stage());
        SaveList saveList = new SaveList();
        if(file != null){
            saveList.saveListToFile(toDoLists.get(0), file);
        }
    }

    //Returns user to main menu
    public void onBackClick(ActionEvent event) throws IOException{
        //Cleans to-do list of any data
        toDoLists.set(0, new ToDoList());
        //Returns user to main menu scene
        switchToToDoListsScene(event);
    }

    //Switches user to the create new item scene
    public void switchToNewItemScene() throws IOException {
        Parent newItemParent = FXMLLoader.load(ToDoListController.class.getResource("CreateNewItem.fxml"));
        Scene newItemScene = new Scene(newItemParent);
        Stage window = new Stage();
        window.setTitle("New Item");
        window.setScene(newItemScene);
        window.show();
    }

    //Switches user to the to-do list scene
    public void switchToToDoListsScene(ActionEvent event) throws IOException{
        Parent toDoListsParent = FXMLLoader.load(ToDoListsController.class.getResource("ToDoLists.fxml"));
        Scene toDoListsScene = new Scene(toDoListsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(toDoListsScene);
        window.show();

    }



    //Method that checks if date user entered is of the correct format
    public boolean isValid(String dateStr){
        try {
            LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
        catch(DateTimeParseException e){
            return false;
        }
        return true;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        toDoListNameLabel.setText(toDoLists.get(0).getListName());

        //Set up columns in the table
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        itemDueColumn.setCellValueFactory(new PropertyValueFactory<>("itemDue"));
        itemDescColumn.setCellValueFactory(new PropertyValueFactory<>("itemDesc"));
        itemDoneColumn.setCellValueFactory(new PropertyValueFactory<>("itemDone"));

        //load list data
        toDoListTableView.setItems(toDoLists.get(0).getItemObservableList());

        //Update table to allow it to be edited
        toDoListTableView.setEditable(true);
        itemNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        itemDescColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        itemDueColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        //Set initial directory of the fileChooser
        fileChooser.setInitialDirectory(new File("src/main/java/ucf/assignments"));

        //Allows table to select multiple rows at once
        toDoListTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}


