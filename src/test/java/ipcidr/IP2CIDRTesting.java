package ipcidr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IP2CIDRTesting {

    @Test
    public void testBasic() {
        String start = "255.255.255.0";
        String end = "255.255.255.255";
        assertEquals("255.255.255.0/24", IP2CIDR.range2cidrlist(start, end).get(0));
    }
}