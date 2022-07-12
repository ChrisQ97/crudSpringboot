package com.springboot.springbootjpa.resources;

import com.springboot.springbootjpa.models.api.request.PostRoleRequest;
import com.springboot.springbootjpa.models.api.response.PostRoleResponse;
import com.springboot.springbootjpa.models.db.Role;
import com.springboot.springbootjpa.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class RoleResource {

    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping(value = "/role", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PostRoleResponse createRole(@RequestBody final PostRoleRequest request) {
        Role roleToSave = new Role(request.getRequest().getRole());
        return new PostRoleResponse(roleRepository.save(roleToSave));
    }




}
