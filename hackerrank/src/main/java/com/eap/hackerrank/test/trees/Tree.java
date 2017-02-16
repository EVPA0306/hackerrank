package com.eap.hackerrank.test.trees;

import com.eap.hackerrank.test.trees.NonEmptyBST;

/**
 * Created by evgenypavlenko on 10/20/16.
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
