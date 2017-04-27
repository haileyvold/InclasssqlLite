package css.cis3334trace.inclass;

public class Comment {
    private long id;
    private String comment;
    private String rating;
    /**
     * Gets an Id from the SetID class
     * @return      ID
     */
    public long getId() {
        return id;  //gets the Id
    }
    /**
     * Sets this.Id to Id
     * @Param this.id
     */
    public void setId(long id) {
        this.id = id; // sets the Id
    }
    /**
     * Gets a comment for use elsewhere
     * @return   comment
     */
    public String getComment() {
        return comment;
    }
    /**
     * Sets this.comment to the specific comment
     * @Param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }


    public void setRating(String rating) {
        switch (this.rating = rating) {
        }
    }

    public String toString() {
        return comment + rating;


    }}

