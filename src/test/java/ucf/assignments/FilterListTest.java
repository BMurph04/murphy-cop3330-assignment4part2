package ucf.assignments;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class FilterListTest{
    ToDoListTestingObject toDoList = new ToDoListTestingObject();
    ItemTestingObject item1 = new ItemTestingObject("item1", "itemdesc1", "itemdue1", true);
    ItemTestingObject item2 = new ItemTestingObject("item2", "itemdesc2", "itemdue2",  false);
    ItemTestingObject item3 = new ItemTestingObject("item3", "itemdesc3", "itemdue3", false);
    ItemTestingObject item4 = new ItemTestingObject("item4", "itemdesc4", "itemdue4", true);

    FilterListTestingObject filterList = new FilterListTestingObject();


    @Test
    void showCompleteItems() {
        ObservableList<ItemTestingObject> itemActualList = new ObservableList<>() {
            @Override
            public void addListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public boolean addAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends ItemTestingObject> col) {
                return false;
            }

            @Override
            public boolean removeAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean retainAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ItemTestingObject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ItemTestingObject itemTesting) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ItemTestingObject get(int index) {
                return null;
            }

            @Override
            public ItemTestingObject set(int index, ItemTestingObject element) {
                return null;
            }

            @Override
            public void add(int index, ItemTestingObject element) {

            }

            @Override
            public ItemTestingObject remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator(int index) {
                return null;
            }

            @Override
            public List<ItemTestingObject> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
        itemActualList.addAll(item1, item4);
        ObservableList<ItemTestingObject> itemFilteredList = new ObservableList<>() {
            @Override
            public void addListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public boolean addAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends ItemTestingObject> col) {
                return false;
            }

            @Override
            public boolean removeAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean retainAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ItemTestingObject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ItemTestingObject itemTesting) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ItemTestingObject get(int index) {
                return null;
            }

            @Override
            public ItemTestingObject set(int index, ItemTestingObject element) {
                return null;
            }

            @Override
            public void add(int index, ItemTestingObject element) {

            }

            @Override
            public ItemTestingObject remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator(int index) {
                return null;
            }

            @Override
            public List<ItemTestingObject> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
        itemFilteredList.addAll(filterList.getCompleteItems(toDoList.getItemObservableList()));

        //Tests that items marked as complete are filtered
        for(int i = 0; i < itemActualList.size(); i++){
            assertEquals(itemActualList.get(i), itemFilteredList.get(i));
        }
    }

    @Test
    void showIncompleteItems() {
        ObservableList<ItemTestingObject> itemActualList = new ObservableList<>() {
            @Override
            public void addListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public boolean addAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends ItemTestingObject> col) {
                return false;
            }

            @Override
            public boolean removeAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean retainAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ItemTestingObject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ItemTestingObject itemTesting) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ItemTestingObject get(int index) {
                return null;
            }

            @Override
            public ItemTestingObject set(int index, ItemTestingObject element) {
                return null;
            }

            @Override
            public void add(int index, ItemTestingObject element) {

            }

            @Override
            public ItemTestingObject remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator(int index) {
                return null;
            }

            @Override
            public List<ItemTestingObject> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
        itemActualList.addAll(item2, item3);
        ObservableList<ItemTestingObject> itemFilteredList = new ObservableList<>() {
            @Override
            public void addListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super ItemTestingObject> listener) {

            }

            @Override
            public boolean addAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends ItemTestingObject> col) {
                return false;
            }

            @Override
            public boolean removeAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public boolean retainAll(ItemTestingObject... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ItemTestingObject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ItemTestingObject itemTesting) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ItemTestingObject> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ItemTestingObject get(int index) {
                return null;
            }

            @Override
            public ItemTestingObject set(int index, ItemTestingObject element) {
                return null;
            }

            @Override
            public void add(int index, ItemTestingObject element) {

            }

            @Override
            public ItemTestingObject remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ItemTestingObject> listIterator(int index) {
                return null;
            }

            @Override
            public List<ItemTestingObject> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
        itemFilteredList.addAll(filterList.getIncompleteItems(toDoList.getItemObservableList()));

        //Tests that items marked as complete are filtered
        for(int i = 0; i < itemActualList.size(); i++){
            assertEquals(itemActualList.get(i), itemFilteredList.get(i));
        }
        //Tests that items shown are those not marked as complete
    }
}