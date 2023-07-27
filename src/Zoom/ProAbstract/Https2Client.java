package Zoom.ProAbstract;

public class Https2Client extends HttpUtils {

    @Override
    public String doGet(String url) {
        String response = super.doGet(url);
        return "HTTP 2: " + response;
    }

}
