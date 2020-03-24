package jsend;

public class JSendResponse {

    public static JSendStructure success(String message) {
        return getSimpleResponse(message, Status.success);
    }

    public static JSendStructure success(String key, Object data) {
        JSendStructure jSendStructure = new JSendStructure();
        jSendStructure.setStatus(Status.success);
        jSendStructure.putData(key, data);
        return jSendStructure;
    }

    public static JSendStructure success(String key, Object data, String message) {
        JSendStructure jSendStructure = new JSendStructure();
        jSendStructure.setStatus(Status.success);
        jSendStructure.setMessage(message);
        jSendStructure.putData(key, data);
        return jSendStructure;
    }

    public static JSendStructure fail(String message) {
        return getSimpleResponse(message, Status.fail);
    }

    public static JSendStructure error(String message) {
        return getSimpleResponse(message, Status.error);
    }

    private static JSendStructure getSimpleResponse(String message, Status status) {
        JSendStructure jSendStructure = new JSendStructure();
        jSendStructure.setMessage(message);
        jSendStructure.setStatus(status);
        return jSendStructure;
    }
}
