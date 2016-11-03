package name.kocian.annotations.model;

import lombok.Data;

/**
 * Annotations will generate:
 * - Getters and setters
 *
 * @author Michal Kocian
 */
@Data
public class Dog {

    private String type;

    private String color;

    private int height;
}
