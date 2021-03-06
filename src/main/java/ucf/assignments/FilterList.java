package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class FilterList {

    ObservableList<Item> getCompleteItems(ObservableList<Item> currentItemList){
        ObservableList<Item> completedItemList = FXCollections.observableArrayList();
        //Iterates through the items in the list
        for (Item currentItem : currentItemList) {
            //If checkbox for item is selected, add to a list of complete items
            if (currentItem.getItemDone().selectedProperty().get()) {
                completedItemList.add(currentItem);
            }
        }
        return completedItemList;
    }
    ObservableList<Item> getIncompleteItems(ObservableList<Item> currentItemList){
        //Iterates through the current to-do list object
        //If itemComplete == false, return these items
        ObservableList<Item> incompleteItemList = FXCollections.observableArrayList();
        //Iterates through the items in the list
        for (Item currentItem : currentItemList) {
            //If checkbox for item is selected, add to a list of complete items
            if (!currentItem.getItemDone().selectedProperty().get()) {
                incompleteItemList.add(currentItem);
            }
        }
        return incompleteItemList;
    }
}
