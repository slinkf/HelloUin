package com.uin.src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SrcApplication {

    public static void main(String[] args) {
        AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);

        SpringApplication
                .run(SrcApplication.class, args);
    }

}
