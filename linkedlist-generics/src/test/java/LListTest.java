import org.junit.Test;
import static org.junit.Assert.*;
import Exception.NoSuchElementException;

public class LListTest {
    @Test
    public void testAddLList() {
        LList<String> lst = new LList<String>();
        lst.add("text1");
        lst.add("text2");

        int actSize = lst.size();
        String actStr = lst.get(1);

        assertEquals(2, actSize);
        assertEquals("text2", actStr);
    }

    @Test
    public void testRemoveLList() {
        LList<String> lst = new LList<String>();
        lst.add("text1");
        lst.add("text2");
        lst.remove(0);

        int actSize = lst.size();
        String actStr = lst.get(0);

        assertEquals(1, actSize);
        assertEquals("text2", actStr);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExceptionLList() {
        LList<String> lst = new LList<String>();
        lst.add("text1");
        lst.remove(1);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetExceptionLList() {
        LList<String> lst = new LList<String>();
        lst.add("text1");
        lst.get(1);
    }
}