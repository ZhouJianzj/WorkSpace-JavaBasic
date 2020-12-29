package com.jianz.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Linkman
 * @Description TODO
 * @Author
 * @Date 2020/12/29
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Linkman {
    public String id;
    public String name ;
    public String dep;
    public String protype;
    public String planid;
    public String salary;

}
