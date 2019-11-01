package com.zw.entity;

import io.protostuff.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zha
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Tag(1)
    private int userId;

//    @Tag(2)
    private int userTypeId;

//    @Tag(3)
    private String userName;

//    @Tag(4)
//    private Date createDateTime;


}
