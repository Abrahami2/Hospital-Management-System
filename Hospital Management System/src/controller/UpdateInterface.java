package controller;
/**
 * UpdateInterface defines the contract for updating and deleting data.
 * This interface for the MVC architecture of our project
 * to handle update and delete operations on our data models.
 */
public interface UpdateInterface {

    /**
     * Updates a specific data entry based on row and column indices.
     *
     * @param row   The row index of the data entry to be updated.
     * @param col   The column index of the data attribute to be updated.
     * @param value The new value to update the data attribute to.
     */
    public void update(int row,int col,String value);
    /**
     * Deletes a specific data entry based on its row index.
     *
     * @param row The row index of the data entry to be deleted.
     */
    public void delete(int row);
}
