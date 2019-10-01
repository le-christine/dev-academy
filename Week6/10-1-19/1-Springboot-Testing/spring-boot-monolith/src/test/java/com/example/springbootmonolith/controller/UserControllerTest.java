package com.example.springbootmonolith.controller;

import com.example.springbootmonolith.config.JwtUtil;
import com.example.springbootmonolith.service.UserService;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
// Autowired is a type of factory design model - we specify what we want to build by passing the obj
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

// tells jUnit to run using Spring's testing support
@RunWith(SpringRunner.class)

// used for auto-configuring Spring MVC and Jackson converters.
// it loads relevant components such as @Controller, @RestController, etc. and configures MockMvc.
@WebMvcTest(UserController.class)
public class UserControllerTest {

    /**Main entry point for server-side Spring MVC test support.**/
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    // this JSON security mock bean is here because we are testing how it handles our requests
    @MockBean
    private JwtUtil jwtUtil;

    @Test
    public void helloWorld_ReturnsString_Success() throws Exception {
        // we use request builder bc we are sending requests to the API
        // we are building a MOCK REQUEST
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/hello")
                .accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!!"));
    }

    @Test
    public void login_Success() throws Exception{

        // mimics our post request
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(createUserInJson("joe","abc"));

        // if success return 123456
        when(userService.login(any())).thenReturn("123456");

        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                // we know we are successful if returns 123456
                .andExpect(content().json("{\"token\":\"123456\"}"))
                .andReturn();

        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void signUp_Success() throws Exception{

        // mimics our post request
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/signup")
                .contentType(MediaType.APPLICATION_JSON)
                //.content(createUserInJson("joe","abc"));
                .content(createUserSignUpInJson("joe","abc", "ROLE_ADMIN"));


        // if success return 123456
        when(userService.createUser(any())).thenReturn("123456789");

        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                // we know we are successful if returns 123456
                .andExpect(content().json("{\"token\":\"123456789\"}"))
                .andReturn();

        System.out.println(result.getResponse().getContentAsString());
    }

    private static String createUserInJson (String name, String password) {
        return "{ \"name\": \"" + name + "\", " +
                "\"password\":\"" + password + "\"}";
    }

    private static String createUserSignUpInJson(String name, String password, String role) throws JSONException {
        JSONObject obj = new JSONObject();
        JSONObject userRole = new JSONObject();
        userRole.put("name", role);
        obj.put("name",  name );
        obj.put("password", password);
        obj.put("userRole", userRole);

      // System.out.println(obj.toString());

        return obj.toString();
//
//        return "{ \"name\": \"" + name + "\", " +
//                "\"password\": \"" + password + "\", " +
//                "\"userRole\": { \"name\":" + "\"" + role + "\"} }";
    }
}
