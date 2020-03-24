package jsend;

import java.util.HashMap;
import java.util.Map;

public class JSendStructure {

    private Status status;

    private String message;

    private Map<String, Object> data;

    public JSendStructure() {

    }

    public Map<String, Object> getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public Status getStatus() {
        return status;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void putData(String key, Object data) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, data);
    }

}
