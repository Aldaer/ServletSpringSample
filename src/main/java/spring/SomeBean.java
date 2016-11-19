package spring;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SomeBean {
    private final String message;

    @Override
    public String toString() {
        return "[" + message + "]";
    }
}
