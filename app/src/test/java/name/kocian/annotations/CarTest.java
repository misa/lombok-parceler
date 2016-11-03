package name.kocian.annotations;

import org.junit.Test;

import name.kocian.annotations.model.Car;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Michal Kocian
 */
@SuppressWarnings("FieldCanBeLocal")
public class CarTest {

    private Car mCar;

    private String mModel = "Skoda";

    private String mColor = "Blue";

    private int mPrice = 123;

    @Test
    public void builderPattern() {

        mCar = Car.builder()
                .model(mModel)
                .color(mColor)
                .price(mPrice)
                .build();

        assertThat(mCar.getModel(), is(mModel));
        assertThat(mCar.getColor(), is(mColor));
        assertThat(mCar.getPrice(), is(mPrice));
    }
}
