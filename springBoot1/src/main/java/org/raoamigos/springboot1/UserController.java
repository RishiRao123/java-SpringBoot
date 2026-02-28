package org.raoamigos.springboot1;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Long, User> users = new HashMap<>();

    @PostMapping
    public User createUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return user;
    }

    @GetMapping
    public Collection<User> getAllUsers() {
        return users.values();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "User deleted";
    }
}
