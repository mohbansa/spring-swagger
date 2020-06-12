package dev.mohini.springswagger.controller;

import dev.mohini.springswagger.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {


    @ApiOperation(value = "Created User")
    @PostMapping
    public String addUser(@RequestBody User user)
    {
        return "Added User !!!";
    }

    @GetMapping
    public List<User> getAllUser()
    {
    return Arrays.asList(new User("Mohini",1), new User("Yash",2));
    }

    @PutMapping
    public String UpdateUser(@RequestBody User user)
    {
        return "Updated User !!!";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable(name="id") int id)
    {
        return "Get User By Id !!!";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable(name="id") int id)
    {
        return "Deleted User !!!";
    }
}
