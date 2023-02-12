package data_provider;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "data-set")
    public static Object[][] testData(){
        return new Object[][] {
                {"lowercase", 9, 2343.24f, false, '#'},
                {" ", 98787, .234324f, true, 'G'},
                {"uppercase", 90, 0.1f, true, 'K'},
                {"string", Integer.MAX_VALUE, Float.MAX_VALUE, Double.MAX_VALUE, true, ' '},
        };
    }


    @DataProvider(name = "test-data")
    public static Object[][] data(){
        return new Object[][]{
                {10, 20, 30, 0},
                {-1, 20, 30, 2},
                {0, 20, 30, 2}
        };
    }

    @DataProvider(name = "loginData")
    public static Object[][]loginData(){
        return new Object[][]{
                {"azaryanlena@gmail.com", "testpass123"},
                {"azaryanlena@gmail.com", "wrongPass"},
                {"wrongMail@gmail.com", "pass"},
                {"", ""}
        };
    }
}
