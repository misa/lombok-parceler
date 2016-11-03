package name.kocian.annotations;

import android.os.Parcelable;

import org.junit.Before;
import org.junit.Test;
import org.parceler.Parcels;

import name.kocian.annotations.model.Person;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * @author Michal Kocian
 */
public class PersonTest {

    private Person mPerson;

    private String mName = "Michal";
    private String mSurname = "Kocian";

    @Before
    public void setUp() {

        mPerson = Person.builder()
                .name(mName)
                .surname(mSurname)
                .build();
    }

    @Test
    public void builderPattern() {

        assertThat(mPerson.getName(), is(mName));
        assertThat(mPerson.getSurname(), is(mSurname));
    }

    @Test
    public void gettersAndSetters() {

        String testName = "Test";
        String testSurname = "Surname";

        mPerson.setName(testName);
        mPerson.setSurname(testSurname);

        assertThat(mPerson.getName(), is(testName));
        assertThat(mPerson.getSurname(), is(testSurname));

        assertThat(mPerson.getName(), is(not(mName)));
        assertThat(mPerson.getSurname(), is(not(mSurname)));
    }

    @Test
    public void parcelTransformation() {

        Parcelable wrappedPerson = Parcels.wrap(Person.class, mPerson);
        Person unwrappedPerson = Parcels.unwrap(wrappedPerson);

        assertThat(unwrappedPerson.getName(), is(mName));
        assertThat(unwrappedPerson.getSurname(), is(mSurname));
    }

    @Test
    public void constructors() {
        mPerson = new Person();
        mPerson = new Person("Michal", "Kocian");
    }
}
