package com.company.spring.context;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class SportBook implements Book{

    private int price;
    private String title;

    @Override
    public int getTitle() {
        return 0;
    }

    @Override
    public String getPrice() {
        return null;
    }
}
