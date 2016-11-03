package name.kocian.annotations.model;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Annotations will generate:
 * - Getters and setters
 * - All arguments constructor
 * - Builder pattern
 *
 * @author Michal Kocian
 */
@Data
@Builder
@AllArgsConstructor
@Parcel(Parcel.Serialization.BEAN)
public class Person {

    private String name;

    private String surname;

    @ParcelConstructor
    public Person() {
    }
}
