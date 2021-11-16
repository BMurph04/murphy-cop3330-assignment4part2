package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FilterListTestingObject {
    ObservableList<ItemTestingObject> getCompleteItems(ObservableList<ItemTestingObject> currentItemList){
        ObservableList<ItemTestingObject> completedItemList = FXCollections.observableArrayList();
        //Iterates through the items in the list
        for (ItemTestingObject currentItem : currentItemList) {
            //If checkbox for item is selected, add to a list of complete items
            if (currentItem.getItemDone()) {
                completedItemList.add(currentItem);
            }
        }
        return completedItemList;
    }
    ObservableList<ItemTestingObject> getIncompleteItems(ObservableList<ItemTestingObject> currentItemList){
        //Iterates through the current to-do list object
        //If itemComplete == false, return these items
        ObservableList<ItemTestingObject> incompleteItemList = FXCollections.observableArrayList();
        //Iterates through the items in the list
        for (ItemTestingObject currentItem : currentItemList) {
            //If checkbox for item is selected, add to a list of complete items
            if (!currentItem.getItemDone()) {
                incompleteItemList.add(currentItem);
            }
        }
        return incompleteItemList;
    }
}

