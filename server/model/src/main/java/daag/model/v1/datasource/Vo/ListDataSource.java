package daag.model.v1.datasource.Vo;

import java.util.Date;

/**
 * Created by yq on 2018/4/2.
 */
public class ListDataSource {

    private Integer id;             // 主键id
    private String username;        // 创建用户
    private String name;            // 名称
    private String url;             // jdbc链接
    private String other;           // 其他
    private String type;            // 数据库类型
    private Date createtime;        // 创建时间
    private Date updatetime;        // 修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
