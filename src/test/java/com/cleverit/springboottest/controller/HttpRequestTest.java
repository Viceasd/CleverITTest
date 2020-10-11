package com.cleverit.springboottest.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.cleverit.springboottest.SpringboottestApplicationTests;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class HttpRequestTest extends SpringboottestApplicationTests{

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/test/insert")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"id\":\"adfdkl\",\"patente\":\"GYSS81\"," +
                        "\"tipoAuto\":\"Sedan\",\"color\":\"Rojo\"},{\"id\":\"oUWwGUL\"," +
                        "\"patente\":\"test\",\"tipoAuto\":\"test\",\"color\":\"test\"}," +
                        "{\"id\":\"bc149cj\",\"patente\":\"Auto123\",\"tipoAuto\":\"4x4\"," +
                        "\"color\":\"Plomo\"},{\"id\":\"lDgNoV4\",\"patente\":null," +
                        "\"tipoAuto\":null,\"color\":null}]")));
    }

}
