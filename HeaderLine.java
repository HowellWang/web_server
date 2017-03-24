

public class HeaderLine {
    public String field_name;
    public String value;
    HeaderLine(String line){
        String[] str = line.split(" ");
        field_name = str[0];
        value = str[1];
    }
}
