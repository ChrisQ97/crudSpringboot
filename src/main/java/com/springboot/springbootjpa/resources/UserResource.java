package com.springboot.springbootjpa.resources;

import com.springboot.springbootjpa.models.api.request.UpdateRoleRequest;
import com.springboot.springbootjpa.models.api.response.OkResponse;
import com.springboot.springbootjpa.models.api.response.PostUserResponse;
import com.springboot.springbootjpa.repository.UserRepository;
import com.springboot.springbootjpa.models.api.request.PostUserRequest;
import com.springboot.springbootjpa.models.db.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

@RestController
@RequestMapping(value = "/api")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PostUserResponse createUser(@RequestBody final PostUserRequest request) throws NoSuchAlgorithmException, InvalidKeySpecException {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        User userToSave = new User(request.getRequest().getUser());
        KeySpec spec = new PBEKeySpec(userToSave.getPassword().toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = factory.generateSecret(spec).getEncoded();
        userToSave.setPassword(hash.toString());
        return new PostUserResponse(userRepository.save(userToSave));
    }

    @RequestMapping(value = "/user",  method = RequestMethod.DELETE)
    public OkResponse softDelete(@RequestParam int id) {
        userRepository.updateStatus(id);
        return new OkResponse();
    }

    @RequestMapping(value = "/user",  method = RequestMethod.PATCH,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public OkResponse setRoles(@RequestBody UpdateRoleRequest request){
        userRepository.updateRoleId(request.getRequest().getUser().getId(),
                request.getRequest().getRole().getId());
        return new OkResponse();
    }
}
