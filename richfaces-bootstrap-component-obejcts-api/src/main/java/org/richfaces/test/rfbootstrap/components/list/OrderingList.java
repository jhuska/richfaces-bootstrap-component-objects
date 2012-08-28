package org.richfaces.test.rfbootstrap.components.list;

import java.util.List;

public interface OrderingList<T> {

    /**
     * 
     * @return Returns number of select items which this ordering list has.
     */
    int getNumberOfSelectItems();

    /**
     * @return Returns all select items, that is, items which can be selected and then ordered.
     */
    List<SelectItem<T>> getAllSelectItems();

    /**
     * Returns select item according to the its given index. The items are indexed from 0, and from the top of the ordering
     * list.
     * 
     * @param index index of the select item to be returned
     * @return the select item with given index
     */
    SelectItem<T> getSelectItem(int index);

    /**
     * @return Returns the first select item, that it is, the top most item in the list.
     */
    SelectItem<T> getFirstSelectItem();

    /**
     * @return Returns the last select item, that it is, the bottom most item in the list.
     */
    SelectItem<T> getLastSelectItem();

    /**
     * Selects the given item so that it can be then ordered.
     * 
     * @param item item to be selected
     */
    void selectItem(SelectItem<T> item);

    /**
     * Selects item according to the given index, so that in can be then ordered.
     * 
     * @param index index of the item to be selected
     */
    void selectItem(int index);

    /**
     * Goes up by one position with selected item.
     * 
     * @throws IllegalStateException when no item is selected.
     */
    void goUp();

    /**
     * Goes up by one position with given item.
     * 
     * @param item select item to go up by one position with
     */
    void goUp(SelectItem<T> item);

    /**
     * Goes up by one position with item of given index.
     * 
     * @param indexOfSelectItem index of select item to go up by one position with
     */
    void goUp(int indexOfSelectItem);

    /**
     * Goes down by one position with selected item.
     * 
     * @throws IllegalStateException when no item is selected.
     */
    void goDown();

    /**
     * Goes down by one position with given item.
     * 
     * @param item select item to go down by one position with
     */
    void goDown(SelectItem<T> item);

    /**
     * Goes down by one position with item of given index.
     * 
     * @param indexOfSelectItem index of select item to go up by one position with
     */
    void goDown(int indexOfSelectItem);

    /**
     * Goes to the bottom of the list with selected item.
     * 
     * @throws IllegalStateException when no item is selected.
     */
    void goLast();

    /**
     * Goes to the bottom of the list with given item.
     * 
     * @param item select item to go to the bottom of the list with
     */
    void goLast(SelectItem<T> item);

    /**
     * Goes to the bottom of the list with item of given index.
     * 
     * @param indexOfSelectItem index of select item to go to the bottom of the list with
     */
    void goLast(int indexOfSelectItem);

    /**
     * Goes to the top of the list with selected item.
     * 
     * @throws IllegalStateException when no item is selected.
     */
    void goFirst();

    /**
     * Goes to the top of the list with given item.
     * 
     * @param item select item to go to the top of the list with
     */
    void goFirst(SelectItem<T> item);

    /**
     * Goes to the top of the list with item of given index.
     * 
     * @param indexOfSelectItem index of select item to go to the top of the list with
     */
    void goFirst(int indexOfSelectItem);

    /**
     * Drags and drops the desired select item to the desired position.
     * 
     * @param indexOfItemToDrag index of item which will be dragged
     * @param indexOfItemToDrop index of item on which will be the dragged item dropped
     */
    void dragAndDropAtPosition(int indexOfItemToDrag, int indexOfItemToDrop);

    /**
     * Drags and drops the desired select item to the desired position.
     * 
     * @param itemToDrag item which will be dragged.
     * @param itemToDrop item on which will be the dragged item dropped.
     */
    void dragAndDropAtPosition(SelectItem<T> itemToDrag, SelectItem<T> itemToDrop);
}
