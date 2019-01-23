package ir.co.sadad.eb.util;

public enum HttpStatusCode {
    BAD_REQUEST(400),
    UN_AUTHORIZE(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    INTERNAL_SERVER(502);

    private final int statusCode;

    HttpStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
