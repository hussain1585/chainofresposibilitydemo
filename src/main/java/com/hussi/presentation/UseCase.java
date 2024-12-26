package com.hussi.presentation;

import org.springframework.stereotype.Service;

public abstract class UseCase<I, O> {
    public abstract O execute(I input);
}
