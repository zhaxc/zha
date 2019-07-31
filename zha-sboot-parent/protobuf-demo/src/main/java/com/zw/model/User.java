package com.zw.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author zha
 */
@Data
@Builder
public class User {

    private Integer id;

    private String name;

    private Integer age;

}
