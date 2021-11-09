package ucf.assignments;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;

public class ToDoList {

    private String listName;
    private ObservableList<Item> itemObservableList;


    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public ObservableList<Item> getItemObservableList() {
        return itemObservableList;
    }

    public void setItemArrayList(ObservableList<Item> itemObservableList) {
        this.itemObservableList = itemObservableList;
    }

    public ToDoList(){
        listName = "";
        itemObservableList = new ObservableList<Item>() {
            @Override
            public void addListener(ListChangeListener<? super Item> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super Item> listener) {

            }

            @Override
            public boolean addAll(Item... elements) {
                return false;
            }

            @Override
            public boolean setAll(Item... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends Item> col) {
                return false;
            }

            @Override
            public boolean removeAll(Item... elements) {
                return false;
            }

            @Override
            public boolean retainAll(Item... elements) {
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
            public Iterator<Item> iterator() {
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
            public boolean add(Item item) {
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
            public boolean addAll(Collection<? extends Item> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Item> c) {
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
            public Item get(int index) {
                return null;
            }

            @Override
            public Item set(int index, Item element) {
                return null;
            }

            @Override
            public void add(int index, Item element) {

            }

            @Override
            public Item remove(int index) {
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
            public ListIterator<Item> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Item> listIterator(int index) {
                return null;
            }

            @Override
            public List<Item> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
    }

    public void addItem(Item newItem){
        getItemObservableList().add(newItem);
    }


}
