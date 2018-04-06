package com.example.SimpleSpringBoot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void shouldReturnDefaultMessage() throws Exception{
        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk()).andExpect(content().string("<!DOCTYPE HTML>\n" +
                "\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Greeting</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>Hello, World!</p>\n" +
                "    </body>\n" +
                "</html>"));
    }

}
