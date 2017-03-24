import java.util.ArrayList;


public class RequestMessage {

    public String
            method,
            URL,
            version,
            entity_body;
    public ArrayList<HeaderLine> headerLines = new ArrayList<HeaderLine>();
}
