package name.kocian.annotations;

import org.junit.Test;

import name.kocian.annotations.model.Dog;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * @author Michal Kocian
 */
@SuppressWarnings("FieldCanBeLocal")
public class DogTest {

    private Dog mDog;

    private String mType = "Retriever";

    private String mColor = "Golden";

    private int mHeight = 61;

    @Test
    public void builderPattern() {

        mDog = new Dog();

        assertThat(mDog.getType(), is(nullValue()));
        assertThat(mDog.getColor(), is(nullValue()));
        assertThat(mDog.getHeight(), is(0));

        mDog.setType(mType);
        mDog.setColor(mColor);
        mDog.setHeight(mHeight);

        assertThat(mDog.getType(), is(mType));
        assertThat(mDog.getColor(), is(mColor));
        assertThat(mDog.getHeight(), is(mHeight));
    }
}
