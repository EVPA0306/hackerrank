package com.eap.hackerrank.test.trees;

import com.eap.hackerrank.test.trees.NonEmptyBST;

/**
 * Created by evgenypavlenko on 10/20/16.
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST() {}

    public boolean isEmpty() {
        return true;
    }

    public int cardinality() {
        return 0;
    }

    public boolean member(D elt) {
        return false;
    }

    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
}
