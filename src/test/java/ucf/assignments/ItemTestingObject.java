package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

public class ItemTestingObject {
    private SimpleStringProperty itemName;
    private SimpleStringProperty itemDesc;
    private SimpleStringProperty itemDue;
    private boolean itemDone;

    public ItemTestingObject(String itemName, String itemDesc, String itemDue, boolean itemDone){
        this.itemName = new SimpleStringProperty(itemName);
        this.itemDesc = new SimpleStringProperty(itemDesc);
        this.itemDue = new SimpleStringProperty(itemDue);
        this.itemDone = itemDone;
    }


    public String getItemName(){
        return itemName.get();
    }

    public void setItemName(String itemName){
        this.itemName = new SimpleStringProperty(itemName);
    }

    public String getItemDesc(){
        return itemDesc.get();
    }

    public void setItemDesc(String itemDesc){
        this.itemDesc = new SimpleStringProperty(itemDesc);
    }

    public String getItemDue(){
        return itemDue.get();
    }

    public void setItemDue(String itemDue){
        this.itemDue = new SimpleStringProperty(itemDue);
    }

    public boolean getItemDone(){
        return itemDone;
    }

    public void setItemDone(boolean itemDone){
        this.itemDone = itemDone;
    }
}
