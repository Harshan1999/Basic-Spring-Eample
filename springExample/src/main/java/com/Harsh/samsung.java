package com.Harsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class samsung  {
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
        System.out.println("Samsung Galaxy S20, the smallest of the S20 family, comes with a 6.2-inch display. Under the hood is Snapdragon 865/Exynos 990 chipset with 12GB RAM and 128GB storage.\n The phone is powered by a 4000mAh battery. On the back is situated triple-camera setup: 12MP main sensor, one telephoto, and one ultra-wide camera. \nThe price of the Galaxy S20 is $1000. The phone is available for Verizon with a 5G UW band support but lacks a microSD slot.");
        cpu.process();
    }
}
