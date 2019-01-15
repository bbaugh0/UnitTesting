package ius;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testNext() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(null);
        assertEquals("Test that first.next = second", first.next(), second);
        assertEquals("Test that second.next = third", second.next(), third);



    }

    @Test
    public void testLast() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(null);
        assertEquals("Test that third is last", first.last(), third);
    }

    @Test
    public void testAfter() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        MyLinkedList<String> fourth = new MyLinkedList<>();
        MyLinkedList<String> fifth = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);


        assertEquals("Testing that after gets the 3rd element down the list", first.after(3), third);


    }

    @Test
    public void testDetach() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(null);
        first.detach();
        assertEquals("should be null", first.next, null);

    }

    @Test
    public void testGet() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(null);
        first.val = "one";
        second.val = "two";
        third.val = "three";
        assertEquals("Value should be one", first.get(), "one");
        assertEquals("Value should be two", second.get(), "two");
        assertEquals("Value should be three", third.get(), "three");
    }

    @Test
    public void testSet() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        first.set("one");
        second.set("two");
        third.set("three");
        assertEquals("Value should be one", first.val, "one");
        assertEquals("Value should be two", second.val, "two");
        assertEquals("Value should be three", third.val, "three");
    }

    @Test
    public void testSetNext() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        MyLinkedList<String> fourth = new MyLinkedList<>();
        MyLinkedList<String> fifth = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);
        assertEquals("First.next should be second", first.next, second);
        assertEquals("second.next should be third", second.next, third);
        assertEquals("third.next should be fourth", third.next, fourth);
        assertEquals("fourth.next should be fifth", fourth.next, fifth);
        assertEquals("fifth.next should be null", fifth.next, null);





    }

    @Test
    public void testAppend() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        MyLinkedList<String> fourth = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(null);
        third.append(fourth);
        assertEquals("third.next should be fourth", third.next, fourth);

    }

    @Test
    public void testInsert() {
        MyLinkedList<String> first = new MyLinkedList<>();
        MyLinkedList<String> second = new MyLinkedList<>();
        MyLinkedList<String> third = new MyLinkedList<>();
        MyLinkedList<String> fourth = new MyLinkedList<>();
        first.setNext(second);
        second.setNext(third);
        third.setNext(null);
        first.insert(fourth);
        assertEquals("fourth.next should be first", fourth.next, first);
    }

}