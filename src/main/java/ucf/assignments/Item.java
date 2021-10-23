package ucf.assignments;

public class Item {

    private String itemName;
    private String itemDesc;
    private String itemDue;
    private boolean itemComplete;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemDue() {
        return itemDue;
    }

    public void setItemDue(String itemDue) {
        this.itemDue = itemDue;
    }

    public boolean isItemComplete() {
        return itemComplete;
    }

    public void setItemComplete(boolean itemComplete) {
        this.itemComplete = itemComplete;
    }
}
