import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Service {
    public String method(String arg) {
        if( arg.equals("one") ) {
            return "One";
        }
        if( arg.equals("two") ) {
            return "Two";
        }
        if( arg.equals("three") ) {
            return "Three";
        }
        return "default";
    }
}
