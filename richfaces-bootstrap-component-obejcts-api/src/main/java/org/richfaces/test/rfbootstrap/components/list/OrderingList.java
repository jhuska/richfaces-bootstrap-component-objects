package org.richfaces.test.rfbootstrap.components.list;

import org.jboss.arquillian.graphene.spi.components.common.Component;


public interface OrderingList<T> extends Component {

    /**
     * 
     * @return Returns the select list of this ordering list.
     */
    SelectList<T> getSelectList();
    
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
    void goUp(SelectableItem<T> item);

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
    void goDown(SelectableItem<T> item);

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
    void goLast(SelectableItem<T> item);

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
    void goFirst(SelectableItem<T> item);

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
    void dragAndDropAtPosition(SelectableItem<T> itemToDrag, SelectableItem<T> itemToDrop);
}
