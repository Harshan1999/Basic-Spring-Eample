package com.Harsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class samsungS20FE  {
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
        System.out.println("Samsung Galaxy S20 FE (Fan Edition) is the successor of Galaxy S10 Lite. Specifications include a 6.5-inch FHD+ display, Snapdragon 865 chipset with 6GB/8GB RAM and 128GB/256GB \nstorage, and 4500 battery. There is a triple-camera setup on the back, with the same main sensor found in regular Galaxy S20. The phone is available with 5G support or LTE only. \nThe Samsung Galaxy S20 FE price is $699.");
        cpu.process();
    }
}
