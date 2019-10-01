package com.example.springbootmonolith.service;

import com.example.springbootmonolith.config.JwtUtil;
import com.example.springbootmonolith.model.User;
import com.example.springbootmonolith.model.UserRole;
import com.example.springbootmonolith.repository.CourseRepository;
import com.example.springbootmonolith.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

// calling the lbi for Assert of two objects
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    //In mockito based junit tests, @Mock annotation creates mocks and @InjectMocks creates class objects

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRoleService userRoleService;

    @Mock
    private CourseService courseService;

    @Mock
    private CourseRepository courseRepository;

    @Mock
    private JwtUtil jwtUtil;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private User user;

    @Mock
    private UserRole userRole;

    // initialize dummy data
    @Before
    public void initDummyUser() {
        user.setUsername("batman");
        user.setPassword("hello123");
    }

    @Test
    public void createUser_UserMade_Success() {
        when(userRoleService.getRole(anyString())).thenReturn(null);
        String userMade = userService.createUser(user);
        assertEquals(userMade, null);
    }

    @Test
    public void getUser_ReturnUser_Success() {
        // find the user by user name
        // return the user object
        when(userRepository.findByUsername(anyString())).thenReturn(user);

        User tempUser = userService.getUser(user.getUsername());

        assertEquals(tempUser.getUsername(), user.getUsername());
    }


    @Test
    public void login_UserNotFound_Error(){

        when(userRepository.findByUsername(anyString())).thenReturn(null);

        String token = userService.login(user);

        assertEquals(token, null);
    }

 }
