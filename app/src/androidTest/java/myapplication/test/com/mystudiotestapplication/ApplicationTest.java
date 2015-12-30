package myapplication.test.com.mystudiotestapplication;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;

import myapplication.test.com.mystudiotestapplication.util.ConverterUtil;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityUnitTestCase<FullscreenActivity> {

    FullscreenActivity fullscreenActivity;
    Button button;
    String btnText;

    public ApplicationTest() {
        super(FullscreenActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), FullscreenActivity.class), null, null);

        // Getting a reference to the FullscreenActivity of the target application
        fullscreenActivity = (FullscreenActivity) getActivity();
        // Getting a reference to the TextView of the MainActivity of the target application
        button = (Button) fullscreenActivity.findViewById(R.id.dummy_button);
    }

    @SmallTest
    public void testButtonText() {
        btnText = button.getText().toString().trim();
        assertTrue(btnText.equals("Dummy Button"));
    }

    @SmallTest
    public void testConvertFahrenheitToCelsius() {
        int actual = ConverterUtil.calcSum(100, 100);
        // expected value is 212
        int expected = 200;
        // use this method because float is not precise
//        assertEquals("Conversion from celsius to fahrenheit failed", expected,
//                actual, 0.001);

        assertEquals(actual, expected);
    }

    @SmallTest
    public void testConvertCelsiusToFahrenheit() {
        int actual = ConverterUtil.calcSubstraction(212, 200);
        // expected value is 100
        int expected = 100;
        // use this method because float is not precise
//        assertEquals("Conversion from celsius to fahrenheit failed", expected,
//                actual, 0.001);

        assertEquals(actual, expected);
    }
}