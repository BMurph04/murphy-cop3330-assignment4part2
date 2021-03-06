package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

//Creates item object containing name, description, due date, and whether the item is finished
public class Item {

    private SimpleStringProperty itemName;
    private SimpleStringProperty itemDesc;
    private SimpleStringProperty itemDue;
    private CheckBox itemDone;

    public Item(String itemName, String itemDesc, String itemDue, boolean itemDone){
        this.itemName = new SimpleStringProperty(itemName);
        this.itemDesc = new SimpleStringProperty(itemDesc);
        this.itemDue = new SimpleStringProperty(itemDue);
        this.itemDone = new CheckBox();
        this.itemDone.selectedProperty().set(itemDone);
    }


    public String getItemName() {
        return itemName.get();
    }

    public void setItemName(String itemName) {
        this.itemName = new SimpleStringProperty(itemName);
    }

    public String getItemDesc() {
        return itemDesc.get();
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = new SimpleStringProperty(itemDesc);
    }

    public String getItemDue() {
        return itemDue.get();
    }

    public void setItemDue(String itemDue) {
        this.itemDue = new SimpleStringProperty(itemDue);
    }

    public CheckBox getItemDone() {
        return itemDone;
    }

    public void setItemDone(CheckBox itemComplete) {
        this.itemDone = itemComplete;
    }
}
