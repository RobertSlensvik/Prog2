import org.example.oBlig2;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class testoblig2 {

        @Test
        public void testLeapYearDevidedBy4AndNot100() {assertTrue(oBlig2.isLeapYear(4));}
        @Test
        public void testLeapYearDevidedBy400(){
            assertTrue(oBlig2.isLeapYear(400));
        }
        @Test
        public void testNotLeapYearDeviedBy100AndNot400(){
            assertFalse(oBlig2.isLeapYear(100));
        }
        @Test
        public void testNotLeapYearDevidedBy100AndNot4(){assertFalse(oBlig2.isLeapYear(300));}
}
