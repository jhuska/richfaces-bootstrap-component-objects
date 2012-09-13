package org.richfaces.test.rfbootstrap.components.api.list;


public interface PickList<T> {

    /**
     * 
     * @return Returns the source select items associated with this pick list.
     */
    SelectItems<T> getSourceSelectItems();

    /**
     * 
     * @return Returns the target select items associated with this pick list.
     */
    SelectItems<T> getTargetSelectItems();

    /**
     * 
     * @return Returns the ordeable target select items.
     */
    OrderingList<T> getTargetSelectItemsOrdeable();

    /**
     * The selected item/s from target select items go/es to the source select items.
     * 
     * @throws IllegalStateException if no item/s is/are selected in the target select items.
     */
    void goLeft();

    /**
     * The selected item/s go/es to from the source select items to the target select items.
     * 
     * @throws IllegalStateException if no item/s is/are selected in the source select items.
     */
    void goRight();

    /**
     * The given select item/s go/es from target select items to the source select items.
     * 
     * @param items the item/s which will be moved from target select items to the source select items.
     * @throws IllegalArgumentException when any of the given items is not in the target select items anymore.
     */
    void goLeft(SelectableItem<T>... items);

    /**
     * The given select item/s go/es from source select items to the target select items.
     * 
     * @param items the item/s which will be moved from source select items to the target select items.
     * @throws IllegalArgumentException when any of the given items is not in the source select items anymore.
     */
    void goRight(SelectableItem<T>... items);

    /**
     * The given select item/s go/es from target select items to the source select items.
     * 
     * @param indexes the indexes of items which will be moved from target select items to the source select items.
     * @throws IllegalArgumentException when any of the given item/s is not in the target select items anymore.
     */
    void goLeft(int... indexes);

    /**
     * The given select item/s go/es from source select items to the target select items.
     * 
     * @param indexes the index/es of item/s which will be moved from source select items to the target select items.
     * @throws IllegalArgumentException when any of the given item/s index/es is not in the source select items anymore.
     */
    void goRight(int... indexes);

    /**
     * All items from target select items go to the source select items.
     */
    void goAllLeft();

    /**
     * All items from source select items go to the target select items.
     */
    void goAllRight();

}
