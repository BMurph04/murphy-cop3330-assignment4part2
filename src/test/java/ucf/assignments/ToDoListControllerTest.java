package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListControllerTest {

    @Test
    void changeNameCellEvent() {
        ItemTestingObject itemSelected = new ItemTestingObject("item1", "itemdesc1", "itemdue1", true);
        itemSelected.setItemName("newitem1");

        assertEquals(itemSelected.getItemName(), "newitem1");
    }

    @Test
    void changeDueDateCellEvent() {
        ItemTestingObject itemSelected = new ItemTestingObject("item2", "itemdesc2", "itemdue2",  false);
        itemSelected.setItemDue("itemdue2");

        assertEquals(itemSelected.getItemDue(), "itemdue2");
    }

    @Test
    void changeDescriptionCellEvent() {
        ItemTestingObject itemSelected = new ItemTestingObject("item3", "itemdesc3", "itemdue3", false);
        itemSelected.setItemDue("itemdesc3");

        assertEquals(itemSelected.getItemDesc(), "itemdesc3");
    }
}