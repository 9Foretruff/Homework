package Zoom.ProAbstract;

import java.util.Map;

public class ReactiveHttp2Client extends Https2Client {
    @Override
    public String doGet(String url, Map<String, String> headers) {
        return "ReactiveHttp2Client";
    }

    @Override
    public String doPost(String url) {
        return super.doPost(url);
    }
}
