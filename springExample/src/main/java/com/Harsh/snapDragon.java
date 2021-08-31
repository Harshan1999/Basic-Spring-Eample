package com.Harsh;

import org.springframework.stereotype.Component;

@Component
public class snapDragon  implements processor{

    @Override
    public void process() {
        System.out.println("Snapdragon 888 processor in this phone");

    }
}
