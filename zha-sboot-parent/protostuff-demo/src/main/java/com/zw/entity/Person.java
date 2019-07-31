package com.zw.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;

    /**
     * 姓名（必需）
     */
    private String name;

    /**
     * email（可选）
     */
    private String email;

    /**
     * 朋友（集合）
     */
    private List<String> friends;

}
