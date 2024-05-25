package constants;

public enum EndPoint {

    DAY1("/basic_auth"),
    DAY2("/2016/09/how-to-work-with-disable-textbox-or.html"),
    DAY3("/advanced.html"),
    DAY4("/styled/challenges/growing-clickable.html");

    public final String url;
    EndPoint(String url) {
        this.url = url;
    }
}
