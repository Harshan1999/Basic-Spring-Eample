package com.Harsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class samsungS21  {
    @Autowired
    processor cpu;

    public processor getCpu() {
        return cpu;
    }

    public void setCpu(processor cpu) {
        this.cpu = cpu;
    }

    public void config()
    {
        System.out.println("The Samsung Galaxy S21 Ultra is the headliner of the S21 series. It's the first S series phone to support Samsung's S Pen. Specifications are top-notch including Snapdragon 888 \nchipset, 5G capability, up to 16gigs of RAM, and 512GB of storage. A 5000mAh battery keeps the lights on for this powerhouse. In the camera department, a quad-camera setup is \npresented with two telephoto sensors. The Samsung Galaxy S21 Ultra starting price is $1200.");
        cpu.process();
    }
}
