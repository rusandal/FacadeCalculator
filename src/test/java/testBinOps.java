import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testBinOps {

    @Test
    @DisplayName("Суммирование")
    public void testSum() {
        String a = "10";
        String b = "11";

        String expected = "101";

        BinOps binOps = new BinOps();
        String result = binOps.sum("10", "11");
        Assertions.assertEquals(result, expected);
    }

    @Test
    @DisplayName("Перемножение")
    public void testMult() {
        String a = "10";
        String b = "11";

        String expected = "110";

        BinOps binOps = new BinOps();
        String result = binOps.mult("10", "11");
        Assertions.assertEquals(result, expected);
    }

}
