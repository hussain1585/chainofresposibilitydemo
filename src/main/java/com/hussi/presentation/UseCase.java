package com.hussi.presentation;

public abstract class UseCase<I, O> {
    public abstract O execute(I input);
}
