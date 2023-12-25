package LinkedList.SLList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SLListTest {
    private SLList<Integer> baseSLList;
    private SLList<Integer> size4SLList;
    private SLList<Integer> input3;

    @Before
    public void initialize() {
        baseSLList = new SLList<>();
    }

    @Test
    public void testSize() {
        baseSLList.insertLast(3);
        baseSLList.insertLast(2);
        baseSLList.insertLast(84);
        baseSLList.insertLast(9);
        assertEquals(4, baseSLList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(baseSLList.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        baseSLList.insertLast(5);
        baseSLList.insertLast(23);
        assertFalse(baseSLList.isEmpty());
    }

    @Test
    public void testInsertAtIndex() {
        baseSLList.insertLast(0);
        baseSLList.insertLast(0);
        baseSLList.insertFirst(0);
        baseSLList.insertFirst(0);
        baseSLList.insertAtIndex(1, 2);
        assertEquals((Integer) 1, baseSLList.getAtIndex(2));
    }

    @Test
    public void testInsertFirst() {
        baseSLList.insertAtIndex(132, 0);
        baseSLList.insertAtIndex(24, 1);
        baseSLList.insertAtIndex(37, 2);
        baseSLList.insertFirst(0);
        assertEquals((Integer) 0, baseSLList.getAtIndex(0));
    }

    @Test
    public void testInsertLast() {
        baseSLList.insertAtIndex(34, 0);
        baseSLList.insertAtIndex(11, 1);
        baseSLList.insertAtIndex(29, 2);
        baseSLList.insertLast(41);
        assertEquals((Integer) 41, baseSLList.getAtIndex(3));
    }

    @Test
    public void testGetAtIndex() {
        baseSLList.insertAtIndex(10, 0);
        baseSLList.insertAtIndex(11, 1);
        baseSLList.insertAtIndex(12, 2);
        assertEquals((Integer) 11, baseSLList.getAtIndex(1));
    }

    @Test
    public void testGetFirst() {
        baseSLList.insertAtIndex(10, 0);
        baseSLList.insertAtIndex(11, 1);
        baseSLList.insertAtIndex(12, 2);
        assertEquals((Integer) 10, baseSLList.getFirst());
    }

    @Test
    public void testGetLast() {
        baseSLList.insertAtIndex(10, 0);
        baseSLList.insertAtIndex(11, 1);
        baseSLList.insertAtIndex(12, 2);
        assertEquals((Integer) 12, baseSLList.getLast());
    }

    @Test
    public void testDeleteAtIndex() {
        baseSLList.insertAtIndex(1, 0);
        baseSLList.insertAtIndex(2, 1);
        baseSLList.insertAtIndex(3, 2);
        assertEquals((Integer) 2, baseSLList.deleteAtIndex(1));
        assertEquals(2, baseSLList.size());
        assertEquals((Integer) 1, baseSLList.getAtIndex(0));
        assertEquals((Integer) 3, baseSLList.getAtIndex(1));
    }

    @Test
    public void testDeleteFirst() {
        baseSLList.insertAtIndex(5, 0);
        baseSLList.insertAtIndex(7, 1);
        baseSLList.insertAtIndex(9, 2);
        assertEquals((Integer) 5, baseSLList.deleteFirst());
        assertEquals(2, baseSLList.size());
    }

    @Test
    public void testDeleteLast() {
        baseSLList.insertAtIndex(5, 0);
        baseSLList.insertAtIndex(7, 1);
        baseSLList.insertAtIndex(9, 2);
        baseSLList.insertAtIndex(11, 3);
        baseSLList.insertAtIndex(13, 4);
        assertEquals((Integer) 13, baseSLList.deleteLast());
        assertEquals(4, baseSLList.size());
    }
}
