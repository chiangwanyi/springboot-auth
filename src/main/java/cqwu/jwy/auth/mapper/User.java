package cqwu.jwy.auth.mapper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("user_info")
public class User {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String name;
    private String password;
    private int age;
}
