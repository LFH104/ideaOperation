public enum Status {

    //1xx  Informational
    Continue(100),
    Processing(102),
    Checkpoint(103),


    //2xx  Success
    OK(200),
    Created(201),
    Accepted(202),

    //3xx  Redirection
    Found(302),

    //4xx Client Error
    Unauthorized(401),
    Conflict(409),
    Gone(410);

    private int code;

    Status(int code) {
        this.code = code;
    }

}
