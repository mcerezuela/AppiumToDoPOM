package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataobjects.tasks.Tasks;
import dataobjects.tasks.TasksDatum;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DataObjects {

    public static Tasks getTasksFromJson(){
        ObjectMapper objectMapper = new ObjectMapper();
        Tasks tasks = null;
        try {
            tasks = objectMapper.readValue(new File(System.getProperty("user.dir") + "/data/TasksData.json"), Tasks.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static Iterator<Object[]> getTasksIterator() {
        List<TasksDatum> tasks = DataObjects.getTasksFromJson().getTasksData();
        Collection<Object[]> data = new ArrayList<>();
        tasks.forEach(item -> data.add(new Object[]{item}));
        return data.iterator();
    }

//    public static boolean isValidJSON(final String json) throws IOException {
//        boolean valid = true;
//        try{
//            objectMapper.readTree(json);
//        } catch(JsonProcessingException e){
//            valid = false;
//        }
//        return valid;
//    }
}
