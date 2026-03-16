package utilities;

import org.testng.annotations.DataProvider;

public class ExcelReader {

    @DataProvider(name="loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"tomsmith","SuperSecretPassword!"}
        };
    }
}
