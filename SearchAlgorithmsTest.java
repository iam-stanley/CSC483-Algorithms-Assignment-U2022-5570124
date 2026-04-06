package com.csc483;

import com.csc483.search.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchAlgorithmsTest {

    @Test
    void testSequentialSearch() {
        Product[] products = {
            new Product(1, "A", "Cat", 10, 5),
            new Product(2, "B", "Cat", 20, 5)
        };
        assertNotNull(SearchAlgorithms.sequentialSearchById(products, 1));
        assertNull(SearchAlgorithms.sequentialSearchById(products, 99));
    }
}