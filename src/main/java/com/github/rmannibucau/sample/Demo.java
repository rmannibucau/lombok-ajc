package com.github.rmannibucau.sample;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Demo {
    private final String name;

    public String sayHi() {
        return "hi";
    }
}
