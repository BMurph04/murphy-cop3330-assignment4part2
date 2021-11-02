package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Item {

    private SimpleStringProperty itemName;
    private SimpleStringProperty itemDesc;
    private LocalDate itemDue;
    private boolean itemComplete;

    public Item(String itemName, String itemDesc, LocalDate itemDue, boolean itemComplete){
        this.itemName = new SimpleStringProperty(itemName);
        this.itemDesc = new SimpleStringProperty(itemDesc);
        this.itemDue = itemDue;
        this.itemComplete = itemComplete;
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

    public LocalDate getItemDue() {
        return itemDue;
    }

    public void setItemDue(LocalDate itemDue) {
        this.itemDue = itemDue;
    }

    public boolean isItemComplete() {
        return itemComplete;
    }

    public void setItemComplete(boolean itemComplete) {
        this.itemComplete = itemComplete;
    }
}
