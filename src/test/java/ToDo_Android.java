import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.CreateTaskPage;
import pageobjects.TasksListPage;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDo_Android extends TestBase {

    CreateTaskPage createTaskPage ;
    TasksListPage tasksListPage;

    @DataProvider(name = "tasks data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONdata
                (System.getProperty("user.dir") + "/data/TasksData.json"
                        , "Tasks Data", 2);
    }

    @Test(dataProvider = "tasks data")
    public void test_add_task(String taskName, String TaskDesc) throws MalformedURLException {
        Android_setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDesc(TaskDesc);
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        createTaskPage.getScreenShot();
        tearDown();
    }
}
