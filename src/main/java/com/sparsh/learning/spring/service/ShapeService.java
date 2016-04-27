package com.sparsh.learning.spring.service;

import com.sparsh.learning.spring.model.Circle;
import com.sparsh.learning.spring.model.Square;

/**
 * @author prashant.swamy
 *
 */
public class ShapeService {

    private Circle circle;

    private Square square;

    /**
     * @return the circle
     */
    public Circle getCircle() {
        return circle;
    }

    /**
     * @param circle the circle to set
     */
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    /**
     * @return the square
     */
    public Square getSquare() {
        return square;
    }

    /**
     * @param square the square to set
     */
    public void setSquare(Square square) {
        this.square = square;
    }

}
