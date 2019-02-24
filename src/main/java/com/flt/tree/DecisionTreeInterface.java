package com.flt.tree;

/**
 * @author fenglingtong
 * @date 2018/6/4
 */
public interface DecisionTreeInterface<T> extends BinaryTreeInterface<T> {

    T getCurrentData();

    void setCurrentData();

    void setAnswers(T answerForNo, T answerForYes);

    boolean isAnswer();

    void advanceToNo();

    void advanceToYes();

    void reset();
}
