package com.aurora.learning;

import com.aurora.learning.future.FutureExample;
import com.aurora.learning.opencv.Test;
import com.aurora.learning.wheelTimer.WheelTimerExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
        System.out.println("service starting ... ... ...");

//        FutureExample.test();
//
//        WheelTimerExample.test2();

        Test test = new Test();
        test.test();

    }

}
