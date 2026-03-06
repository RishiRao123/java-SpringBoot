package org.raoamigos.springboot2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private Long id;
    private String name;
    private int age;
    private String email;

}
