import dataobjects.tasks.TasksDatum;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.CreateTaskPage;
import pageobjects.TasksListPage;
import utils.DataObjects;

import java.net.MalformedURLException;
import java.util.Iterator;


public class ToDo_Android extends TestBase {

    CreateTaskPage createTaskPage ;
    TasksListPage tasksListPage;

    @DataProvider(name = "tasksObject")
    public Iterator<Object[]> passData(){
        return DataObjects.getTasksIterator();
    }

    @Test(dataProvider = "tasksObject")
    public void test_add_task(TasksDatum task) throws MalformedURLException {
        Android_setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(task.getTaskName());
        createTaskPage.enterTaskDesc(task.getTaskDesc());
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        createTaskPage.getScreenShot();
        tearDown();
    }
}
