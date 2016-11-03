package name.kocian.annotations.model;

import lombok.Builder;
import lombok.Getter;

/**
 * Annotations will generate:
 * - Getters
 * - Builder pattern
 *
 * @author Michal Kocian
 */
@Getter
@Builder
public class Car {

    private String model;

    private String color;

    private int price;
}
