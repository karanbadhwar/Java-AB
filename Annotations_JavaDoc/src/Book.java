/**@author Karan Badhwar
 * @Version 1.0
 * @since 2023
 */


/**
 * @author karan badhwar
 *
 * Class for Library Book
 */

public class Book {

    /**
     * @value 10 default value
     */
    static int val = 10;


    /**
     *
     * @param s Book Name
     */
    public Book(String s)
    {

    }

    /**
     * Issue a Book to a Student
     * @param roll, roll number of a Student
     * @throws Exception, if book is not available throws Exception
     */
    public void issue(int roll) throws Exception{}


    /**
     * Check if book is available
     * @param str Book Name
     * @return if Books is avail return true else false
     */
    public boolean available(String str)
    {
        return true;
    }

    /**
     * Get Book name with ID
     * @param id, book ID
     * @return returns book name
     */
    public String getName(int id)
    {
        return "";
    }
}
