package com.hongna.leetcode.Tree.SegmentTree;

public interface Merger<E> {
    E merge(E a, E b);
}
