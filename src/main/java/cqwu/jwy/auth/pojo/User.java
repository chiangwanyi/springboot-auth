package cqwu.jwy.auth.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@TableName("user_info")
@ApiModel(value = "User", description = "用户")
public class User implements Serializable {

    @TableId(type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value = "用户 ID", name = "id", hidden = true, dataType = "String", example = "[uuid]")
    private String id;

    @ApiModelProperty(value = "用户名称", name = "name", required = true, dataType = "String", example = "admin")
    private String name;

    @ApiModelProperty(value = "用户密码", name = "password", required = true, dataType = "String", example = "123456")
    private String password;

    @ApiModelProperty(value = "用户年龄", name = "age", required = true, dataType = "Integer", example = "18")
    private int age;
}
