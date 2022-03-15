package com.company.spring.context;


import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class MathBook implements Book{

    @Override
    public int getTitle() {
        return 0;
    }

    @Override
    public String getPrice() {
        return null;
    }
}
