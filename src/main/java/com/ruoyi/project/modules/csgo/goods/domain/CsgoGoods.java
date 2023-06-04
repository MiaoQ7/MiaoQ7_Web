package com.ruoyi.project.modules.csgo.goods.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 饰品库对象 csgo_goods
 * 
 * @author ruoyi
 * @date 2023-06-04
 */
public class CsgoGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 饰品ID */
    private Long goodsId;

    /** 饰品名称 */
    @Excel(name = "饰品名称")
    private String goodsName;

    /** 磨损类型 */
    @Excel(name = "磨损类型")
    private String goodsScuffType;

    /** 饰品类型 */
    @Excel(name = "饰品类型")
    private String goodsType;

    /**  */
    private Long deptId;

    /**  */
    private Long userId;

    public void setGoodsId(Long goodsId)
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId()
    {
        return goodsId;
    }
    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName()
    {
        return goodsName;
    }
    public void setGoodsScuffType(String goodsScuffType)
    {
        this.goodsScuffType = goodsScuffType;
    }

    public String getGoodsScuffType()
    {
        return goodsScuffType;
    }
    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }

    public String getGoodsType()
    {
        return goodsType;
    }
    public void setDeptId(Long deptId)
    {
        this.deptId = deptId;
    }

    public Long getDeptId()
    {
        return deptId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("goodsScuffType", getGoodsScuffType())
            .append("remark", getRemark())
            .append("goodsType", getGoodsType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("deptId", getDeptId())
            .append("userId", getUserId())
            .toString();
    }
}
