package page_tests;

import data_provider.TestData;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderTest {
    @Test(dataProvider = "data-set", dataProviderClass = TestData.class)
    public void testData(String string, Integer integer, Float floatNum, Double doubleNum, Boolean bool, Character character) {
        System.out.printf("String: %s, Integer: %d, Float: %+,f, Boolean: %b, Character: %c\n",
                string, integer, floatNum, bool, character);
        System.out.printf("%S\n", string); //printf "%S" equals to string.toUpperCase()
        System.out.println(string.concat(floatNum.toString()));
        System.out.println("Sum of float and integer: " + (integer + floatNum + doubleNum));
        System.out.println(doubleNum);
        System.out.println(character.hashCode() + " " + bool);
    }

    @Test(dataProvider = "test-data", dataProviderClass = TestData.class)
    public void testNUmberOfSolutions(Integer a, Integer b, Integer c, Integer numOfSolutions){
        int discriminant = discriminant(a, b, c);
        int numberOfSolutions = numberOfSolutions(discriminant);
        System.out.printf("Input: %d, %d, %d\n", a, b, c);
        System.out.printf("Discriminant: %d, Number Of Solutions: %d\n", discriminant, numberOfSolutions);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(numberOfSolutions==numOfSolutions, "Incorrect Number Of Solutions");
        softAssert.assertAll();
    }

    static int discriminant(int a, int b, int c){
        int discriminant = (int)Math.pow(b,2) - (4*a*c);
        return discriminant;
    }

    static int numberOfSolutions(int discriminant){
        if (discriminant > 0){
            System.out.println("Two Solutions");
            return 2;
        }
        else if (discriminant == 0) {
            System.out.println("One Solution");
            return 1;
        }
        else {
            System.out.println("No Solutions");
            return 0;
        }
    }
}
