import java.util.ArrayList;


public class ResponseMessage {

    public String version, status_code, phrase;
    public ArrayList<HeaderLine> headerLines = new ArrayList<HeaderLine>();
    public String entity_path;

}


