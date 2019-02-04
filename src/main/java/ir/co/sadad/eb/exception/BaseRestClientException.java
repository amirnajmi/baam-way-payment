package ir.co.sadad.eb.exception;

import ir.co.sadad.eb.util.HttpStatusCode;

import java.util.*;
import java.util.stream.Collectors;

public class BaseRestClientException extends RuntimeException{

    private List<String> messageList;
    private Map<String, List<String>> messageParamMap;

    private int messageSize;
    private HttpStatusCode statusCode;
    private Throwable cause;

    public BaseRestClientException() {
        this(HttpStatusCode.INTERNAL_SERVER);
        messageList = new ArrayList<>();
        messageParamMap = new HashMap<>();
    }


    public BaseRestClientException(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        messageList = new ArrayList<>();
        messageParamMap = new HashMap<>();
    }

    public BaseRestClientException(HttpStatusCode httpStatusCode, String message) {
        this(httpStatusCode);
        messageList.add(message);
    }

    public BaseRestClientException(Throwable cause, HttpStatusCode httpStatusCode, String message) {
        this(httpStatusCode);
        this.cause = cause;
        messageList.add(message);
    }

//    public BusinessException(String message, String... messageParamValue) {
//        this(message);
//        messageParamMap.put(message, Arrays.stream(messageParamValue).collect(Collectors.toList()));
//    }

    public BaseRestClientException(HttpStatusCode httpStatusCode, String message, String... messageParamValue) {
        this(httpStatusCode, message);
        messageParamMap.put(message, Arrays.stream(messageParamValue).collect(Collectors.toList()));
    }

    public BaseRestClientException(Throwable cause, HttpStatusCode httpStatusCode, String message, String... messageParamValue) {
        this(httpStatusCode, message);
        messageParamMap.put(message, Arrays.stream(messageParamValue).collect(Collectors.toList()));
        this.cause = cause;
    }

    public BaseRestClientException(HttpStatusCode httpStatusCode, List<String> messages) {
        this(httpStatusCode);
        messageList.addAll(messages);
    }

    public BaseRestClientException(Throwable cause) {
        this(HttpStatusCode.INTERNAL_SERVER);
        messageList = new ArrayList<>();
        messageParamMap = new HashMap<>();
        this.cause = cause;
    }

    public void add(String message) {
        messageList.add(message);
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public int getMessageSize() {
        return messageList.size();
    }

    public Boolean messageIsEmpty() {
        return messageList.isEmpty();
    }

    public Map<String, List<String>> getMessageParamMap() {
        return messageParamMap;
    }

    public void setMessageParamMap(Map<String, List<String>> messageParamMap) {
        this.messageParamMap = messageParamMap;
    }

    public void addMessageParam(String key, List<String> valueList) {
        messageParamMap.put(key, valueList);
    }

    public Boolean messageParamMapIsEmpty() {
        return messageParamMap.isEmpty();
    }

    public HttpStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        StringBuilder msg = new StringBuilder();
        for (String s : messageList) {
            if (msg.length() > 0) {
                msg.append(",");
            }
            msg.append(s);
        }
        return msg.toString();
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "BaseRestClientException{" +
                "messageList=" + messageList +
                ", messageParamMap=" + messageParamMap +
                ", messageSize=" + messageSize +
                ", statusCode=" + statusCode +
                ", cause=" + cause +
                '}';
    }
}
