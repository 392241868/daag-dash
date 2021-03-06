package daag.dao.mapper.v1.user;

import daag.dao.mapper.v1.user.provider.SysRoleProvider;
import daag.model.v1.user.SysRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yq on 2018/3/14.
 */
@Mapper
public interface SysRoleMapper {

    @Select("select r.* from sys_role r join sys_user_role ur on r.id = ur.role_id where ur.user_id = #{userId}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "id",property = "permissionList",javaType = List.class,
                    many = @Many(select = "daag.dao.mapper.v1.user.SysPermissionMapper.findByRoleId"))
    })
    List<SysRole> findByUserId(Integer user_id);

    @InsertProvider(type = SysRoleProvider.class,method = "addAll")
    int addAll(@Param("user_id") Integer user_id, @Param("role_ids") String[] role_ids);

    @Delete("delete from sys_user_role where user_id = #{user_id}")
    int deleteByUserId(Integer user_id);
}
