package com.exemplo.taskmanager.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.localDateTime;

@Entity
@Table(name = "Tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private boolean completed = false;

    @Column (nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}