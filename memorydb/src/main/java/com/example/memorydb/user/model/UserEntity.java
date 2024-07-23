package com.example.memorydb.user.model;

import com.example.memorydb.entity.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity extends Entity {
    private String name;

    private int score;
}
