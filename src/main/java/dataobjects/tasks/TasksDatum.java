package dataobjects.tasks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "TaskName",
        "TaskDesc"
})
@Generated("jsonschema2pojo")
public class TasksDatum {

    @JsonProperty("TaskName")
    private String taskName;
    @JsonProperty("TaskDesc")
    private String taskDesc;

    @JsonProperty("TaskName")
    public String getTaskName() {
        return taskName;
    }

    @JsonProperty("TaskName")
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @JsonProperty("TaskDesc")
    public String getTaskDesc() {
        return taskDesc;
    }

    @JsonProperty("TaskDesc")
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

}
