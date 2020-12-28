package com.jianz.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String id;
    private String username;
    private String password;
    private int type;
}