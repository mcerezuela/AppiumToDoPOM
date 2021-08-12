package dataobjects.tasks;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Tasks Data"
})
@Generated("jsonschema2pojo")
public class Tasks {

    @JsonProperty("Tasks Data")
    private List<TasksDatum> tasksData = null;

    @JsonProperty("Tasks Data")
    public List<TasksDatum> getTasksData() {
        return tasksData;
    }

    @JsonProperty("Tasks Data")
    public void setTasksData(List<TasksDatum> tasksData) {
        this.tasksData = tasksData;
    }

}
