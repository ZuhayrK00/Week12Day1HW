import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class printerTest {
    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void testPrintEnoughPaper() {
        printer.print(10, 2);
        assertEquals(80, printer.getPaperLeft());
        assertEquals(80, printer.getTonerVolume());
    }

    @Test
    public void testPrintNotEnoughPaper() {
        printer.print(5, 2);
        assertEquals(90, printer.getTonerVolume());
    }
}
