package com.eap.hackerrank.test;

/**
 * Created by evgenypavlenko on 10/20/16.
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D> {

    //Properties
    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D elt) {
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D data, Tree<D> leftTree, Tree<D> rightTree) {
        this.data = data;
        left = leftTree;
        right = rightTree;
    }

    public boolean isEmpty() {
        return false;
    }

    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    public boolean member(D elt) {
        if (data == elt) {
            return true;
        } else {
            if (elt.compareTo(data) < 0) {
                return left.member(elt);
            } else {
                return right.member(elt);
            }
        }
    }

    public NonEmptyBST<D> add(D elt) {
        if (data == elt) {
            return this;
        } else {
            if (elt.compareTo(data) < 0) {
                return new NonEmptyBST<D>(data, left.add(elt), right);
            } else {
                return new NonEmptyBST<D>(data, left, right.add(elt));
            }
        }
    }
}
