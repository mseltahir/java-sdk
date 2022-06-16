/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tuti;

import com.tuti.api.TutiApiClient;
import com.tuti.api.authentication.UserCredentials;


import com.tuti.api.authentication.AuthenticationResponse;
import com.tuti.api.authentication.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class ApiTest {
     static TutiApiClient client;

    @BeforeAll
    static void setup(){
        client = new TutiApiClient(true);
    }
    @Test
     void testSignInApi(){
        AuthenticationResponse response = client.SignIn(new UserCredentials("adonese","12345678"));
        User user = response.getUser();
        assertEquals("adonese",user.getUsername());
        assertEquals("Mohamed Yousif",user.getFullname());
        assertEquals("mmbusif@gmail.com",user.getEmail());
        assertEquals("0925343834",user.getMobileNumber());
        assertEquals(true,user.getIsMerchant());
        assertEquals(0,user.getId());
    }
}
