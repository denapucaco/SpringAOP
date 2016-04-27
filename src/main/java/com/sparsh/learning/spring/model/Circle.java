/**
 * 
 */
package com.sparsh.learning.spring.model;

/**
 * @author prashant.swamy
 *
 */
public class Circle { // implements Shape {

    private String name;

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.spring.model.Shape#getName()
     */
    public String getName() {
        System.out.println("Inside the getName method: " + name);
        return name;
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.spring.model.Shape#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }

}
