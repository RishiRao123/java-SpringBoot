package org.raoamigos.springboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {

        User user = userService.getUserById(id);

        return ResponseEntity.ok(
                new UserDTO(user.getId(), user.getName(), user.getAge(), user.getEmail())
        );
    }

    @GetMapping("/user")
    public List<UserDTO> getUsers() {

        return userService.getAllUsers()
                .stream()
                .map(user -> new UserDTO(
                        user.getId(),
                        user.getName(),
                        user.getAge(),
                        user.getEmail()))
                .toList();
    }

    @PostMapping("/user")
    public UserDTO createUser(@RequestBody User user) {

        User savedUser = userService.createUser(user);

        return new UserDTO(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getAge(),
                savedUser.getEmail()
        );
    }

    @PutMapping("/user/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody User user) {

        User updatedUser = userService.updateUser(id, user);

        return new UserDTO(
                updatedUser.getId(),
                updatedUser.getName(),
                updatedUser.getAge(),
                updatedUser.getEmail()
        );
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}